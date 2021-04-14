package io._2ne1ugly.me
package pages

import com.raquo.laminar.api.L._
import zio.prelude.fx.ZPure

object Home {
  def render: PageRender = ZPure.succeed(
    div(
      button(
        cls := "bg-purple-500",
        "Hello yall"
      ),
      input(
        placeholder := "enter here"
      )
    ).withTitle("2ne1ugly's github")
  )
}
