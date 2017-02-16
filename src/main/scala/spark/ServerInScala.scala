package spark

import spark.Spark.{get, port}

object ServerInScala extends App {
  port(1337)
  get("hello", new HelloService)
}

class HelloService extends Route {
  override def handle(request: Request, response: Response): AnyRef = "Hello"
}