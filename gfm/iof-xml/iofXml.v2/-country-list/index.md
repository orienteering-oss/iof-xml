//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[CountryList](index.md)

# CountryList

[jvm]\
open class [CountryList](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}IOFVersion" minOccurs="0"/&gt; &lt;element ref="{}Country" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [country](country.md) | [jvm]<br>protected open val [country](country.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Country](../-country/index.md)> |
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [IOFVersion](../-i-o-f-version/index.md) |
