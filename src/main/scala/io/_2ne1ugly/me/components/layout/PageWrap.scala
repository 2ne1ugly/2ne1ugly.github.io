package io._2ne1ugly.me
package components
package layout

import com.raquo.laminar.api.L._
import io.laminext.syntax.core._

object PageWrap {

  def apply($page: Signal[Option[Page]]): Element = {
    val titleElement   = org.scalajs.dom.document.head.querySelector("title")
    val $pageAndResult = $page.map(_.map(p => p.render.runEither))
    div(
      PageTop(),
      div(
        cls := "flex-1 flex p-4 min-h-screen",
        div(
          cls := "container mx-auto p-4 bg-white min-h-full",
          child <-- $pageAndResult.map {
            case None                      => "loading..."
            case Some(Left(error))         => s"Error: ${error.msg}"
            case Some(Right(renderedPage)) => renderedPage.element
          }
        )
      ),
      PageBottom(),
      $pageAndResult.bind {
        case None                      =>
          titleElement.textContent = "Loading..."
        case Some(Left(error))         =>
          titleElement.textContent = "errored :("
        case Some(Right(renderedPage)) =>
          titleElement.textContent = renderedPage.title
      }
    )
  }

}
