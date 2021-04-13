package io._2ne1ugly

import com.raquo.laminar.api.L._
import io._2ne1ugly.me.models.RenderError
import zio.prelude.fx.ZPure

package object me {
  type PageRender = ZPure[Nothing, Unit, Unit, Any, RenderError, RenderedPage]
  case class RenderedPage(title: String, element: Element)

  abstract class Page(val render: PageRender)

  object Page {
    case object Home extends Page(pages.Home.render)
    case object NotFound extends Page(pages.NotFound.render)
  }
}
