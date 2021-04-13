package io._2ne1ugly.me
package pages

import com.raquo.laminar.api.L._
import io._2ne1ugly.me.models.RenderError
import zio.prelude.fx.ZPure

object NotFound {
  def render: PageRender = ZPure.succeed(
    div("Not found!").withTitle("404")
  )
}
