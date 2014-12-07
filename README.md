couchbase-scala
===============
This is a library for accessing Couchbase in Scala.

couchbase-scala is [published to maven center](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.sandinh%22%20couchbase-scala)

## Changelogs
we use [Semantic Versioning](http://semver.org/)

##### v3.0.1
only update libs:
```
  "com.couchbase.client"  %  "java-client" % "2.0.2",
  "io.reactivex"          %% "rxscala"     % "0.23.0",
  "io.reactivex"          % "rxjava"       % "1.0.2",
  "com.typesafe.play"     %% "play-json"   % "2.3.7"
```

##### v3.0.0
+ update rxjava 1.0.1
+ typeof CBCluster.openBucket & CaoBase.bucket is changed from ScalaBucket to Observable[ScalaBucket]
+ typeof CBCluster.disconnect() is changed from Boolean to Observable[Boolean]
+ remove CBCluster.disconnect(FiniteDuration)
+ setBulk in WithCaoKey1 & WithCaoKey2 now use concatMap instead of flatMap to preserve ordering of result with the params
+ fixes http://www.couchbase.com/issues/browse/JCBC-642

##### v2.0.1
narrow dependencies from guice to javax.inject

##### v2.0.0
first public version

## Licence
This software is licensed under the Apache 2 license:
http://www.apache.org/licenses/LICENSE-2.0

Copyright 2014 Sân Đình (http://sandinh.com)
