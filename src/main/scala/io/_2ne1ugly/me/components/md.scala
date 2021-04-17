package io._2ne1ugly.me.components

import scala.util.matching.Regex

import com.raquo.laminar.api.L._

object md {
  private val h1Pattern: Regex          = "# (.+)".r
  private val h2Pattern: Regex          = "## (.+)".r
  private val bulletPointPattern: Regex = "- (.+)".r

  def apply(block: String): Element = div(
    block.linesIterator.map {
      case h1Pattern(text)          => p(cls := "text-xl font-bold", text)
      case h2Pattern(text)          => p(cls := "text-lg", text)
      case bulletPointPattern(text) => p(s"• $text")
      case ""                       => br()
      case plainText                => p(plainText)
    }.toList
  )
}
