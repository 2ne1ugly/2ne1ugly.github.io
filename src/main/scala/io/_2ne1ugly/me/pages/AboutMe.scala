package io._2ne1ugly.me
package pages

import com.raquo.laminar.api.L._
import io._2ne1ugly.me.components.md
import zio.prelude.fx.ZPure

object AboutMe {
  def render: PageRender = ZPure.succeed(
    div(
      md("""
          |Currently,
          |
          |# Game server developer
          |## Devsisters, Cookierun: Kingdom (2020-10 ~)
          |- We run one single global server
          |- We handle many-many requests 
          |- We made huge money
          |- We do scala + functional programming
          |- We adopted DDD, Event Sourcing, Actor model
          |- We use Akka, kafka, cockroachdb, grpc
          |- We utilize cats, zio(and its friends), doobie and many other libraries
          |- We are blessed with , kubernetes, elk, datadog, and countless other stacks
          |""".stripMargin)
    ).withTitle("2ne1ugly's github")
  )
}
