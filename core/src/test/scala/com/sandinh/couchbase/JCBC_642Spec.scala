package com.sandinh.couchbase

import com.couchbase.client.java.document.JsonStringDocument
import com.google.inject.Inject

import scala.concurrent.ExecutionContext

class JCBC_642Spec @Inject() (implicit val executionContext: ExecutionContext)  extends GuiceSpecBase {
  "CBCluster" should {
    "pass JCBC-642" in {
      val content = "test_value_JCBC_642"
      val doc = JsonStringDocument.create("test_key_JCBC_642", 10000, content)
      cb.bk1.upsert(doc)
        .flatMap { d => cb.bk2.upsert(d) }
        .map(_.content) must beEqualTo(content).await
    }
  }
}
