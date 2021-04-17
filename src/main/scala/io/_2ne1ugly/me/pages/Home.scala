package io._2ne1ugly.me
package pages

import com.raquo.laminar.api.L._
import io._2ne1ugly.me.components._
import zio.prelude.fx.ZPure

object Home {
  def render: PageRender = ZPure.succeed(
    div(
      md(
        """
          |# Passionate Programmer
          |## What I like
          |- Graphics rendering
          |- Game engines
          |- Strong typed languages
          |- Programming languages with odd style
          |- Async/Parallel programming
          |- Functional programming
          |- Data oriented programming
          |- Improving development process
          |
          |## What I dislike
          |- Java
          |- Javascript
          |- Python
          |- Object oriented programming
          |- Golang. Because bad Type-generics/error-handling
          |- Current web ecosystem
          |- Doing web design ( just like this fake markdown )
          |
          |## What I want to learn right now
          |- Entity Component System
          |- Kubernetes (and many devops stacks)
          |""".stripMargin
      )
    ).withTitle("2ne1ugly's github")
  )

  def `#`(text: String): Element  = p(cls := "text-xl font-bold", text)
  def `##`(text: String): Element = p(cls := "text-lg", text)

}
