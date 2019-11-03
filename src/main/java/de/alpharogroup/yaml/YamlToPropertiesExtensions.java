/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.yaml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import de.alpharogroup.resourcebundle.properties.PropertiesFileExtensions;
import org.apache.commons.io.FileUtils;
import org.yaml.snakeyaml.Yaml;

import lombok.experimental.UtilityClass;

/**
 * The class {@link YamlToPropertiesExtensions} provides methods for convert yaml files to
 * properties
 */
@UtilityClass
public class YamlToPropertiesExtensions
{

	/** The Constant YAML_CONVERTER. */
	private static final Yaml YAML_CONVERTER = new Yaml();

	/**
	 * To properties.
	 *
	 * @param yamlFilename
	 *            the yaml filename
	 * @return the properties
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 */
	public static Properties toProperties(String yamlFilename) throws IOException
	{
		String propertiesAsString = toPropertyEntries(toTreeMap(Paths.get(yamlFilename)), "=");
		File file = File.createTempFile("properties", null);
		FileUtils.writeStringToFile(file, propertiesAsString, StandardCharsets.UTF_8);
		return PropertiesFileExtensions.loadProperties(file);
	}

	/**
	 * To tree map.
	 *
	 * @param path
	 *            the path
	 * @return the tree map
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 */
	@SuppressWarnings("unchecked")
	public static TreeMap<String, Map<String, Object>> toTreeMap(Path path) throws IOException
	{
		try (InputStream inputStream = Files.newInputStream(path))
		{
			return YAML_CONVERTER.loadAs(inputStream, TreeMap.class);
		}
	}

	/**
	 * To property entries.
	 *
	 * @param treeMap
	 *            the tree map
	 * @param propertiesDelimiter
	 *            the properties delimiter
	 * @return the string
	 */
	private static String toPropertyEntries(TreeMap<String, Map<String, Object>> treeMap,
		String propertiesDelimiter)
	{
		StringBuilder sb = new StringBuilder();
		for (String key : treeMap.keySet())
		{
			sb.append(toEntry(key, treeMap.get(key), propertiesDelimiter));
		}
		return sb.toString();
	}

	/**
	 * Converts from the given arguments a property entry
	 *
	 * @param key
	 *            the key
	 * @param map
	 *            the map
	 * @param propertiesDelimiter
	 *            the properties delimiter
	 * @return the property entry as string
	 */
	@SuppressWarnings("unchecked")
	private static String toEntry(String key, Map<String, Object> map, String propertiesDelimiter)
	{
		StringBuilder sb = new StringBuilder();
		for (String mapKey : map.keySet())
		{
			if (map.get(mapKey) instanceof Map)
			{
				sb.append(toEntry(key + "." + mapKey, (Map<String, Object>)map.get(mapKey),
					propertiesDelimiter));
			}
			else
			{
				sb.append(key).append(".").append(mapKey).append(propertiesDelimiter)
					.append(map.get(mapKey).toString()).append("\n");
			}
		}
		return sb.toString();
	}

}