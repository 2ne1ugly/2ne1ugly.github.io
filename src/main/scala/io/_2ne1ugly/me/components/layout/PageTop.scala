package io._2ne1ugly.me.components.layout

import com.raquo.laminar.api.L._

object PageTop {
  def apply(): Element =
    nav(
      cls := "border-b-2 sticky top-0 bg-white",
      div(
        cls := "max-w-7xl mx-auto px-2 sm:px-6 lg:px-8",
        div(
          cls := "flex items-center justify-between h-16",
          div(
            cls := "flex items-center space-x-8",
            a(
              cls := "border-b-2 border-transparent font-display flex-shrink-0",
              cls := "hover:border-gray-500 hover:text-black",
              article(
                cls := "prose lg:prose-xl text-black",
                "2ne1ugly"
              ),
              href := "/"
            ),
            a(
              cls := "border-b-2 border-transparent font-display",
              cls := "hover:border-gray-500 hover:text-black",
              href := "/writings",
              "writings"
            ),
            a(
              cls := "border-b-2 border-transparent font-display",
              cls := "hover:border-gray-500 hover:text-black",
              href := "/doings",
              "doings"
            ),
            a(
              cls := "border-b-2 border-transparent font-display",
              cls := "hover:border-gray-500 hover:text-black",
              href := "/about-me",
              cls := "flex-shrink-0",
              "about me"
            )
          )
        )
      )
    )
}
