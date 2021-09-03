# Java IOF XML

Java classes for IOF XML version 2 and 3. Also marshall and unmarshall helper functions for both XML versions.

The folder [./src/main/java](./src/main/java) contains Java files generated from the XSD files for IOF v2 and v3. They are generated at build time with the Gradle task `addXjcTask` in `build.gradle`.

Original XSD files that the Java classes are generated from:

* [iof_v2.xsd](src/main/resources/iof_v2.xsd) (converted from [IOFdata.dtd](src/main/resources/IOFdata.dtd))
* [iof_v3.xsd](src/main/resources/iof_v3.xsd)

## Gradle

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

## Related

* C# classes for IOF XML v3: [github.com/international-orienteering-federation/Dotnet-Client-IOF.XML.V3](https://github.com/international-orienteering-federation/Dotnet-Client-IOF.XML.V3)
* IOF repository for
  * [v2 datastandard](https://github.com/international-orienteering-federation/datastandard-v2)
  * [v3 datastandard](https://github.com/international-orienteering-federation/datastandard-v3)
