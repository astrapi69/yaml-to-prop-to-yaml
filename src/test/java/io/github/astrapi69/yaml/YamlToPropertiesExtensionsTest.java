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

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import io.github.astrapi69.file.read.ReadFileExtensions;
import io.github.astrapi69.file.search.PathFinder;

/**
 * The unit test class for the class {@link YamlToPropertiesExtensions}
 */
public class YamlToPropertiesExtensionsTest
{

	/**
	 * Test method for {@link YamlToPropertiesExtensions#toProperties(File)}
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 */
	@Test
	public void testYamlFileToProperties() throws IOException
	{
		int expected;
		int actual;
		File yamlFile = new File(PathFinder.getSrcTestResourcesDir(), "application.yml");
		Properties properties = YamlToPropertiesExtensions.toProperties(yamlFile);
		actual = properties.size();
		expected = 15;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link YamlToPropertiesExtensions#toProperties(String)}
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 */
	@Test
	public void testToPropertiesFromFilename() throws IOException
	{
		int expected;
		int actual;
		File yamlFile = new File(PathFinder.getSrcTestResourcesDir(), "application.yml");
		Properties properties = YamlToPropertiesExtensions.toProperties(yamlFile.getAbsolutePath());
		actual = properties.size();
		expected = 15;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link YamlToPropertiesExtensions#toPropertiesFromYamlString(String)}
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 */
	@Test
	public void testToPropertiesFromYamlString() throws IOException
	{
		int expected;
		int actual;
		File yamlFile;
		Properties properties;

		yamlFile = new File(PathFinder.getSrcTestResourcesDir(), "application.yml");
		properties = YamlToPropertiesExtensions
			.toPropertiesFromYamlString(ReadFileExtensions.fromFile(yamlFile));
		actual = properties.size();
		expected = 15;
		assertEquals(actual, expected);

		yamlFile = new File(PathFinder.getSrcTestResourcesDir(), "multiline-values.yaml");
		properties = YamlToPropertiesExtensions
			.toPropertiesFromYamlString(ReadFileExtensions.fromFile(yamlFile));
		actual = properties.size();
		expected = 4;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link YamlToPropertiesExtensions} with {@link BeanTester}
	 */
	@Test
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(YamlToPropertiesExtensions.class);
	}

}
