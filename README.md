# Java / Kotlin IOF XML

Java classes for IOF XML version 2 and 3. Also marshal and unmarshal helper functions for both XML versions.

The folder [./src/main/java](./src/main/java) contains Java files generated from the XSD files for IOF v2 and v3.
They are generated with the Gradle task `addXjcTask` in `build.gradle` (can be run with the task `generateSources`).

Original XSD files that the Java classes are generated from:

* [iof_v2.xsd](src/main/resources/iof_v2.xsd) (converted from [IOFdata.dtd](src/main/resources/IOFdata.dtd))
* [iof_v3.xsd](src/main/resources/iof_v3.xsd)

## Install and usage

### Install

Install the project by adding the dependency to your pom.xml or build.gradle file.

**pom.xml:**
```xml
<!-- ... -->
  <dependencies>
    <dependency>
      <groupId>io.github.orienteering-oss</groupId>
      <artifactId>iofXml</artifactId>
      <version>1.1</version>
    </dependency>
  </dependencies>
<!-- ... -->
```

**build.gradle:**
```groovy
  implementation group: 'io.github.orienteering-oss', name: 'iofXml', version: '1.1'
```

### Usage

```kotlin
import iofXml.marshallIofV3
import iofXml.unmarshalGenericIofV3
import iofXml.v3.StartTimeAllocationRequest

fun main(args: Array<String>) {
  // Generic unmarshal, Triple with 'Any' type:
  val (obj, xmlTypeName, reflectionClass) = unmarshalGenericIofV3(classListExampleXml)

  // Specific unmarshal / deserialize:
  val classList = unmarshalIofV3ClassList(classListExampleXml)
  println(classList.clazz.first().name)
  // prints: Men Open

  // Marshal / serialize:
  println(marshallIofV3(classList))
  // prints original XML file

  // Create object of IOF v3 class:
  StartTimeAllocationRequest()
}

var classListExampleXml = """
    <?xml version="1.0" encoding="utf-8"?>
    <!--
      Class information for a relay event.
    -->
    <ClassList xmlns="http://www.orienteering.org/datastandard/3.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" iofVersion="3.0" createTime="2011-07-20T12:16:31+01:00" creator="Example Software">
      <!-- there are 35 teams taking part in this class -->
      <Class numberOfCompetitors="35">
        <Id>1</Id>
        <Name>Men Open</Name>
        <!-- this class has three legs, each one represented by a Leg element -->
        <!-- the first leg is run by one competitor, which means that no minNumberOfCompetitors or maxNumberOfCompetitors are present since they default to 1 -->
        <Leg/>
        <!-- the second leg is run by one to three competitors in parallel -->
        <Leg maxNumberOfCompetitors="3"/>
        <!-- the third leg is run by one competitor -->
        <Leg/>
      </Class>
    </ClassList>
""".trimIndent()
```

## Development with Gradle

### Run project

```shell
gradle run
```

### Run tests

```shell
gradle test
```

### (Re-)generate Java sources from XSD files

```shell
gradle generateSources
```

### Upload to maven central

(Remember to put a file `gradle.properties` with the required fields (GPG-key and ossrh username and password))

```shell
gradle uploadArchives
```

After upload, follow [the release process](https://central.sonatype.org/publish/release/).

## Related

* C# classes for IOF XML v3: [github.com/international-orienteering-federation/Dotnet-Client-IOF.XML.V3](https://github.com/international-orienteering-federation/Dotnet-Client-IOF.XML.V3)
* IOF repository for
  * [v2 datastandard](https://github.com/international-orienteering-federation/datastandard-v2)
  * [v3 datastandard](https://github.com/international-orienteering-federation/datastandard-v3)
