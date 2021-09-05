# Example files

> ⚠️ **WARNING:** this page refers to an outdated version of the data standard. [Find here](https://github.com/international-orienteering-federation/datastandard-v3) the latest version

This folder of example files are copied from
[international-orienteering-federation/datastandard-v2](https://github.com/international-orienteering-federation/datastandard-v2/tree/master/examples).

## EventList

This list is used to exchange event information for a number of
events, e.g. fixtures.

* [EventList_example](EventList_example.xml)
These are actual events from the Danish fixtures of March 2002.

## ClubList

This list is used to exchange information of a number of clubs,
e.g. contact addresses and bank accounts. This could be used by a
national club register.

* [ClubList_example](ClubList_example.xml)

## CompetitorList

This list is used to exchange non-event specific information on a
number of Competitors. This could be used by a national competitor
register.

* [CompetitorList_example](CompetitorList_example.xml)

## EntryList

This list is used to send entries from a single club to an organizer
of an event.

* [EntryList_example](EntryList_example.xml) A normal entry list.

* [EntryList_example2](EntryList_example2.xml) A normal entry list using teams for a relay.

* [EntryList_example3](EntryList_example3.xml) An entry list with all information that possibly can be included. Only
one entry is in the file.

* [EntryList_example4](EntryList_example4.xml) The same as Example 3 but with a team entry for a relay.

## StartList

This list is used for the start list of an event. In fact it could be
put on WWW using XSLT (XML Style Language Transformation).

* [StartList_example](EntryList_example4.xml) A normal start list.

* [StartList_example2](EntryList_example4.xml) A normal start list for a relay.

## ResultList

This list is used for the result list of an event. In fact it could be
put on WWW using XSLT (XML Style Language Transformation).
<p>

A result list comes in three types:

* **complete**: This is a complete list including all competitors. It should only
be used after the event.

* **snapshot**: This is also a complete list including all competitors but some
may not have started yet, others may still be out running. It is a
snapshot of the current standing.

* **delta**: This is a file containing only the changes since the last file was
sent. It is also a snapshot.

The last two types are intended to be used for "real time" results
during the event. The first type is for the final standing after the
event.


* [ResultList_example](ResultList_example.xml) A result list using competitor IDs. This should only be used if the
reciever uses the same competitor database and uses the same IDs.<br>
The list is also a "snapshot" result file.

* [ResultList_example2](ResultList_example2.xml) A result list also using competitor IDs. It looks much the same as
Example 1 but this is a "delta" result file. Only the changes since
the last file was sent are included.

* [ResultList_example3](ResultList_example3.xml) A relay result list also using competitor IDs. It is a "snapshot" file
just as Example 1.

## CourseData

These data contains courses and controls including starting points and
finish controls. This defines all the control and course
information. It is typically exchanged between the course setting
software and the event software for this to be able to perform punch
checking. The data also contains information about the position of the
controls on the map so it can be used by map printing software.

* [CourseData_example1](CourseData_example1.xml) An ordinary event. In fact this is "real" data from Spring Cup.

* [CourseData_example2](CourseData_example2.xml) A relay event. This is also "real" data from Spring Cup. Beware, it is a quite big file.
