package scalatra

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder

object ExtremeStartupServer extends App {

  val server = new Server(1337)
  val root = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS)
  root.addServlet(new ServletHolder(new ExtremeStartupClient), "/*")
  server.start()
}