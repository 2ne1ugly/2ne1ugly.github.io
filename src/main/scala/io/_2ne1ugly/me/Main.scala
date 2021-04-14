package io._2ne1ugly.me

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

import com.raquo.laminar.api.L._
import io.frontroute._
import org.scalajs.dom

@js.native
@JSImport("stylesheets/main.css", JSImport.Namespace)
object Css extends js.Any

object Main {
  val css: Css.type = Css

  def main(args: Array[String]): Unit = {
    val _ = documentEvents.onDomContentLoaded.foreach { _ =>
      LinkHandler.install()
      Routes.start()
    }(unsafeWindowOwner)
  }
}