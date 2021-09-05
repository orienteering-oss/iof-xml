# Data schema resources

The file [iof_v2.xsd](./iof_v2.xsd) is converted from [IOFdata.dtd](./IOFdata.dtd)
with [trang.jar](https://relaxng.org/jclark/trang-manual.html) (see also 
[GitHub repo](https://github.com/relaxng/jing-trang)).

The schema [IOFdata.dtd](./IOFdata.dtd) is not used, but only included for completeness
(and could possibly be used for validation of v2 XML documents).

The file [iof_v3.xsd](./iof_v3.xsd) is copied from the official repo for the
[v3 datastandard](https://github.com/international-orienteering-federation/datastandard-v3)

Both the file [iof_v3.xsd](./iof_v3.xsd) and [iof_v2.xsd](./iof_v2.xsd) are slightly modified,
the XML elements `IofV3` and `Iofv2` are added to make JSON schema generation easier. See
resulting JSON schemas in the
[orienteering-oss/iof-orienteering-data-schemas](https://github.com/orienteering-oss/iof-orienteering-data-schemas)
repo:

* [iof_v3_schema.json](https://github.com/orienteering-oss/iof-orienteering-data-schemas/blob/main/iof_v3_schema.json)
* [iof_v2_schema.json](https://github.com/orienteering-oss/iof-orienteering-data-schemas/blob/main/iof_v2_schema.json)

These JSON schemas are not used in this repo, but only mentioned here for completeness.
