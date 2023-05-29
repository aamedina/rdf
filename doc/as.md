# Activity Streams

The Activity Streams vocabulary is a rich language for describing
activities that occur over time. It is used to represent and interact
with objects ("things") and activities ("actions") in a social
setting. The ontology is designed to be simple to understand and use,
yet flexible enough to allow for a wide range of different kinds of
applications.

In the context of the Activity Streams vocabulary, an `:as/Object` is
the base class for all objects in the Activity Streams vocabulary. It
has a number of properties associated with it, including:

- `:as/endTime`: The time the object was ended.
- `:as/audience`: The intended audience for the object.
- `:as/duration`: The duration of the object.
- `:as/to`: The "to" field for the object.
- `:as/rating`: The rating of the object.
- `:as/mediaType`: The media type of the object.
- `:as/summary`: The summary of the object.
- `:as/startTime`: The time the object was started.
- `:as/name`: The name of the object.
- `:as/preview`: The preview of the object.
- `:as/icon`: The icon for the object.
- `:as/attachment`: The attachment to the object.
- `:as/provider`: The provider of the object.
- `:as/bcc`: The "bcc" field for the object.
- `:as/location`: The location of the object.
- `:as/cc`: The "cc" field for the object.
- `:as/url`: The URL of the object.
- `:as/attributedTo`: The entity to which the object is attributed.
- `:as/tag`: The tag for the object.
- `:as/generator`: The generator of the object.
- `:as/inReplyTo`: The object to which this object is a reply.
- `:as/image`: The image of the object.
- `:as/published`: The time the object was published.
- `:as/id`: The ID of the object.
- `:as/content`: The content of the object.
- `:as/context`: The context of the object.
- `:as/replies`: The replies to the object.
- `:as/bto`: The "bto" field for the object.
- `:as/updated`: The time the object was updated.

An `:as/Activity` is a subclass of `:as/Object` and represents some
form of action that has been taken. It has additional properties
including:

- `:as/actor`: The entity that performed the activity.
- `:as/object`: The object on which the activity was performed.
- `:as/origin`: The origin of the activity.
- `:as/target`: The target of the activity.
- `:as/instrument`: The instrument used in the activity.
- `:as/result`: The result of the activity.

In the context of a Linked Data Platform for wikipunk.net, you could
use the Activity Streams vocabulary to represent and store activities
and objects in a Datomic database using RDF. This would allow you to
create a rich, interconnected graph of activities and objects, and
query this graph using Datomic

The `:as/Object` class has a number of subclasses, which include:

- `:as/View`
- `:as/Dislike`
- `:as/Organization`
- `:as/Article`
- `:as/Leave`
- `:as/Collection`
- `:as/Event`
- `:as/Accept`
- `:as/Announce`
- `:as/Ignore`
- `:as/Update`
- `:as/Arrive`
- `:as/TentativeReject`
- `:as/Read`
- `:as/CollectionPage`
- `:as/Offer`
- `:as/Place`
- `:as/Remove`
- `:as/Move`
- `:as/Profile`
- `:as/Join`
- `:as/Note`
- `:as/Listen`
- `:as/Page`
- `:as/Application`
- `:as/Delete`
- `:as/Create`
- `:as/Activity`
- `:as/Service`
- `:as/Tombstone`
- `:as/Add`
- `:as/Image`
- `:as/Person`
- `:as/Document`
- `:as/Audio`
- `:as/Group`
- `:as/Reject`
- `:as/Follow`
- `:as/Relationship`
- `:as/Travel`
- `:as/TentativeAccept`
- `:as/Video`
- `:as/Block`
- `:as/Like`
- `:as/Invite`
- `:as/Undo`
- `:as/IntransitiveActivity`
- `:as/Flag`
- `:as/Question`
- `:as/OrderedCollectionPage`

These subclasses represent more specific types of objects and
activities. For example, `:as/Article` is a subclass of `:as/Object`
and represents an article, while `:as/View` is a subclass of
`:as/Activity` and represents the action of viewing something. These
subclasses inherit the properties of their parent classes and may have
additional properties of their own.

In a real-world context, you could use these classes and properties to
represent a wide range of activities and objects in a social network
or other application. For example, you could use the `:as/Person`
class to represent users, the `:as/Article` class to represent posts
or articles, and the `:as/View` class to represent the action of a
user viewing an article. You could store these

The `:as/Object` class is a direct subclass of `:owl/Class`, which is
a fundamental class in the RDF and OWL vocabularies that represents
all classes.

The `:as/Activity` class is a direct subclass of both `:as/Object` and
`:owl/Class`. This means that an `:as/Activity` is a type of
`:as/Object`, and it inherits all the properties of `:as/Object`. It
also means that `:as/Activity` is a class in its own right, and it can
have its own subclasses and properties.

In practical terms, this means that you can use the `:as/Activity`
class to represent any kind of activity in your application, and you
can use the properties of `:as/Object` to describe the details of the
activity. For example, you could use the `:as/actor` property of
`:as/Activity` to specify who performed the activity, and the
`:as/object` property to specify what the activity was performed
on. You could also use the `:as/startTime` and `:as/endTime`
properties of `:as/Object` to specify when the activity started and
ended.

In a Datomic database, you could represent this information as a set
of facts about the activity. For example, you could have a fact that
says "the actor of activity 123 is person 456", and another fact that
says "the object of activity 123 is article 789". You could then use
Datomic's query capabilities to retrieve this information and use it
in your application.

In the context of a Linked Data Platform for wikipunk.net, this would
allow you to create a rich, interconnected graph of activities and
objects, and to query this graph to retrieve information about the
activities and objects in your application.

## Usage

The Activity Streams vocabulary is a powerful tool for representing
social activities in a structured, machine-readable format. Here's a
more comprehensive guide on how to use it in the context of a Linked
Data Platform using Datomic:

1. **Modeling Data**: The first step is to model your data according
   to the Activity Streams vocabulary. This involves identifying the
   types of objects and activities in your application, and mapping
   them to the appropriate classes in the Activity Streams
   vocabulary. For example, if your application involves users posting
   and commenting on articles, you might map users to the `:as/Person`
   class, posts to the `:as/Article` class, and comments to the
   `:as/Note` class. You would also map the action of posting an
   article to the `:as/Create` class, and the action of commenting on
   an article to the `:as/Add` class.

2. **Storing Data**: Once you've modeled your data, you can store it
   in a Datomic database using RDF. Each object and activity in your
   application becomes an entity in the database, with properties that
   correspond to the slots of the appropriate Activity Streams
   class. For example, a user might have properties like `:as/name`
   and `:as/url`, while a post might have properties like
   `:as/content` and `:as/published`.

3. **Querying Data**: Datomic's powerful query capabilities allow you
   to retrieve and manipulate your data in a variety of ways. For
   example, you could write a query to retrieve all the articles
   posted by a particular user, or to find all the comments on a
   particular article. You can also use Datomic's transaction
   functions to update your data in response to user actions.

4. **Interlinking Data**: One of the key benefits of using the
   Activity Streams vocabulary in a Linked Data Platform is the
   ability to interlink data. This means that you can create links
   between related objects and activities, making it easy to navigate
   from one piece of data to another. For example, you could link an
   `:as/Create` activity to the `:as/Person` who performed the
   activity and the `:as/Article` that was created.

5. **Sharing Data**: Finally, because your data is stored in a
   standard, machine-readable format, it's easy to share it with other
   applications. This could involve publishing your data as Linked
   Data, providing an API for other applications to access your data,
   or exporting your data in a standard format like JSON-LD.

6. **Temporal Aspects**: Activity Streams vocabulary provides
   properties to capture temporal aspects of activities. For instance,
   `:as/startTime` and `:as/endTime` can be used to denote when an
   activity started and ended. This can be particularly useful in
   applications where tracking the timeline of activities is
   important. In Datomic, these properties can be stored as
   datomic.instant types, allowing for precise time-based queries.

7. **Activity Relationships**: The Activity Streams vocabulary allows
   for the representation of complex relationships between
   activities. For example, the `:as/inReplyTo` property can be used
   to link a comment (an activity) to the post it is replying to. This
   can be used to build threaded conversations or comment sections in
   a social media application.

8. **Attribution**: The `:as/attributedTo` property allows for the
   representation of the creator or originator of an object. This can
   be used to attribute posts, comments, or any other objects to
   specific users in your application.

9. **Collections**: Activity Streams provides classes like
   `:as/Collection` and `:as/OrderedCollection` to group related
   objects. This can be used to create collections of posts (like a
   user's timeline) or a list of friends/followers in a social
   network.

10. **Privacy and Audience Targeting**: Properties like `:as/to`,
    `:as/bto`, `:as/cc`, and `:as/bcc` can be used to specify the
    intended audience for an activity or object. This can be used to
    implement privacy settings or audience targeting features in your
    application.

11. **Extending the Vocabulary**: While the Activity Streams
    vocabulary is comprehensive, there might be cases where you need
    to represent data that doesn't fit into the existing classes and
    properties. In such cases, you can extend the vocabulary by
    defining your own classes and properties. For example, if you're
    building a music streaming application, you might define classes
    like `:as/Song` and `:as/Playlist`, and properties like
    `:as/genre` and `:as/length`.

12. **Interoperability**: One of the key advantages of using a
    standard vocabulary like Activity Streams is interoperability. By
    representing your data in a standard, machine-readable format, you
    make it easier for other applications and services to consume and
    understand your data. This can be particularly useful if you're
    planning to integrate with other services or expose an API for
    third-party developers.

13. **Handling Media**: Activity Streams vocabulary provides classes
    like `:as/Video`, `:as/Image`, `:as/Audio` to handle different
    types of media content. These can be used to represent media
    attachments in posts or user profiles. Each of these classes can
    have properties like `:as/url` to store the location of the media
    file, `:as/mediaType` to store the type of the media file, and
    `:as/duration` for the length of the media content.

14. **Location Information**: The `:as/Place` class can be used to
    represent a physical location associated with an activity or
    object. This can be useful in applications where location
    information is important, such as check-in features in social
    networks or location-based posts. The `:as/Place` class can have
    properties like `:as/name` for the name of the location, and
    `:as/latitude` and `:as/longitude` for the geographical
    coordinates.

15. **Handling Errors**: The `:as/Tombstone` class can be used to
    represent objects that have been deleted or are no longer
    available. This can be useful in situations where you want to
    preserve the integrity of the activity stream even when individual
    objects are removed.

16. **Event Representation**: The `:as/Event` class can be used to
    represent events in your application. This can be useful for
    applications that involve scheduling or event management. The
    `:as/Event` class can have properties like `:as/startTime` and
    `:as/endTime` to represent the start and end times of the event,
    `:as/location` to represent the location of the event, and
    `:as/attendees` to represent the people attending the event.

17. **Handling Reactions**: The `:as/Like`, `:as/Dislike`, and
    `:as/View` classes can be used to represent user reactions to
    objects. These can be used to implement features like likes,
    dislikes, and view counts in your application.

18. **Activity Inference**: The rich semantics of the Activity Streams
    vocabulary can be used to infer additional information about the
    activities in your application. For example, if a user likes a
    post, you can infer that the user has also viewed the post. This
    can be used to enhance the user experience or to generate insights
    about user behavior.

19. **Data Migration**: The use of a standard vocabulary like Activity
    Streams can simplify data migration. If you decide to switch from
    Datomic to another database, or if you want to import data from
    another application, the standardized format of your data can make
    the migration process easier and more reliable.

20. **Integration with Semantic Web Technologies**: The Activity
    Streams vocabulary is compatible with other Semantic Web
    technologies like SPARQL and OWL. This means you can use these
    technologies to query and manipulate your data, to infer new data
    based on the existing data, and to integrate your data with other
    Semantic Web data sources.

21. **Real-time Updates**: The Activity Streams vocabulary can be used
    in conjunction with technologies like WebSockets or Server-Sent
    Events to provide real-time updates to users. For example, when a
    new `:as/Activity` is added to the Datomic database, a message
    could be sent to all connected clients, allowing them to update
    their views in real-time.

22. **Search and Discovery**: The structured nature of the Activity
    Streams data model makes it well-suited for search and discovery
    features. You can use Datomic's query capabilities to implement
    complex search functionality, such as finding all activities of a
    certain type, or all activities related to a certain object.

23. **Personalization and Recommendation**: The rich semantics of the
    Activity Streams vocabulary can be used to drive personalization
    and recommendation features. For example, by analyzing a user's
    `:as/Activity` history, you could recommend similar activities or
    objects that might be of interest.

24. **Analytics and Reporting**: The Activity Streams data model can
    provide a wealth of information for analytics and reporting. You
    can use Datomic's query capabilities to generate reports on user
    activity, such as the most popular objects, the most active users,
    or trends in activity over time.

25. **Archiving and Versioning**: The `:as/Tombstone` class can be
    used to represent deleted objects, but you can also use Datomic's
    built-in support for historical data to implement archiving and
    versioning features. This allows you to keep a history of changes
    to objects and activities, and to provide users with the ability
    to view or revert to previous versions.

26. **Access Control and Privacy**: The `:as/audience`, `:as/to`,
    `:as/bto`, `:as/cc`, and `:as/bcc` properties can be used to
    implement access control and privacy features. For example, you
    could use these properties to control who can see or interact with
    an object or activity.

27. **Internationalization and Localization**: The Activity Streams
    vocabulary supports internationalization and localization through
    the use of language-tagged strings. This allows you to provide
    localized versions of object properties, such as the `:as/name` or
    `:as/content` of an object.

28. **Integration with Other Vocabularies**: The Activity Streams
    vocabulary can be used in conjunction with other RDF vocabularies
    to provide additional functionality. For example, you could use
    the FOAF vocabulary to represent social network connections, or
    the SIOC vocabulary to represent online communities and
    discussions.

29. **Semantic SEO**: By exposing your Activity Streams data as Linked
    Data, you can enhance the SEO of your application. Search engines
    can use this data to provide rich snippets in search results,
    improving the visibility and click-through rate of your pages.

30. **Future-proofing Your Data**: By using a standard, extensible
    vocabulary like Activity Streams, you can future-proof your
    data. As new types of social activities emerge, you can extend
    your data model to support them, without having to redesign your
    database or rewrite your application.

31. **Federation and Interoperability**: The use of a standard
    vocabulary like Activity Streams can facilitate federation between
    different applications or services. This means that users on
    different platforms can interact with each other as if they were
    on the same platform. This is a key feature of the decentralized
    social web.

32. **Contextual Information**: The `:as/context` property can be used
    to provide additional, contextual information about an activity or
    object. This can be used to provide users with more detailed
    information about the circumstances of an activity.

33. **Handling Large Datasets**: Datomic's scalability and the
    structured nature of Activity Streams data make it well-suited for
    handling large datasets. You can use Datomic's partitioning and
    indexing features to ensure that your application remains
    performant even as your data grows.

34. **Semantic Reasoning**: The use of an RDF-based vocabulary like
    Activity Streams allows for semantic reasoning over your
    data. This means that you can use logic to infer new information
    based on the existing data. For example, if `:as/Follow`
    activities imply a `:as/knows` relationship in your application,
    you could infer all `:as/knows` relationships based on the
    existing `:as/Follow` activities.

35. **Data Validation**: The structure and semantics of the Activity
    Streams vocabulary can be used to validate data before it is
    stored in the database. This can help to ensure the consistency
    and reliability of your data.

36. **User Interface Representation**: The Activity Streams vocabulary
    can also inform the design of your user interface. For example,
    different types of activities might be represented differently in
    the user interface, and the properties of an activity can be used
    to provide detailed information to the user.

37. **Event-Driven Architecture**: The Activity Streams vocabulary
    fits well with an event-driven architecture. Each activity can be
    seen as an event that triggers certain actions in your
    application. This can help to make your application more
    responsive and scalable.

38. **Integration with Machine Learning**: The structured nature of
    Activity Streams data makes it well-suited for machine learning
    applications. You can use machine learning algorithms to analyze
    your data and generate insights or predictions.

39. **Support for Accessibility**: The use of a standard vocabulary
    can also support accessibility. For example, the properties of an
    activity can be used to generate descriptive text for screen
    readers.

40. **Preserving User Activity**: The Activity Streams vocabulary,
    combined with Datomic's historical data capabilities, allows you
    to preserve a complete history of user activity. This can be
    useful for auditing purposes, or to allow users to review their
    own activity history.

## Conclusion

The Activity Streams vocabulary provides a powerful and flexible
framework for representing social activities in a structured,
machine-readable format. It offers a wide range of classes and
properties that can be used to model a variety of objects and
activities, from simple actions like liking a post to complex
workflows involving multiple actors and targets.

When used in conjunction with Datomic, the Activity Streams vocabulary
enables the creation of a rich, interconnected graph of activities and
objects. Datomic's powerful query capabilities and support for
historical data make it possible to retrieve and manipulate this data
in a variety of ways, from simple lookups to complex analyses.

Moreover, the use of a standard vocabulary like Activity Streams
enhances the interoperability, portability, and future-proofing of
your data. It allows your data to be easily shared and understood by
other applications, and it provides a solid foundation for extending
and evolving your data model to meet future needs.

Finally, the Activity Streams vocabulary fits well with the principles
of the Linked Data Platform, enabling the creation of a web of
interconnected data that can be easily navigated and explored. This
can enhance the user experience, enable more sophisticated data
processing and analysis techniques, and support a wide range of
features and functionalities in your application.

In conclusion, the Activity Streams vocabulary, when used in the
context of a Linked Data Platform using Datomic, provides a robust and
versatile solution for representing, storing, and manipulating social
activity data. Whether you're building a simple social network or a
complex collaborative platform, the Activity Streams vocabulary can
provide the structure and semantics you need to model your data
effectively.

## :as/Object

The `:as/Object` is a fundamental metaobject in the Activity Streams vocabulary. It is an `:owl/Class` and serves as the base type for most of the other kinds of objects defined in the Activity Vocabulary. This includes other Core types such as `:as/Activity`, `:as/IntransitiveActivity`, `:as/Collection`, and `:as/OrderedCollection`.

The `:as/Object` describes an object of any kind. It is a versatile and foundational metaobject that can be used to represent a wide range of entities in the virtual world.

### Disjoint With

The `:as/Object` is disjoint with `:as/Link`. This means that an entity cannot be both an `:as/Object` and an `:as/Link` at the same time.

### Usage

In the context of the Emotion Machine (EM-ONE) architecture, the `:as/Object` can be used to represent the cognitive context, the ways to think, and the responses generated by the system. For example, a cognitive context could be represented as an `:as/Object` with attributes that describe the current state of the conversation. Similarly, a way to think could be represented as an `:as/Object` with attributes that describe the action or strategy the system can take in response to a user message.

In the next step, let's explore the direct slots of the `:as/Object` to understand its structure and properties.

### Direct Slots of :as/Object

The `:as/Object` metaobject has a rich set of direct slots that can be used to describe various aspects of an object. Here are the direct slots:

- `:as/image`: Represents an image associated with the object.
- `:as/duration`: Represents the duration of the object.
- `:as/summary`: Provides a brief summary of the object.
- `:as/name`: Represents the name of the object.
- `:as/tag`: Contains any tags associated with the object.
- `:as/location`: Specifies the location of the object.
- `:as/attachment`: Contains any single attachment to the object.
- `:as/endTime`: Specifies the end time of the object.
- `:as/inReplyTo`: Contains any objects to which the object is a reply.
- `:as/preview`: Provides a preview of the object.
- `:as/mediaType`: Specifies the media type of the object.
- `:as/bto`: Contains any objects to which the object is directly addressed.
- `:as/url`: Specifies the URL of the object.
- `:as/updated`: Specifies the time when the object was last updated.
- `:as/context`: Specifies the context of the object.
- `:as/startTime`: Specifies the start time of the object.
- `:as/cc`: Contains any objects that are indirectly addressed.
- `:as/icon`: Represents an icon associated with the object.
- `:as/to`: Contains any objects to which the object is addressed.
- `:as/generator`: Represents the generator of the object.
- `:as/replies`: Contains any replies to the object.
- `:as/published`: Specifies the time when the object was published.
- `:as/bcc`: Contains any objects that are blind carbon copied.
- `:as/content`: Contains the content of the object.
- `:as/id`: Represents the ID of the object.
- `:as/attributedTo`: Specifies the entity to which the object is attributed.
- `:as/rating`: Represents the rating of the object.
- `:as/audience`: Specifies the audience of the object.

These slots provide a comprehensive set of properties that can be used
to describe an object in a rich and detailed manner. They can be used
to represent various aspects of the cognitive context, the ways to
think, and the responses generated by the system in the Emotion
Machine (EM-ONE) architecture.

# :as/Link

The `:as/Link` is an essential metaobject in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of itself. It is used to establish an indirect, qualified reference to a resource identified by a URL.

The `:as/Link` represents a qualified reference to another resource, patterned after the RFC5988 Web Linking Model. It allows the establishment of a qualified relation connecting the subject (the containing object) to the resource identified by the href. Properties of the `:as/Link` are properties of the reference as opposed to properties of the resource.

## Disjoint With

The `:as/Link` is disjoint with `:as/Object`. This means that an entity cannot be both an `:as/Link` and an `:as/Object` at the same time.

## Direct Slots

The `:as/Link` metaobject has the following direct slots:

- `:as/hreflang`: Specifies the language of the target resource.
- `:as/name`: Represents the name of the link.
- `:as/width`: Specifies the width of the linked resource.
- `:as/preview`: Provides a preview of the link.
- `:as/mediaType`: Specifies the media type of the linked resource.
- `:as/height`: Specifies the height of the linked resource.
- `:as/href`: Specifies the URL of the linked resource.
- `:as/id`: Represents the ID of the link.
- `:as/attributedTo`: Specifies the entity to which the link is attributed.
- `:as/rel`: Specifies the relationship of the link to its context.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Link` can be used to represent references to resources in the virtual world. For example, a user's message could be represented as an `:as/Object` with an `:as/Link` to the user's profile. Similarly, a way to think could be represented as an `:as/Object` with an `:as/Link` to a resource that describes the action or strategy the system can take in response to a user message.

The `:as/Link` can also be used to represent relationships between entities in the virtual world. For example, a user's follow activity could be represented as an `:as/Activity` with an `:as/Link` to the followed user's profile. The `:as/Link` allows the system to represent these relationships in a way that is compatible with the principles of ActivityPub and the capabilities of Datomic.

# :as/Activity

The `:as/Activity` is a crucial metaobject in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Object`. It is used to describe some form of action that may happen, is currently happening, or has already happened.

The `:as/Activity` represents some form of action that has been taken. It serves as an abstract base type for all types of activities. It is important to note that the `:as/Activity` type itself does not carry any specific semantics about the kind of action being taken.

## Direct Slots

The `:as/Activity` metaobject has the following direct slots:

- `:as/result`: Specifies the result of the activity.
- `:as/target`: Specifies the target of the activity.
- `:as/instrument`: Specifies the instrument used in the activity.
- `:as/origin`: Specifies the origin of the activity.
- `:as/object`: Specifies the object of the activity.
- `:as/actor`: Specifies the actor of the activity.



In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Activity` can be used to represent actions in the virtual world. For example, a user's message could be represented as an `:as/Activity` with an `:as/object` that is the message and an `:as/actor` that is the user. Similarly, a way to think could be represented as an `:as/Activity` with an `:as/object` that describes the action or strategy the system can take in response to a user message.

The `:as/Activity` allows the system to represent actions in a way
that is compatible with the principles of ActivityPub and the
capabilities of Datomic. It provides a flexible and powerful way to
model the dynamic nature of the virtual world.

# :as/Update

The `:as/Update` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of both `:as/Activity` and `:as/Object`.

The `:as/Update` represents an action where the actor has updated the object. It's important to note that this vocabulary does not define a mechanism for describing the actual set of modifications made to the object. It simply indicates that an update has occurred.

## Direct Slots

The `:as/Update` metaobject does not have any direct slots. It inherits all properties from its parent classes, `:as/Activity` and `:as/Object`.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Update` can be used to represent update actions in the virtual world. For example, a user updating their profile could be represented as an `:as/Update` activity with an `:as/actor` that is the user and an `:as/object` that is the user's profile.

The `:as/Update` provides a way to represent update actions in a way
that is compatible with the principles of ActivityPub and the
capabilities of Datomic. It allows the system to capture the dynamic
nature of the virtual world where entities are constantly being
updated.

# :as/Leave

The `:as/Leave` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of both `:as/Activity` and `:as/Object`.

The `:as/Leave` represents an action where the actor has left the object. The target and origin typically have no meaning in this context. It simply indicates that a leaving action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Leave` can be used to represent leaving actions in the virtual world. For example, a user leaving a group could be represented as an `:as/Leave` activity with an `:as/actor` that is the user and an `:as/object` that is the group.

The `:as/Leave` provides a way to represent leaving actions in a way that is compatible with the principles of ActivityPub and the capabilities of Datomic. It allows the system to capture the dynamic nature of the virtual world where entities are constantly interacting with each other.

# :as/Offer

The `:as/Offer` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of both `:as/Activity` and `:as/Object`.
The `:as/Offer` represents an action where the actor is offering the object. If specified, the target indicates the entity to which the object is being offered. It simply indicates that an offering action has occurred.

In the context of a Linked Data Platform for Datomic built on the
principles of ActivityPub, the `:as/Offer` can be used to represent
offering actions in the virtual world. For example, a user offering a
digital item for trade could be represented as an `:as/Offer` activity
with an `:as/actor` that is the user and an `:as/object` that is the
digital item.

# :as/Join

The `:as/Join` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of both `:as/Activity` and `:as/Object`.

The `:as/Join` represents an action where the actor has joined the object. The target and origin typically have no defined meaning. It simply indicates that a joining action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Join` can be used to represent joining actions in the virtual world. For example, a user joining a group could be represented as an `:as/Join` activity with an `:as/actor` that is the user and an `:as/object` that is the group.

# :as/Travel

The `:as/Travel` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/IntransitiveActivity`, `:as/Object`, and `:as/Activity`.

The `:as/Travel` represents an action where the actor is traveling to a target from an origin. If the target or origin are not specified, either can be determined by context. It simply indicates that a traveling action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Travel` can be used to represent traveling actions in the virtual world. For example, a user traveling from one location to another could be represented as an `:as/Travel` activity with an `:as/actor` that is the user.

# :as/Question

The `:as/Question` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/IntransitiveActivity`, `:as/Object`, and `:as/Activity`.

The `:as/Question` represents a question being asked. The `:as/Question` object is an `:as/Activity`, but the direct object is the question itself and therefore it would not contain an object property. Either of the `:as/anyOf` and `:as/oneOf` properties MAY be used to express possible answers, but a `:as/Question` object MUST NOT have both properties.

In the context of a Linked Data Platform for Datomic built on the
principles of ActivityPub, the `:as/Question` can be used to represent
questions in the virtual world. For example, a user asking a question
could be represented as an `:as/Question` activity with an `:as/actor`
that is the user.

# :as/TentativeReject

The `:as/TentativeReject` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Reject`, `:as/Object`, and `:as/Activity`.

The `:as/TentativeReject` represents an action where the actor tentatively rejects the object. It simply indicates that a tentative rejection action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/TentativeReject` can be used to represent tentative rejection actions in the virtual world. For example, a user tentatively rejecting an invitation could be represented as an `:as/TentativeReject` activity with an `:as/actor` that is the user and an `:as/object` that is the invitation.

# :as/Reject

The `:as/Reject` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Reject` represents an action where the actor is rejecting the object. The target and origin typically have no defined meaning. It simply indicates that a rejection action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Reject` can be used to represent rejection actions in the virtual world. For example, a user rejecting an invitation could be represented as an `:as/Reject` activity with an `:as/actor` that is the user and an `:as/object` that is the invitation.

# :as/Follow

The `:as/Follow` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Follow` represents an action where the actor is 'following' the object. Following is defined in the sense typically used within Social systems in which the actor is interested in any activity performed by or on the object. The target and origin typically have no defined meaning.

In the context of a Linked Data Platform for Datomic built on the
principles of ActivityPub, the `:as/Follow` can be used to represent
following actions in the virtual world. For example, a user following
another user could be represented as an `:as/Follow` activity with an
`:as/actor` that is the user and an `:as/object` that is the other
user.

# :as/Listen

The `:as/Listen` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Listen` represents an action where the actor has listened to the object. It simply indicates that a listening action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Listen` can be used to represent listening actions in the virtual world. For example, a user listening to a music track could be represented as an `:as/Listen` activity with an `:as/actor` that is the user and an `:as/object` that is the music track.

# :as/View

The `:as/View` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/View` represents an action where the actor has viewed the object. It simply indicates that a viewing action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/View` can be used to represent viewing actions in the virtual world. For example, a user viewing a post could be represented as an `:as/View` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/Invite

The `:as/Invite` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Offer`, `:as/Activity`, and `:as/Object`.

The `:as/Invite` represents an action where the actor is extending an invitation for the object to the target. It is a specialization of `:as/Offer`.

In the context of a Linked Data Platform for Datomic built on the
principles of ActivityPub, the `:as/Invite` can be used to represent
invitation actions in the virtual world. For example, a user inviting
another user to an event could be represented as an `:as/Invite`
activity with an `:as/actor` that is the user, an `:as/object` that is
the event, and a `:as/target` that is the other user.

# :as/Block

The `:as/Block` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Ignore`, `:as/Activity`, and `:as/Object`.

The `:as/Block` represents an action where the actor is blocking the object. Blocking is a stronger form of Ignore. The typical use is to support social systems that allow one user to block activities or content of other users.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Block` can be used to represent blocking actions in the virtual world. For example, a user blocking another user could be represented as an `:as/Block` activity with an `:as/actor` that is the user and an `:as/object` that is the other user.

# :as/Read

The `:as/Read` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Read` represents an action where the actor has read the object. It simply indicates that a reading action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Read` can be used to represent reading actions in the virtual world. For example, a user reading a post could be represented as an `:as/Read` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/Move

The `:as/Move` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Move` represents an action where the actor has moved the object from origin to target. If the origin or target are not specified, either can be determined by context.

In the context of a Linked Data Platform for Datomic built on the
principles of ActivityPub, the `:as/Move` can be used to represent
moving actions in the virtual world. For example, a user moving an
item from one location to another could be represented as an
`:as/Move` activity with an `:as/actor` that is the user, an
`:as/object` that is the item, and `:as/origin` and `:as/target` that
represent the locations.

# :as/Announce

The `:as/Announce` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Announce` represents an action where the actor is calling the target's attention to the object. It simply indicates that an announcement action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Announce` can be used to represent announcement actions in the virtual world. For example, a user announcing a new post could be represented as an `:as/Announce` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/Dislike

The `:as/Dislike` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Dislike` represents an action where the actor dislikes the object. It simply indicates that a disliking action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Dislike` can be used to represent disliking actions in the virtual world. For example, a user disliking a post could be represented as an `:as/Dislike` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/TentativeAccept

The `:as/TentativeAccept` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Accept`, `:as/Activity`, and `:as/Object`.

The `:as/TentativeAccept` represents an action where the actor tentatively accepts the object. It is a specialization of `:as/Accept`.

In the context of a Linked Data Platform for Datomic built on the
principles of ActivityPub, the `:as/TentativeAccept` can be used to
represent tentative acceptance actions in the virtual world. For
example, a user tentatively accepting an invitation could be
represented as an `:as/TentativeAccept` activity with an `:as/actor`
that is the user and an `:as/object` that is the invitation.

# :as/Add

The `:as/Add` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Add` represents an action where the actor has added the object to the target. If the target property is not explicitly specified, the target would need to be determined implicitly by context. The origin can be used to identify the context from which the object originated.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Add` can be used to represent adding actions in the virtual world. For example, a user adding a post to a group could be represented as an `:as/Add` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/Flag

The `:as/Flag` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Flag` represents an action where the actor is 'flagging' the object. Flagging is defined in the sense common to many social platforms as reporting content as being inappropriate for any number of reasons.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Flag` can be used to represent flagging actions in the virtual world. For example, a user flagging a post as inappropriate could be represented as an `:as/Flag` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/Remove

The `:as/Remove` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Remove` represents an action where the actor has removed the object. The target and origin typically have no defined meaning.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Remove` can be used to represent removing actions in the virtual world. For example, a user removing a post from a group could be represented as an `:as/Remove` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/IntransitiveActivity

The `:as/IntransitiveActivity` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/IntransitiveActivity` represents an activity that has no direct object. It simply indicates that an intransitive action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/IntransitiveActivity` can be used to represent intransitive actions in the virtual world. For example, a user checking in at a location could be represented as an `:as/IntransitiveActivity` with an `:as/actor` that is the user.

# :as/Ignore

The `:as/Ignore` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Ignore` represents an action where the actor is ignoring the object. The target and origin typically have no defined meaning. It simply indicates that an ignoring action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Ignore` can be used to represent ignoring actions in the virtual world. For example, a user ignoring another user could be represented as an `:as/Ignore` activity with an `:as/actor` that is the user and an `:as/object` that is the other user.

# :as/Arrive

The `:as/Arrive` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/IntransitiveActivity`, `:as/Object`, and `:as/Activity`.

The `:as/Arrive` represents an action where the actor has arrived at the location. The origin can be used to identify the context from which the actor originated. The target typically has no defined meaning. It can be used, for instance, to indicate that a particular entity is currently located somewhere, e.g. a "check-in".

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Arrive` can be used to represent arrival actions in the virtual world. For example, a user arriving at a location could be represented as an `:as/Arrive` activity with an `:as/actor` that is the user.

# :as/Delete

The `:as/Delete` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Delete` represents an action where the actor has deleted the object. If specified, the origin indicates the context from which the object was deleted. It simply indicates that a deletion action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Delete` can be used to represent deletion actions in the virtual world. For example, a user deleting a post could be represented as an

`:as/Delete` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/Like

The `:as/Like` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Like` represents an action where the actor likes, recommends, or endorses the object. The target and origin typically have no defined meaning. It simply indicates that a liking action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Like` can be used to represent liking actions in the virtual world. For example, a user liking a post could be represented as an `:as/Like` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/Accept

The `:as/Accept` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Accept` represents an action where the actor accepts the object. The target property can be used in certain circumstances to indicate the context into which the object has been accepted. It simply indicates that an acceptance action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Accept` can be used to represent acceptance actions in the virtual world. For example, a user accepting an invitation could be represented as an `:as/Accept` activity with an `:as/actor` that is the user and an `:as/object` that is the invitation.

# :as/Create

The `:as/Create` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Create` represents an action where the actor has created the object. It simply indicates that a creation action has occurred.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Create` can be used to represent creation actions in the virtual world. For example, a user creating a post could be represented as an `:as/Create` activity with an `:as/actor` that is the user and an `:as/object` that is the post.

# :as/Undo

The `:as/Undo` is a specific type of `:as/Activity` in the Activity Streams vocabulary. It is an `:owl/Class` and serves as a subclass of `:as/Activity` and `:as/Object`.

The `:as/Undo` represents an action where the actor is undoing the object. In most cases, the object will be an Activity describing some previously performed action. This would typically be used to indicate that a previous Activity has been undone.

In the context of a Linked Data Platform for Datomic built on the principles of ActivityPub, the `:as/Undo` can be used to represent undoing actions in the virtual world.

For example, a user undoing a like on a post could be represented as an `:as/Undo` activity with an `:as/actor` that is the user and an `:as/object` that is the like activity.
