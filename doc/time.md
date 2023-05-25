# OWL Time Vocabulary Documentation

## Overview

The OWL Time ontology is a vocabulary for describing the temporal
content of web resources. It is designed to provide a common language
for annotating and linking temporal data on the Semantic Web.

The ontology is based on the concepts and relationships described in
the W3C's OWL-Time specification, which provides a way to describe
time in a machine-understandable format. This ontology includes
classes for temporal entities and properties to relate them.

In the context of wikipunk.net, the OWL Time ontology can be used to
model temporal data in a way that is both human-readable and
machine-processable. This can be particularly useful for applications
that involve scheduling, planning, or any other domain where time is a
critical factor.

## Key Classes and Properties

### :time/TemporalDuration

The :time/TemporalDuration class is a subclass of :owl/Class. It
represents a duration or length of time. It has no direct slots, but
it has several descendants that inherit its properties.

### :time/Duration

The :time/Duration class is a subclass of :time/TemporalDuration. It
represents a specific duration of time. It has two direct slots:
:time/unitType and :time/numericDuration.

### :time/TemporalUnit

The :time/TemporalUnit class is a subclass of
:time/TemporalDuration. It represents a standard duration, which
provides a scale factor for a time extent, or the granularity or
precision for a time position. It has no direct slots.

### :time/GeneralDurationDescription

The :time/GeneralDurationDescription class is a subclass of
:owl/Class. It represents a description of temporal extent structured
with separate values for the various elements of a calendar-clock
system. It has several direct slots, including :time/hasTRS,
:time/seconds, :time/months, :time/minutes, :time/days, :time/hours,
:time/weeks, and :time/years.

### :time/DurationDescription

The :time/DurationDescription class is a subclass of :owl/Class. It
represents a description of temporal extent structured with separate
values for the various elements of a calendar-clock system. It has
several direct slots, including :time/minutes, :time/days,
:time/hours, :time/seconds, :time/hasTRS, :time/months, :time/weeks,
and :time/years.

### Temporal Units

Temporal units represent standard durations. They include:

- :time/unitCentury: Represents a century.
- :time/unitHour: Represents an hour.
- :time/unitYear: Represents a year.
- :time/unitMillenium: Represents a millennium.
- :time/unitMinute: Represents a minute.
- :time/unitMonth: Represents a month.
- :time/unitDay: Represents a day.
- :time/unitSecond: Represents a second.

Each of these classes is a subclass of :time/TemporalUnit,
:time/GeneralDurationDescription, and :time/TemporalDuration. They
each have a set of properties that define their duration in terms of
seconds, minutes, hours, days, weeks, months, and years.

## Usage in a Linked Data Platform

In a Linked Data Platform like wikipunk.net, the OWL Time ontology can
be used to model temporal data in RDF. This data can then be stored in
a Datomic database, which supports RDF natively.

For example, an event could be modeled as an instance of a class, with
properties to describe its start and end times. These times could be
instances of the :time/TemporalDuration class, with properties to
specify their duration in terms of the temporal units defined in the
ontology.

This approach allows temporal data to be represented in a standard,
machine-understandable format. It also enables powerful querying
capabilities, as Datomic supports querying RDF data using datalog.

The OWL Time ontology, when used with Datomic, can leverage these
unique features to provide a powerful and flexible system for modeling
and querying temporal data. Here's how:

### Immutable History

With Datomic's immutable history, you can track changes to temporal
data over time. For example, if an event's start time or duration
changes, you can easily see the history of those changes. This can be
particularly useful for auditing or debugging purposes.

### Rich Query Capabilities

Datomic's Datalog query language can be used to express complex
queries on temporal data. For example, you could write a query to find
all events that overlap with a given time period, or to find the event
with the longest duration. The expressiveness of Datalog can make it
easier to work with the complex structures often found in temporal
data.

### Transaction Functions

Transaction functions can be used to enforce business rules related to
time. For example, you could write a transaction function that ensures
an event's end time is always later than its start time. Or, a
transaction function could automatically calculate an event's duration
whenever its start or end time changes.

### Peer Architecture

Datomic's peer architecture can improve the performance of read-heavy
temporal data applications. For example, an application that
frequently queries for events happening "now" could benefit from
having a subset of the database cached in memory on each peer.

### Real-time Analytics

Datomic's separation of reads from writes can enable real-time
analytics on temporal data. For example, you could run analytical
queries to find trends or patterns in event start times or durations,
without impacting the performance of write operations.

### Integration with Clojure

If you're using Clojure to work with the OWL Time ontology, Datomic's
seamless integration with Clojure can make your work easier. Clojure's
data structures and functional programming paradigm align well with
the RDF data model used by the OWL Time ontology, and Datomic's API is
designed to be idiomatic Clojure.

In conclusion, Datomic's unique features can enhance the power and
flexibility of the OWL Time ontology, making it easier to model,
store, and query temporal data.
