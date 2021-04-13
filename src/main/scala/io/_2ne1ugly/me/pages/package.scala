package io._2ne1ugly.me

import com.raquo.laminar.api.L._

package object pages {
  implicit class ElementOps(el: Element) {
    def withTitle(title: String): RenderedPage = RenderedPage(title, el)
  }
}
