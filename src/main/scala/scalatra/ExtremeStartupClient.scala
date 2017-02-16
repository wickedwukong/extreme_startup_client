package scalatra

import org.scalatra.ScalatraServlet


class ExtremeStartupClient extends ScalatraServlet {

  get("/") {
    "The server is running"
  }

}