# Overview

<div style="text-align: center">

[![Java CI with Gradle](https://github.com/astrapi69/yaml-to-prop-to-yaml/actions/workflows/gradle.yml/badge.svg)](https://github.com/astrapi69/yaml-to-prop-to-yaml/actions/workflows/gradle.yml)
[![Coverage Status](https://codecov.io/gh/astrapi69/yaml-to-prop-to-yaml/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/yaml-to-prop-to-yaml)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/yaml-to-prop-to-yaml.svg?style=flat)](https://github.com/astrapi69/yaml-to-prop-to-yaml/issues)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/yaml-to-prop-to-yaml/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/yaml-to-prop-to-yaml)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Javadoc](http://www.javadoc.io/badge/io.github.astrapi69/yaml-to-prop-to-yaml.svg)](http://www.javadoc.io/doc/io.github.astrapi69/yaml-to-prop-to-yaml)

</div>

The target of yaml-to-prop-to-yaml project provides a two way converter for convert yaml files to properties and properties back to yaml files

If you like this project put a ⭐ and donate

## Note

No animals were harmed in the making of this library

## gradle dependency

You can first define the version in ypur gradle.properties or in the ext section and add than the
following gradle dependency to your project `build.gradle` if you want to import the core
functionality of yaml-to-prop-to-yaml:

define version in file gradle.properties

```
yamlToPropToYamlVersion=2
```

or in build.gradle ext area

```
    yamlToPropToYamlVersion = "2"
```

and then add the dependency to the dependencies area

```
compile "io.github.astrapi69:yaml-to-prop-to-yaml:${yamlToPropToYamlVersion}"
```

## Maven dependency

Maven dependency is now available on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;quick~yaml-to-prop-to-yaml) for latest snapshots and releases.

You can first define the version properties and add than the following maven dependency to your project `pom.xml` if you want to import the core functionality of yaml-to-prop-to-yaml:

    <properties>
            ...
        <!-- YAML-TO-PROP-TO-YAML version -->
        <yaml-to-prop-to-yaml.version>2</yaml-to-prop-to-yaml.version>
            ...
    </properties>
            ...
        <dependencies>
            ...
            <!-- YAML-TO-PROP-TO-YAML DEPENDENCY -->
            <dependency>
                <groupId>io.github.astrapi69</groupId>
                <artifactId>yaml-to-prop-to-yaml</artifactId>
                <version>${yaml-to-prop-to-yaml.version}</version>
            </dependency>
            ...
        </dependencies>

# Donations

This project is kept as an open source product and relies on contributions to remain being developed. If you like this
library, please consider a donation

over paypal: <br><br>
<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=MJ7V43GU2H386" target="_blank">
<img src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_donateCC_LG.gif" alt="PayPal this" title="PayPal – The safer, easier way to pay online!" style="border: none" />
</a>
<br><br>
or over bitcoin(BTC) with this address:

bc1ql2y99q7e8psndhcc3gferk03esw3qqf677rhjy

<img
src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/bc1ql2y99q7e8psndhcc3gferk03esw3qqf677rhjy.png"
alt="Donation Bitcoin Wallet" width="250"/>

or over FIO with this address:

FIO7tFMUVAA9cHiPPqKMfMXiSxHrbpiFyRYqTketNuM67aULuwjop

<img
src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/FIO7tFMUVAA9cHiPPqKMfMXiSxHrbpiFyRYqTketNuM67aULuwjop.png"
alt="Donation FIO Wallet" width="250"/>

or over Ethereum(ETH) with:

0xc057D159D3C8f3311E73568b334FF6fE82EB2b7D

<img
src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/0xc057D159D3C8f3311E73568b334FF6fE82EB2b7D.png"
alt="Donation Ethereum Wallet" width="250"/>

or over Ethereum Classic(ETC) with:

0xF708cA86D86C246B69c3F4BAe431eBbe0c2bfddD

<img
src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/0xF708cA86D86C246B69c3F4BAe431eBbe0c2bfddD.png"
alt="Donation Ethereum Classic Wallet" width="250"/>

or over Dogecoin(DOGE) with:

D5yi4Um8cpakd6yPRm2hGWuQ5nrVzhSSW1

<img
src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/D5yi4Um8cpakd6yPRm2hGWuQ5nrVzhSSW1.png"
alt="Donation Dogecoin Wallet" width="250"/>

or over Monero(XMR) with:

49bqeRQ7Bf49oJFVC72pqpe5hFbb62pfXDYPdLsadGGF81KZW2ZfrPZ8PbAVu5X2v1TYAspeczMya3cYQysNS4usRRPQHVw

<img
src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/49bqeRQ7Bf49oJFVC72pqpe5hFbb62pfXDYPdLsadGGF81KZW2ZfrPZ8PbAVu5X2v1TYAspeczMya3cYQysNS4usRRPQHVw.png"
alt="Donation Monero Wallet" width="250"/>

or over flattr:

<a href="http://flattr.com/thing/4067696/astrapi69yaml-to-prop-to-yaml-on-GitHub" target="_blank">
<img src="http://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" style="border: none" />
</a>

## Key features:

 * Converts yaml files to properties files or properties object
 * Converts properties files to yaml files or yaml object

## License

The source code comes under the liberal MIT License, making yaml-to-prop-to-yaml great for all types of applications.


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

# Similar projects

Here is a list of awesome projects:

* [properties-to-yaml-converter](https://github.com/anubhavshukla/properties-to-yaml-converter) Java implementation to convert Properties files to Yaml
* []()

## Credits

|**Travis CI**|
|     :---:      |
|[![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)]|
|[![Build Status](https://travis-ci.org/astrapi69/yaml-to-prop-to-yaml.svg?branch=master)](https://travis-ci.org/astrapi69/yaml-to-prop-to-yaml)|
|Special thanks to [Travis CI](https://travis-ci.org) for providing a free continuous integration service for open source projects|
|     <img width=1000/>     |

|**Nexus Sonatype repositories**|
|     :---:      |
|[![sonatype repository](https://img.shields.io/nexus/r/https/oss.sonatype.org/io.github.astrapi69/yaml-to-prop-to-yaml.svg?style=for-the-badge)](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~yaml-to-prop-to-yaml~~~) yaml-to-prop-to-yaml|
|Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects|
|     <img width=1000/>     |

|**codecov.io**|
|     :---:      |
|[![Coverage Status](https://codecov.io/gh/astrapi69/yaml-to-prop-to-yaml/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/yaml-to-prop-to-yaml)|
|Special thanks to [codecov.io](https://codecov.io) for providing a free code coverage for open source projects|
|     <img width=1000/>     |

|**javadoc.io**|
|     :---:      |
|[![Javadoc](http://www.javadoc.io/badge/io.github.astrapi69/yaml-to-prop-to-yaml.svg)](http://www.javadoc.io/doc/io.github.astrapi69/yaml-to-prop-to-yaml) yaml-to-prop-to-yaml|
|Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects|
|     <img width=1000/>     |
