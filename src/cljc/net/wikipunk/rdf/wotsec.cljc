(ns net.wikipunk.rdf.wotsec
  {:dc11/title          {:rdf/language "en",
                         :rdf/value
                         "Security mechanisms for the Web of Things"},
   :dcat/downloadURL    "net/wikipunk/ext/security.ttl",
   :dcterms/contributor {:xsd/anyURI "https://vcharpenay.link/#me"},
   :dcterms/creator     {:xsd/anyURI "mailto:michael.mccool@intel.com"},
   :dcterms/license     {:xsd/anyURI "http://purl.org/NET/rdflicense/cc-by4.0"},
   :namespaces          {"dc11" "http://purl.org/dc/elements/1.1/",
                         "dcterms" "http://purl.org/dc/terms/",
                         "foaf" "http://xmlns.com/foaf/0.1/",
                         "owl" "http://www.w3.org/2002/07/owl#",
                         "prov" "http://www.w3.org/ns/prov#",
                         "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                         "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                         "schema" "http://schema.org/",
                         "vann" "http://purl.org/vocab/vann/",
                         "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                         "wotsec" "https://www.w3.org/2019/wot/security#",
                         "xml" "http://www.w3.org/XML/1998/namespace",
                         "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo     "0.0.1",
   :rdf/type            :owl/Ontology,
   :rdfa/prefix         "wotsec",
   :rdfa/uri            "https://www.w3.org/2019/wot/security#",
   :vann/preferredNamespacePrefix "wotsec",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/security#",
   :xsd/anyURI          "https://www.w3.org/2019/wot/security#"}
  (:refer-clojure :exclude [format identity name proxy]))

(def APIKeySecurityScheme
  {:db/ident :wotsec/APIKeySecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "API key authentication security configuration identified by the term <code>apikey</code> (i.e., <code>\"scheme\": \"apikey\"</code>).  This scheme is to be used when the access token is opaque, for example when a key in a proprietary format is provided by a cloud service provider.  In this case the key may not be using a standard token format.  This scheme indicates that the key provided by the service provider needs to be supplied as part of service requests using the mechanism indicated by the <code>\"in\"</code> field."},
   :rdfs/label "APIKeySecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def AutoSecurityScheme
  {:db/ident :wotsec/AutoSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An automatic authentication security configuration identified by the term <code>auto</code> (i.e., <code>\"scheme\": \"auto\"</code>). This scheme indicates that the security parameters are going to be negotiated by the underlying protocols at runtime, subject to the respective specifications for the protocol (e.g. [[!RFC8288]] for Basic Authentication when using HTTP)."},
   :rdfs/label "AutoSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def BasicSecurityScheme
  {:db/ident :wotsec/BasicSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Basic authentication security configuration identified by the term <code>basic</code> (i.e., <code>\"scheme\": \"basic\"</code>), using an unencrypted username and password."},
   :rdfs/label "BasicSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def BearerSecurityScheme
  {:db/ident :wotsec/BearerSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Bearer token authentication security configuration identified by the term <code>bearer</code> (i.e., <code>\"scheme\": \"bearer\"</code>).  This scheme is intended for situations where bearer tokens are used independently of OAuth2.  If the <code>oauth2</code> scheme is specified it is not generally necessary to specify this scheme as well as it is implied.  For <code>format</code>, the value <code>jwt</code> indicates conformance with RFC7519, <code>jws</code> indicates conformance with RFC7797, <code>cwt</code> indicates conformance with RFC8392, and <code>jwe</code> indicates conformance with !RFC7516, with values for <code>alg</code> interpreted consistently with those standards. <span class=\"rfc2119-assertion\" id=\"td-security-bearer-format-extensions\">Other formats and algorithms for bearer tokens MAY be specified in vocabulary extensions.</span>"},
   :rdfs/label "BearerSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def ComboSecurityScheme
  {:db/ident :wotsec/ComboSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "<p>A combination of other security schemes identified by the <a>Vocabulary Term</a> <code>combo</code> (i.e., <code>\"scheme\": \"combo\"</code>).  Elements of this scheme define various ways in which other named schemes defined in <code>securityDefinitions</code>, including other <a href=\"#combosecurityscheme\"><code>ComboSecurityScheme</code></a> definitions, are to be combined to create a new scheme definition.  <span class=\"rfc2119-assertion\" id=\"td-security-combo-exclusive-oneof-or-allof\">Exactly one of either <code>oneOf</code> or <code>allOf</code> MUST be included.</span> <!-- Redundant, table states \"two or more\" already <scan class=\"rfc2119-assertion\">The array given as a value associated with either <code>oneOf</code> or <code>allOf</code> MUST have at least two elements.</scan> --> Only security scheme definitions which can be used together can be combined with <code>allOf</code>.  For example, it is not possible in general to combine different OAuth 2.0 flows together using <code>allOf</code> unless one applies to a proxy and one to the endpoint.  Note that when multiple named security scheme definitions are listed in a <code>security</code> field the same semantics apply as in an <code>allOf</code> combination (and the same limitations on allowable combinations).  The <code>oneOf</code> combination is equivalent to using different security schemes on forms that are otherwise identical.  In this sense a <code>oneOf</code> scheme is not an essential feature but it does avoid redundancy in such cases.</p>"},
   :rdfs/label "ComboSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def DigestSecurityScheme
  {:db/ident :wotsec/DigestSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Digest authentication security configuration identified by the term <code>digest</code> (i.e., <code>\"scheme\": \"digest\"</code>). This scheme is similar to basic authentication but with added features to avoid man-in-the-middle attacks."},
   :rdfs/label "DigestSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def NoSecurityScheme
  {:db/ident :wotsec/NoSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A security configuration corresponding to identified by the term <code>nosec</code> (i.e., <code>\"scheme\": \"nosec\"</code>), indicating there is no authentication or other mechanism required to access the resource."},
   :rdfs/label "NoSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def OAuth2SecurityScheme
  {:db/ident :wotsec/OAuth2SecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "<p>OAuth 2.0 authentication security configuration for systems conformant with [[!RFC6749]] and [[!RFC8252]], <!-- and (for the <code>device</code> flow) [[!RFC8628]],--> identified by the <a>Vocabulary Term</a> <code>oauth2</code> (i.e., <code>\"scheme\": \"oauth2\"</code>). <span class=\"rfc2119-assertion\" id=\"td-security-oauth2-code-flow\">For the <code>code</code> flow both <code>authorization</code> and <code>token</code> MUST be included.</span> <span class=\"rfc2119-assertion\" id=\"td-security-oauth2-client-flow\">For the <code>client</code> flow <code>token</code> MUST be included.</span> <span class=\"rfc2119-assertion\" id=\"td-security-oauth2-client-flow-no-auth\">For the <code>client</code> flow <code>authorization</code> MUST NOT be included.</span> <!-- <span class=\"rfc2119-assertion\" id=\"td-security-oauth2-device-flow\">For the <code>device</code> flow both <code>authorization</code> and <code>token</code> MUST be included.</span> In the case of the <code>device</code> flow the value provided for <code>authorization</code> refers to the device authorization endpoint defined in [[!RFC8628]].--> The mandatory elements for each flow are summarized in the following table: <table class=\"def\"> <tr><th>Element</th><th><code>code</code></th><th><code>client</code></th><!-- <th><code>device</code></th> --></tr> <tr><td><code>authorization</code></td><td>mandatory</td><td>omit</td><!-- <td>mandatory; refers to device authorization endpoint</td> --></tr> <tr><td><code>token</code></td><td>mandatory</td><td>mandatory</td><!-- <td>mandatory</td> --></tr> <tr><td><code>refresh</code></td><td>optional</td><td>optional</td><!-- <td>optional</td> --></tr> </table> </p> <!-- <p class=\"ednote\"> Note that the table below lists these elements as \"optional\".  In fact whether they are mandatory or not depends on the flow.  The <code>token</code> element is listed as optional even though it is mandatory for all predefined flows since it might not be mandatory for some flows defined in an extension.  We should investigate whether there is a better way to express these \"variant record\" constraints.</p><p>If multiple flows are available (for example, multiple OAuth 2.0 security schemes with different flows are given for a <code>Form</code>) then only one may be selected for use by a <a>Consumer</a>. <span class=\"rfc2119-assertion\" id=\"td-security-oauth2-other-flows\">If an OAuth 2.0 flow other than <code>code</code>, <code>client</code> or <code>device</code> needs to be specified an extension vocabulary MUST be used.</span> This includes the <code>password</code> and <code>implicit</code> flows, which are no longer considered best practice [[WOT-SECURITY-GUIDELINES]]. This also applies to flows that are similar at the protocol level but do not exactly follow the OAuth 2.0 specification, for example by automating grants rather than invoking a user agent to interact with a human resource owner.  If no <code>scopes</code> are defined in the <code>SecurityScheme</code> then they are considered to be empty.</p> <p class=\"ednote\">The device authorization endpoint technically uses a different protocol than the authorization endpoint used by other flows, and it might be possible for a developer to confuse the two.  However, since the <code>device</code> flow does not use the regular authorization endpoint there should be no ambiguity.  We are considering however an alternative design where there is a separate element, <code>device_authorization</code>, which MUST be included for the <code>device</code> flow (and then the regular authorization endpoint then MUST NOT be used).</p> -->"},
   :rdfs/label "OAuth2SecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def PSKSecurityScheme
  {:db/ident :wotsec/PSKSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Pre-shared key authentication security configuration identified by the term <code>psk</code> (i.e., <code>\"scheme\": \"psk\"</code>).  This is meant to identify that a standard is used for pre-shared keys such as TLS-PSK [[rfc4279]], and that the ciphersuite used for keys will be established during protocol negotiation."},
   :rdfs/label "PSKSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def PoPSecurityScheme
  {:db/ident :wotsec/PoPSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "Proof-of-possession (PoP) token authentication security configuration identified by the term <code>pop</code> (i.e., <code>\"scheme\": \"pop\"</code>). Here <code>jwt</code> indicates conformance with !RFC7519, <code>jws</code> indicates conformance with !RFC7797, <code>cwt</code> indicates conformance with !RFC8392, and <code>jwe</code> indicates conformance with RFC7516, with values for <code>alg</code> interpreted consistently with those standards. <span class=\"rfc2119-assertion\" id=\"td-security-pop-format-extensions\">Other formats and algorithms for PoP tokens MAY be specified in vocabulary extensions.</span>",
   :rdfs/label "PoPSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def PublicSecurityScheme
  {:db/ident :wotsec/PublicSecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "Raw public key asymmetric key security configuration identified by the term <code>public</code> (i.e., <code>\"scheme\": \"public\"</code>).",
   :rdfs/label "PublicSecurityScheme",
   :rdfs/subClassOf :wotsec/SecurityScheme})

(def SecurityScheme
  {:db/ident :wotsec/SecurityScheme,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "<p>Metadata describing the configuration of a security mechanism. <span class=\"rfc2119-assertion\" id=\"td-security-scheme-name\">The value assigned to the name <code>scheme</code> <em class=\"rfc2119\" title=\"MUST\">MUST</em> be defined within a <a href=\"#dfn-vocab-term\" class=\"internalDFN\" data-link-type=\"dfn\">Vocabulary</a> included in the <a href=\"#dfn-thing-description\" class=\"internalDFN\" data-link-type=\"dfn\">Thing Description</a>, either in the standard <a href=\"#dfn-vocab-term\" class=\"internalDFN\" data-link-type=\"dfn\">Vocabulary</a> defined in <a href=\"#sec-vocabulary-definition\" class=\"sec-ref\">§&nbsp;<bdi class=\"secno\">5.</bdi> TD Information Model</a> or in a <a href=\"#dfn-context-ext\" class=\"internalDFN\" data-link-type=\"dfn\">TD Context Extension</a>.</span> </p><p> <span class=\"rfc2119-assertion\" id=\"td-security-no-secrets\">For all security schemes, any keys, passwords, or other sensitive information directly providing access <em class=\"rfc2119\" title=\"MUST NOT\">MUST NOT</em> be stored in the TD and should instead be shared and stored out-of-band via other mechanisms.</span> The purpose of a TD is to describe how to access a Thing if and only if a Consumer already has authorization, and is not meant be used to grant that authorization.</p><p>Each security scheme object used in a TD defines a set of requirements to be met before access can be granted.  We say a security scheme is <em>satisfied</em> when all its requirements are met.  In some cases requirements from multiple security schemes will have to be met before access can be granted.</p><p>Security schemes generally may require additional authentication parameters, such as a password or key.  The location of this information is indicated by the value associated with the name <code>in</code>, often in combination with the value associated with <code>name</code>.  The <code>in</code> name can take one of the following values: <dl> <dt><code>header</code>:</dt> <dd>The parameter will be given in a header provided by the protocol, with the name of the header provided by the value of <code>name</code>.</dd> <dt><code>query</code>:</dt> <dd>The parameter will be appended to the URI as a query parameter, with the name of the query parameter provided by <code>name</code>.</dd> <dt><code>body</code>:</dt> <dd>The parameter will be provided in the body of the request payload, with the data schema element  used provided by <code>name</code>. <span class=\"rfc2119-assertion\" id=\"sec-body-name-json-pointer\">When used in the context of a <code>body</code> security information location, the value of <code>name</code> <em class=\"rfc2119\" title=\"MUST\">MUST</em> be in the form of a JSON pointer [[!RFC6901]] relative to the root of the input <code>DataSchema</code> for each interaction it is used with.</span> Since this value is not a fragment identifier, and is not relative to the root of the TD but to whichever data schemas the security scheme is bound to, this value should not start with \"<code>#</code>\"; it is a \"pure\" JSON pointer. Since this value is not a fragment identifier, it also does not need to URL-encode special characters.  The targeted element may or may not already exist at the specified location in the referenced data schema.  If it does not, it will be inserted. This avoids having to duplicate definitions in the data schemas of every interaction.  <span class=\"rfc2119-assertion\" id=\"sec-body-name-json-pointer-creatable\">When an element of a data schema indicated by a JSON pointer indicated in a <code>body</code> locator does not already exist in the indicated schema, it <em class=\"rfc2119\" title=\"MUST\">MUST</em> be possible to insert the indicated element at the location indicated by the pointer.</span>. For example, pointing to a key of a Map where that key does not exist in the corresponding Data Schema, the key and its value, which is the credential, would be inserted to the Map at the specified location during the operation execution. On the other hand, pointing to an Array's item with a number as the item index, that number should be outside the range of the Array's already specified items in order to not alter the strict sequence of items. <span class=\"rfc2119-assertion\" id=\"sec-body-name-json-pointer-array\">The JSON pointer used in the <code>body</code> locator <em class=\"rfc2119\" title=\"MAY\">MAY</em> use the \"<code>-</code>\" character to indicate a non-existent array element when it is necessary to insert an element after the last element of an existing array.</span> <span class=\"rfc2119-assertion\" id=\"sec-body-name-json-pointer-type\">The element referenced (or created) by a <code>body</code> security information location <em class=\"rfc2119\" title=\"MUST\">MUST</em> be required and of type \"<code>string</code>\".</span> If <code>name</code> is not given, it is assumed the entire body is to be used as the security parameter.  </dd> <dt><code>cookie</code>:</dt> <dd>The parameter is stored in a cookie identified by the value of <code>name</code>.  </dd> <dt><code>uri</code>:</dt> <dd>The parameter is embedded in the URI itself, which is encoded in the relevant interaction using a URI template variable defined by the value of <code>name</code>.  This is more general than the <code>query</code> mechanism but more complex.  <span class=\"rfc2119-assertion\" id=\"td-security-in-query-over-uri\">The value <code>uri</code> <em class=\"rfc2119\" title=\"SHOULD\">SHOULD</em> be specified for <code>in</code> in a security scheme only if <code>query</code> is not applicable.</span>  <span class=\"rfc2119-assertion\" id=\"td-security-in-uri-variable\">The URIs provided in interactions where a security scheme using <code>uri</code> <em class=\"rfc2119\" title=\"MUST\">MUST</em> be a URI template including the defined variable.</span></dd><dt><code>auto</code>:</dt><dd>The location is determined as part of the protocol, or negotiated. <span class=\"rfc2119-assertion\" id=\"sec-security-vocab-auto-in-no-name\">If a value of <code>auto</code> is set for the <code>in</code> field of a <code>SecurityScheme</code>, then the <code>name</code> field SHOULD NOT be set.</span> In this case, the application of the <code>SecurityScheme</code> is subject to the respective specification for the given protocol (e.g. [[!RFC8288]] when using the <code>BasicSecurityScheme</code> with HTTP).</dd></dl> If multiple parameters are needed for a security scheme, repeat the security scheme definition for each parameter and combine them using a <code>combo</code> security scheme and <code>allOf</code>.  In some cases parameters may not actually be secret but a user may wish to leave them out of the TD to help protect privacy.  As an example of this, some security mechanisms require both a client identifier and a secret key. In theory, the client identifier is public however it may be hard to update and pose a tracking risk. In such a case it can be provided as an additional security parameter so it does not appear in the TD.</p><p><span class=\"rfc2119-assertion\" id=\"td-security-uri-variables-distinct\">The names of URI variables declared in a <code>SecurityScheme</code> <em class=\"rfc2119\" title=\"MUST\">MUST</em> be distinct from all other URI variables declared in the TD.</span></p>",
   :rdfs/label "SecurityScheme"})

(def alg
  {:db/ident     :wotsec/alg,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Encoding, encryption, or digest algorithm."},
   :rdfs/label   "alg",
   :schema/domainIncludes :wotsec/BearerSecurityScheme})

(def allOf
  {:db/ident :wotsec/allOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Array of two or more strings identifying other named security scheme definitions, all of which must be satisfied for access."},
   :rdfs/label "allOf",
   :schema/domainIncludes :wotsec/ComboSecurityScheme})

(def apikeyIn
  {:db/ident :wotsec/apikeyIn,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the location of security authentication information."},
   :rdfs/label "in",
   :schema/domainIncludes :wotsec/APIKeySecurityScheme})

(def authorization
  {:db/ident     :wotsec/authorization,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "URI of the authorization server."},
   :rdfs/label   "authorization",
   :schema/domainIncludes #{:wotsec/OAuth2SecurityScheme
                            :wotsec/BearerSecurityScheme}})

(def flow
  {:db/ident     :wotsec/flow,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Authorization flow."},
   :rdfs/label   "flow",
   :schema/domainIncludes :wotsec/OAuth2SecurityScheme})

(def format
  {:db/ident     :wotsec/format,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies format of security authentication information."},
   :rdfs/label   "format",
   :schema/domainIncludes #{:wotsec/BearerSecurityScheme
                            :wotsec/PoPSecurityScheme}})

(def identity
  {:db/ident :wotsec/identity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Identifier providing information which can be used for selection or confirmation.",
   :rdfs/label "identity",
   :schema/domainIncludes :wotsec/PSKSecurityScheme})

(def in
  {:db/ident :wotsec/in,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the location of security authentication information."},
   :rdfs/label "in",
   :schema/domainIncludes
   #{:wotsec/BearerSecurityScheme :wotsec/PoPSecurityScheme
     :wotsec/BasicSecurityScheme :wotsec/DigestSecurityScheme}})

(def name
  {:db/ident     :wotsec/name,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Name for query, header, cookie, or uri parameters.",
   :rdfs/label   "name",
   :schema/domainIncludes
   #{:wotsec/BearerSecurityScheme :wotsec/PoPSecurityScheme
     :wotsec/BasicSecurityScheme :wotsec/APIKeySecurityScheme
     :wotsec/DigestSecurityScheme}})

(def oneOf
  {:db/ident :wotsec/oneOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Array of two or more strings identifying other named security scheme definitions, any one of which, when satisfied, will allow access.  Only one may be chosen for use."},
   :rdfs/label "oneOf",
   :schema/domainIncludes :wotsec/ComboSecurityScheme})

(def proxy
  {:db/ident :wotsec/proxy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "URI of the proxy server this security configuration provides access to.  If not given, the corresponding security configuration is for the endpoint.  <br/>This feature is at risk."},
   :rdfs/label "proxy",
   :schema/domainIncludes :wotsec/SecurityScheme})

(def qop
  {:db/ident     :wotsec/qop,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Quality of protection.  <br/>This feature is at risk.",
   :rdfs/label   "qop",
   :schema/domainIncludes :wotsec/DigestSecurityScheme})

(def refresh
  {:db/ident     :wotsec/refresh,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "URI of the refresh server."},
   :rdfs/label   "refresh",
   :schema/domainIncludes :wotsec/OAuth2SecurityScheme})

(def scopes
  {:db/ident :wotsec/scopes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Set of authorization scope identifiers provided as an array.  These are provided in tokens returned by an authorization server and associated with forms in order to identify what resources a client may access and how.  The values associated with a form should be chosen from those defined in an <code>OAuth2SecurityScheme</code> active on that form.  <br/>This feature is at risk."},
   :rdfs/label "scopes",
   :schema/domainIncludes :wotsec/OAuth2SecurityScheme})

(def token
  {:db/ident     :wotsec/token,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "URI of the token server."},
   :rdfs/label   "token",
   :schema/domainIncludes :wotsec/OAuth2SecurityScheme})

(def urn:uuid:c1f5969f-5e48-5a7e-9890-3b734fb61950
  {:dc11/title          {:rdf/language "en",
                         :rdf/value
                         "Security mechanisms for the Web of Things"},
   :dcterms/contributor {:xsd/anyURI "https://vcharpenay.link/#me"},
   :dcterms/creator     {:xsd/anyURI "mailto:michael.mccool@intel.com"},
   :dcterms/license     {:xsd/anyURI "http://purl.org/NET/rdflicense/cc-by4.0"},
   :owl/versionInfo     "0.0.1",
   :rdf/type            :owl/Ontology,
   :vann/preferredNamespacePrefix "wotsec",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/security#",
   :xsd/anyURI          "https://www.w3.org/2019/wot/security#"})