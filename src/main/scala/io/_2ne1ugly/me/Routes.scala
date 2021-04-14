package io._2ne1ugly.me

import com.raquo.laminar.api.L._
import io._2ne1ugly.me.components._
import io.frontroute._
import org.scalajs.dom

object Routes {

  private val (page, route) = makeRoute[Page] { render =>
    concat(
      pathEnd(render(Page.Home)),
      path("writings")(render(Page.Writings)),
      path("doings")(render(Page.Doings)),
      path("about me")(render(Page.AboutMe)),
      render(Page.NotFound)
    )
  }

  def start(): Unit = {
    val appContainer = dom.document.querySelector("#app")
    val appContent   = layout.PageWrap(page)
    appContainer.innerHTML = ""
    render(appContainer, appContent)
    runRoute(route, LocationProvider.browser(windowEvents.onPopState))(unsafeWindowOwner)
    BrowserNavigation.emitPopStateEvent()
  }
}
