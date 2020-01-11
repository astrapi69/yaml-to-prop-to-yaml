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
import java.nio.charset.StandardCharsets;

import de.alpharogroup.prop.to.yaml.PropertiesToYamlConverter;
import org.apache.commons.io.FileUtils;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

/**
 * The class {@link PropertiesToYamlExtensions} provides methods for convert properties to yaml
 * files
 */
@UtilityClass
public class PropertiesToYamlExtensions
{

	/**
	 * Converts the given properties file to a yaml string
	 *
	 * @param propertiesFile
	 *            the properties file
	 * @return the yaml string
	 */
	public static String toYamlString(final @NonNull File propertiesFile)
	{
		return PropertiesToYamlConverter.convert(propertiesFile);
	}

	/**
	 * Resolves the properties file from the given file name and converts it to a yaml string
	 *
	 * @param propertiesFile
	 *            the properties filename
	 * @return the yaml string
	 */
	public static String toYamlStringFromFile(final @NonNull File propertiesFile)
	{
		return PropertiesToYamlConverter.convert(propertiesFile);
	}

	/**
	 * Converts the given properties file to a given new yaml file
	 *
	 * @param propertiesFile
	 *            the properties file
	 * @param newYamlFileToWrite
	 *            the new yaml file to write
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 */
	public static void toYamlFile(final @NonNull File propertiesFile,
		final @NonNull File newYamlFileToWrite) throws IOException
	{
		String yamlString = toYamlStringFromFile(propertiesFile);
		FileUtils.writeStringToFile(newYamlFileToWrite, yamlString, StandardCharsets.UTF_8);
	}

}
