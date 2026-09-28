# Java / Kotlin IOF XML

Java classes for IOF XML version 2 and 3. Also marshal and unmarshal helper functions for both XML versions.

The folder [./src/main/java](./src/main/java) contains Java files generated from the XSD files for IOF v2 and v3.
They are generated with the Gradle task `addXjcTask` in [`build.gradle`](./build.gradle) (can be run with the 
task `generateSources`).

Original XSD files that the Java classes are generated from:

* [iof_v2.xsd](src/main/resources/iof_v2.xsd) (converted from [IOFdata.dtd](src/main/resources/IOFdata.dtd))
* [iof_v3.xsd](src/main/resources/iof_v3.xsd)

See also generated documentation from the source code:
* Javadoc: <https://orienteering-oss.github.io/iof-xml>
* Dokka Kotlin: <https://orienteering-oss.github.io/iof-xml/kotlin>

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
      <version>1.5.1</version>
    </dependency>
  </dependencies>
<!-- ... -->
```

**build.gradle:**
```groovy
  implementation group: 'io.github.orienteering-oss', name: 'iofXml', version: '1.5.1'
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

Use JDK 17 or a newer JDK supported by the Gradle wrapper; the library targets Java 17.

### Run project

```shell
./gradlew run
```

### Run tests

```shell
./gradlew test
```

### (Re-)generate Java sources from XSD files

```shell
./gradlew generateSources
```

### Publish a release to Maven Central

1. Set a non-`SNAPSHOT` version in `build.gradle` and update both install examples above to match.
   Commit the release changes before publishing.
2. Verify access to `io.github.orienteering-oss` in the [Central Portal namespaces](https://central.sonatype.com/publishing/namespaces) and generate a [Portal user token](https://central.sonatype.com/usertoken).
3. Add the token and [GPG signing credentials](https://docs.gradle.org/current/userguide/signing_plugin.html#sec:signatory_credentials) to `~/.gradle/gradle.properties`:

   ```properties
   mavenCentralUsername=PORTAL_TOKEN_USERNAME
   mavenCentralPassword=PORTAL_TOKEN_PASSWORD
   signing.keyId=LAST_8_HEX_DIGITS_OF_GPG_KEY_ID
   signing.password=GPG_KEY_PASSPHRASE
   signing.secretKeyRingFile=/absolute/path/to/secring.gpg
   ```

   Use Portal token credentials instead of the old `ossrhUsername` and `ossrhPassword` properties.
   Keep credentials outside Git and [publish your GPG public key](https://central.sonatype.org/publish/requirements/gpg/#distributing-your-public-key).
4. Run the publishing task from the release commit:

   ```shell
   ./gradlew clean publishAggregationToCentralPortal
   ```

   Gradle runs the project checks, builds and signs the artifacts, uploads them through the Central Portal API, and automatically publishes after validation.
   It waits up to 30 minutes for publication to finish.
   Check the [Portal deployments](https://central.sonatype.com/publishing/deployments) for status and validation errors; published versions cannot be overwritten.
5. Create the matching Git tag and GitHub release from the same commit if they do not already exist.

To inspect the signed bundle locally before uploading, run `./gradlew nmcpZipAggregation` and inspect `build/nmcp/zip/aggregation.zip`.

## Related

* C# classes for IOF XML v3: [github.com/international-orienteering-federation/Dotnet-Client-IOF.XML.V3](https://github.com/international-orienteering-federation/Dotnet-Client-IOF.XML.V3)
* IOF repository for
  * [v2 datastandard](https://github.com/international-orienteering-federation/datastandard-v2)
  * [v3 datastandard](https://github.com/international-orienteering-federation/datastandard-v3)
