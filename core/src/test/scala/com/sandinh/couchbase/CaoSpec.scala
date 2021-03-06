package com.sandinh.couchbase

import com.google.inject.Inject
import com.sandinh.couchbase.access.JsCao1

import scala.concurrent.ExecutionContext

class CaoSpec @Inject() (implicit val executionContext: ExecutionContext)  extends GuiceSpecBase {
  @Inject private var trophyCao: TrophyCao = _

  val username = "giabao"
  "Cao" should {
    "success set & get" in {
      trophyCao.set(username, Trophy.t1).map(_.content.as[Trophy]) must beEqualTo(Trophy.t1).await
      trophyCao.get(username) must beEqualTo(Trophy.t1).await
    }
  }
}

import javax.inject._

@Singleton
class TrophyCao @Inject() (cb: CB) extends JsCao1[Trophy, String](cb.bk1) {
  protected def key(username: String) = "test_cao_" + username
}