package io._2ne1ugly.me
package pages

import com.raquo.laminar.api.L._
import zio.prelude.fx.ZPure

object AboutMe {
  def render: PageRender = ZPure.succeed(
    div(
      "No info for you :("
    ).withTitle("2ne1ugly's github")
  )
}
