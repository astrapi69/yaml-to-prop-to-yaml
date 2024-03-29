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
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import io.github.astrapi69.prop.to.yaml.PropertiesToYamlConverter;

/**
 * The class {@link PropertiesToYamlExtensions} provides methods for convert properties to yaml
 * files
 */
public final class PropertiesToYamlExtensions
{

	private PropertiesToYamlExtensions()
	{
	}

	/**
	 * Converts the given properties file to a yaml string
	 *
	 * @param propertiesFile
	 *            the properties file
	 * @return the yaml string
	 */
	public static String toYamlString(final File propertiesFile)
	{
		Objects.requireNonNull(propertiesFile);
		return PropertiesToYamlConverter.convert(propertiesFile);
	}

	/**
	 * Converts the given properties object to a yaml string
	 *
	 * @param properties
	 *            the properties
	 * @return the yaml string
	 */
	public static String toYamlString(final Properties properties)
	{
		Objects.requireNonNull(properties);
		return PropertiesToYamlConverter.convert(properties);
	}

	/**
	 * Converts the given {@link String} object that represents a properties object to a yaml string
	 *
	 * @param propertiesAsString
	 *            the properties as {@link String} object
	 * @return the yaml string
	 */
	public static String toYamlString(final String propertiesAsString)
	{
		Objects.requireNonNull(propertiesAsString);
		return PropertiesToYamlConverter.convert(propertiesAsString);
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
	public static void toYamlFile(final File propertiesFile, final File newYamlFileToWrite)
		throws IOException
	{
		Objects.requireNonNull(propertiesFile);
		Objects.requireNonNull(newYamlFileToWrite);
		String yamlString = toYamlString(propertiesFile);
		FileUtils.writeStringToFile(newYamlFileToWrite, yamlString, StandardCharsets.UTF_8);
	}

}
