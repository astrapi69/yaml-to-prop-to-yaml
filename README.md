# Overview

<div align="center">

[![Build Status](https://travis-ci.org/astrapi69/yaml-to-prop-to-yaml.svg?branch=develop)](https://travis-ci.org/astrapi69/yaml-to-prop-to-yaml)
[![Coverage Status](https://codecov.io/gh/astrapi69/yaml-to-prop-to-yaml/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/yaml-to-prop-to-yaml)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/yaml-to-prop-to-yaml.svg?style=flat)](https://github.com/astrapi69/yaml-to-prop-to-yaml/issues) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/yaml-to-prop-to-yaml/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/yaml-to-prop-to-yaml)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Javadoc](http://www.javadoc.io/badge/de.alpharogroup/yaml-to-prop-to-yaml.svg)](http://www.javadoc.io/doc/de.alpharogroup/yaml-to-prop-to-yaml)

</div>

The target of yaml-to-prop-to-yaml project provides a two way converter for convert yaml files to properties and properties back to yaml files

If you like this project put a ⭐ and donate

## Note

No animals were harmed in the making of this library

# Donations

This project is kept as an open source product and relies on contributions to remain being developed. 
If you like this project, please consider a donation through paypal: <a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8" target="_blank">
<img src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_donateCC_LG.gif" alt="PayPal this" title="PayPal – The safer, easier way to pay online!" border="0" />
</a>

or over bitcoin or bitcoin-cash with:

1Jzso5h7U82QCNmgxxSCya1yUK7UVcSXsW

or over ether with:

0xaB6EaE10F352268B0CA672Dd6e999C86344D49D8

or over the donation buttons at the top.

## Key features:

 * Converts yaml files to properties files or properties object
 * Converts properties files to yaml files or yaml object
  
## License

The source code comes under the liberal MIT License, making yaml-to-prop-to-yaml great for all types of applications.

## Maven dependency

Maven dependency is now available on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;quick~yaml-to-prop-to-yaml) for latest snapshots and releases.

You can first define the version properties and add than the following maven dependency to your project `pom.xml` if you want to import the core functionality of yaml-to-prop-to-yaml:

	<properties>
			...
		<!-- YAML-TO-PROP-TO-YAML version -->
		<yaml-to-prop-to-yaml.version>1.1</yaml-to-prop-to-yaml.version>
			...
	</properties>
			...
		<dependencies>
			...
			<!-- YAML-TO-PROP-TO-YAML DEPENDENCY -->
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>yaml-to-prop-to-yaml</artifactId>
				<version>${yaml-to-prop-to-yaml.version}</version>
			</dependency>
			...
		</dependencies>	
			
## gradle dependency

You can first define the version in the ext section and add than the following gradle dependency to your project `build.gradle` if you want to import the core functionality of yaml-to-prop-to-yaml:

```
ext {
			...
    yamlToPropToYamlVersion = "1.1"
			...
}
dependencies {
			...
compile "de.alpharogroup:yaml-to-prop-to-yaml:${yamlToPropToYamlVersion}"
			...
}
```

## Semantic Versioning

The versions of yaml-to-prop-to-yaml are maintained with the Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning you can visit the [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Semantic-Versioning).

## Want to Help and improve it? ###

The source code for yaml-to-prop-to-yaml are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/yaml-to-prop-to-yaml/fork](https://github.com/astrapi69/yaml-to-prop-to-yaml/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/yaml-to-prop-to-yaml/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developer

Do not hesitate to contact the yaml-to-prop-to-yaml developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/astrapi69/yaml-to-prop-to-yaml/issues).

## Credits

|**Travis CI**|
|     :---:      |
|[![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)]|
|[![Build Status](https://travis-ci.org/astrapi69/yaml-to-prop-to-yaml.svg?branch=master)](https://travis-ci.org/astrapi69/yaml-to-prop-to-yaml)|
|Special thanks to [Travis CI](https://travis-ci.org) for providing a free continuous integration service for open source projects|
|     <img width=1000/>     |

|**Nexus Sonatype repositories**|
|     :---:      |
|[![sonatype repository](https://img.shields.io/nexus/r/https/oss.sonatype.org/de.alpharogroup/yaml-to-prop-to-yaml.svg?style=for-the-badge)](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~yaml-to-prop-to-yaml~~~) yaml-to-prop-to-yaml|
|Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects|
|     <img width=1000/>     |

|**codecov.io**|
|     :---:      |
|[![Coverage Status](https://codecov.io/gh/astrapi69/yaml-to-prop-to-yaml/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/yaml-to-prop-to-yaml)|
|Special thanks to [codecov.io](https://codecov.io) for providing a free code coverage for open source projects|
|     <img width=1000/>     |

|**javadoc.io**|
|     :---:      |
|[![Javadoc](http://www.javadoc.io/badge/de.alpharogroup/yaml-to-prop-to-yaml.svg)](http://www.javadoc.io/doc/de.alpharogroup/yaml-to-prop-to-yaml) yaml-to-prop-to-yaml|
|Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects|
|     <img width=1000/>     |

