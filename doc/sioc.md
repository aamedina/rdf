# Semantically-Interlinked Online Communities (SIOC)

The SIOC (Semantically-Interlinked Online Communities) ontology
provides a way to describe the information in online communities,
enabling the export of this information and the interlinking of these
communities. The ontology can be applied to various online community
platforms, including weblogs, message boards, mailing lists, and chat
channels.

## :sioc/Community

The `:sioc/Community` class is a high-level concept that defines an
online community and what it consists of. The `:owl/disjointWith`
property indicates that this class is disjoint with the
`:sioc/UserAccount`, `:sioc/Role`, and `:sioc/Item` classes. This
means that an instance cannot be a member of more than one of these
classes. 

## :sioc/UserAccount

The `:sioc/UserAccount` class represents a user account in an online
community site. It is a subclass of `:foaf/OnlineAccount`. The
`:owl/disjointWith` property indicates that this class is disjoint
with the `:sioc/Role`, `:sioc/Usergroup`, `:sioc/Space`,
`:sioc/Container`, and `:sioc/Item` classes. 

The properties or slots associated with this class include:

- `:sioc/follows`
- `:sioc/owner_of`
- `:sioc/creator_of`
- `:sioc/subscriber_of`
- `:sioc/modifier_of`
- `:sioc/email_sha1`
- `:sioc/first_name`
- `:sioc/avatar`
- `:sioc/email`
- `:sioc/member_of`
- `:sioc/last_name`
- `:sioc/moderator_of`
- `:sioc/administrator_of`
- `:sioc/account_of`

## :sioc/Role

The `:sioc/Role` class represents a function of a UserAccount within a
scope of a particular Forum, Site, etc. The `:owl/disjointWith`
property indicates that this class is disjoint with the
`:sioc/Usergroup`, `:sioc/UserAccount`, `:sioc/Space`, `:sioc/Item`,
and `:sioc/Container` classes. 

The properties associated with this class are:

- `:sioc/function_of`
- `:sioc/has_scope`

## :sioc/Item

The `:sioc/Item` class represents something which can be in a
Container. The `:owl/disjointWith` property indicates that this class
is disjoint with the `:sioc/Usergroup`, `:sioc/UserAccount`,
`:sioc/Space`, `:sioc/Role`, and `:sioc/Container` classes. 

The properties associated with this class include:

- `:sioc/next_by_date`
- `:sioc/read_at`
- `:sioc/generator`
- `:sioc/sibling`
- `:sioc/next_version`
- `:sioc/shared_by`
- `:sioc/previous_by_date`
- `:sioc/later_version`
- `:sioc/content`
- `:sioc/has_discussion`
- `:sioc/addressed_to`
- `:sioc/earlier_version`
- `:sioc/has_reply`
- `:sioc/latest_version`
- `:sioc/previous_version`
- `:sioc/reply_of`
- `:sioc/respond_to`
- `:sioc/has_container`
- `:sioc/about`
- `:sioc/delivered_at`
- `:sioc/attachment`
- `:sioc/embeds_knowledge`
- `:sioc/mentions`

In a real-world application using Datomic to store everything with RDF
in the context of a Linked Data Platform for wikipunk.net, these
classes and properties can be used to model the structure and
relationships of online communities. For example, instances of the
`:sioc/UserAccount` class can be created for each user in the
community, with properties such as `:sioc/first_name` and
`:sioc/email` storing the user's personal information. The
`:sioc/Role` class can be used to define the user's role within the
community, such as administrator or moderator. The `:sioc/Item` class
can be used to represent posts or comments made by the users, with
properties such as `:sioc/content` storing the text of the post and
`:sioc/has_reply` linking to any replies.

The use of RDF and Datomic allows for the creation of a highly
interconnected data model, where each piece of data is linked to
related data. This can be particularly useful in the context of an
online community, where users, posts, and other elements are often
closely related. The use of a Linked Data Platform allows for this
data to be easily accessed and navigated, both by users of the
community and by external applications.

The SIOC ontology provides a powerful tool for modeling online
communities, and its integration into the wikipunk.net vocabulary
allows for a high degree of flexibility and interconnectivity in the
representation of these communities.

## :sioc/Container

The `:sioc/Container` class represents an area in which content Items
are contained. The `:owl/disjointWith` property indicates that this
class is disjoint with the `:sioc/Usergroup`, `:sioc/UserAccount`,
`:sioc/Role`, and `:sioc/Item` classes. 

The properties associated with this class include:

- `:sioc/last_item_date`
- `:sioc/has_subscriber`
- `:sioc/container_of`
- `:sioc/has_parent`
- `:sioc/num_items`
- `:sioc/has_host`
- `:sioc/parent_of`

In the context of a Linked Data Platform using Datomic, the
`:sioc/Container` class can be used to model various types of content
containers in an online community. For example, it could represent a
blog post, a forum thread, or a chat room. The `:sioc/container_of`
property can be used to link the container to the `:sioc/Item`
instances (e.g., comments, replies, or chat messages) it contains. The
`:sioc/has_subscriber` property can be used to link the container to
the `:sioc/UserAccount` instances of users who are subscribed to the
container. The `:sioc/has_parent` and `:sioc/parent_of` properties can
be used to model the hierarchical structure of the community.

Datomic's powerful querying capabilities and support for ACID
transactions make it well-suited to managing the complex,
interconnected data structures that can be modeled using the SIOC
ontology. For example, a Datomic query could be used to retrieve all
the items in a container, along with the user accounts of their
authors and any replies to the items. The use of RDF and the SIOC
ontology allows for this data to be represented in a standard,
interoperable format that can be easily shared and linked to other
data on the web.

## :sioc/Forum

The `:sioc/Forum` class represents a discussion area on which Posts or
entries are made. It is a subclass of `:sioc/Container`.

The properties associated with this class include:

- `:sioc/num_threads`
- `:sioc/has_moderator`

In the context of a Linked Data Platform using Datomic, a
`:sioc/Forum` could represent a discussion board or a subreddit. The
`:sioc/num_threads` property could be used to store the number of
discussion threads in the forum, and the `:sioc/has_moderator`
property could be used to link to the `:sioc/UserAccount` instance of
the user who moderates the forum. 

As a subclass of `:sioc/Container`, it also inherits all the
properties of that class. This allows for a rich representation of the
structure and content of the forum. For example, the
`:sioc/container_of` property could be used to link the forum to the
`:sioc/Item` instances (e.g., discussion threads) it contains, and the
`:sioc/has_subscriber` property could be used to link the forum to the
`:sioc/UserAccount` instances of users who are subscribed to the
forum.

Using Datomic in this context allows for efficient querying and
management of the data. For example, a Datomic query could be used to
retrieve all the threads in a forum, along with the user accounts of
their authors and any replies to the threads. 

## :sioc/Post

The `:sioc/Post` class represents an article or message that can be
posted to a Forum. It is a subclass of `:foaf/Document` and
`:sioc/Item`.

The properties associated with this class include:

- `:sioc/description`
- `:sioc/content_encoded`
- `:sioc/created_at`
- `:sioc/title`
- `:sioc/subject`
- `:sioc/reference`
- `:sioc/modified_at`

In the context of a Linked Data Platform using Datomic, a `:sioc/Post`
could represent a forum post or a blog entry. The `:sioc/description`
and `:sioc/content_encoded` properties could be used to store the text
of the post, the `:sioc/created_at` and `:sioc/modified_at` properties
could be used to track when the post was created and last modified,
and the `:sioc/title` and `:sioc/subject` properties could be used to
store the title and subject of the post. The `:sioc/reference`
property could be used to link the post to any resources it
references.

## :sioc/Space

The `:sioc/Space` class represents a place where data resides, such as
a website, desktop, fileshare, etc. The `:owl/disjointWith` property
indicates that this class is disjoint with the `:sioc/Usergroup`,
`:sioc/UserAccount`, `:sioc/Role`, and `:sioc/Item` classes.

The properties associated with this class include:

- `:sioc/space_of`
- `:sioc/has_usergroup`

In the context of a Linked Data Platform using Datomic, a
`:sioc/Space` could represent a physical or virtual location where
data is stored. The `:sioc/space_of` property could be used to link
the space to the `:sioc/Item` instances (e.g., files, documents,
posts) it contains, and the `:sioc/has_usergroup` property could be
used to link the space to the `:sioc/Usergroup` instances of users who
have access to the space.

## :sioc/Site

The `:sioc/Site` class represents the location of an online community
or set of communities, with UserAccounts and Usergroups creating Items
in a set of Containers. It can be thought of as a web-accessible data
Space. It is a subclass of `:sioc/Space`.

The properties associated with this class include:

- `:sioc/host_of`
- `:sioc/has_administrator`

In the context of a Linked Data Platform using Datomic, a `:sioc/Site`
could represent a website or online platform that hosts one or more
online communities. The `:sioc/host_of` property could be used to link
the site to the `:sioc/Container` instances (e.g., forums, blogs, chat
rooms) it hosts, and the `:sioc/has_administrator` property could be
used to link the site to the `:sioc/UserAccount` instance of the user
who administers the site.

## :sioc/Thread

The `:sioc/Thread` class represents a container for a series of
threaded discussion Posts or Items. It is a subclass of
`:sioc/Container`.

This class does not have any specific properties associated with it,
but as a subclass of `:sioc/Container`, it inherits all the properties
of that class. These include:

- `:sioc/last_item_date`
- `:sioc/has_subscriber`
- `:sioc/container_of`
- `:sioc/has_parent`
- `:sioc/num_items`
- `:sioc/has_host`
- `:sioc/parent_of`

In the context of a Linked Data Platform using Datomic, a
`:sioc/Thread` could represent a discussion thread in a forum or a
comment thread on a blog post. The inherited properties can be used to
model the structure and content of the thread. For example, the
`:sioc/container_of` property could be used to link the thread to the
`:sioc/Post` instances (e.g., comments) it contains, and the
`:sioc/has_subscriber` property could be used to link the thread to
the `:sioc/UserAccount` instances of users who are subscribed to the
thread.

## :sioc/Usergroup

The `:sioc/Usergroup` class represents a set of UserAccounts whose
owners have a common purpose or interest. It can be used for access
control purposes. The `:owl/disjointWith` property indicates that this
class is disjoint with the `:sioc/UserAccount`, `:sioc/Space`,
`:sioc/Role`, `:sioc/Item`, and `:sioc/Container` classes.

The properties associated with this class include:

- `:sioc/has_member`
- `:sioc/usergroup_of`

In the context of a Linked Data Platform using Datomic, a
`:sioc/Usergroup` could represent a group of users in an online
community who share a common interest or role. The `:sioc/has_member`
property could be used to link the usergroup to the
`:sioc/UserAccount` instances of its members, and the
`:sioc/usergroup_of` property could be used to link the usergroup to
the `:sioc/Space` instances (e.g., forums, chat rooms) where it is
active.
