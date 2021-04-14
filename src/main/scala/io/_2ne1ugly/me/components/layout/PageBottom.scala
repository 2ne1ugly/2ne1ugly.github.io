package io._2ne1ugly.me.components.layout

import com.raquo.laminar.api.L._

object PageBottom {
  def apply(): Element =
    div(
      cls := "flex justify-center",
      "This website was built with scala.js + laminar"
    )
}
