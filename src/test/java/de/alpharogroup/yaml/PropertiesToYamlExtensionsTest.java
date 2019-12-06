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

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.io.FileUtils;
import org.meanbean.test.BeanTestException;
import org.meanbean.test.BeanTester;
import org.testng.annotations.Test;

import de.alpharogroup.crypto.file.checksum.FileChecksumExtensions;
import de.alpharogroup.file.search.PathFinder;

/**
 * The unit test class for the class {@link PropertiesToYamlExtensions}
 */
public class PropertiesToYamlExtensionsTest
{

	/**
	 * Test method for {@link PropertiesToYamlExtensions#toYamlFile(File, File)}
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred
	 */
	@Test
	public void testToYamlFile() throws IOException
	{
		long expected;
		long actual;
		File propertiesFile = new File(PathFinder.getSrcTestResourcesDir(), "config.properties");
		File yamlFile = new File(PathFinder.getSrcTestResourcesDir(), "config.yml");
		PropertiesToYamlExtensions.toYamlFile(propertiesFile, yamlFile);
		actual = FileChecksumExtensions.getChecksum(yamlFile, true);
		expected = 3250500933L;
		assertEquals(actual, expected);
		FileUtils.deleteQuietly(yamlFile);
	}

	/**
	 * Test method for {@link PropertiesToYamlExtensions#toYamlString(File)}
	 */
	@Test
	public void testToYamlString()
	{
		String expected;
		String actual;
		File propertiesFile = new File(PathFinder.getSrcTestResourcesDir(), "config.properties");
		actual = PropertiesToYamlExtensions.toYamlString(propertiesFile);
		expected = "application:\n" + "  http:\n" + "    port  :  18080\n" + "  https:\n"
			+ "    port :  18443\n" + "configuration:\n" + "  type:  DEVELOPMENT\n"
			+ "version: ${project.version}\n";
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link PropertiesToYamlExtensions} with {@link BeanTester}
	 */
	@Test(expectedExceptions = { BeanTestException.class, InvocationTargetException.class,
			UnsupportedOperationException.class })
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(PropertiesToYamlExtensions.class);
	}
}