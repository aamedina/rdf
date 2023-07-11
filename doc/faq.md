### FAQ

#### java.lang.IllegalArgumentException: Comparison method violates its general contract!
This happens when sorting extremely large collections in JDK 8+, like those in
the metaobjects hierarchy. 

Add to :jvm-opts "-Djava.util.Arrays.useLegacyMergeSort=true" in your
deps.edn alias.
