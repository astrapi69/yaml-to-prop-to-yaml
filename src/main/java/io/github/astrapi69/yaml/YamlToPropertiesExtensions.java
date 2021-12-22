/**
 * The MIT License
 *
 * Copyright (C) 2021 Asterios Raptis
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
package io.github.astrapi69.yaml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;
import org.yaml.snakeyaml.Yaml;

import io.github.astrapi69.resourcebundle.properties.PropertiesFileExtensions;

/**
 * The class {@link YamlToPropertiesExtensions} provides methods for convert yaml files to
 * properties
 */
public final class YamlToPropertiesExtensions
{
	/** The Constant YAML_CONVERTER. */
	private static final Yaml YAML_CONVERTER = new Yaml();

	private YamlToPropertiesExtensions()
	{
	}

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
		Objects.requireNonNull(yamlFilename);
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
	public static TreeMap<String, Object> toTreeMap(Path path) throws IOException
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
	@SuppressWarnings("unchecked")
	private static String toPropertyEntries(TreeMap<String, Object> treeMap,
		String propertiesDelimiter)
	{
		StringBuilder sb = new StringBuilder();
		for (String key : treeMap.keySet())
		{
			Object object = treeMap.get(key);
			if (object instanceof String)
			{
				String stringObject = (String)object;
				sb.append(key).append(propertiesDelimiter).append(stringObject).append("\n");
			}
			if (object instanceof Map)
			{
				Map<String, Object> stringObjectMap = ((Map<String, Object>)object);
				sb.append(toEntry(key, stringObjectMap, propertiesDelimiter));
			}
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
			Object object = map.get(mapKey);
			if (object instanceof Map)
			{
				Map<String, Object> castedMap = (Map<String, Object>)object;
				sb.append(toEntry(key + "." + mapKey, castedMap, propertiesDelimiter));
			}
			else
			{
				String value = object.toString();
				sb.append(key).append(".").append(mapKey).append(propertiesDelimiter).append(value)
					.append("\n");
			}
		}
		return sb.toString();
	}

}
