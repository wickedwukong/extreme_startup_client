import io.dropwizard.{Application, Configuration}
import io.dropwizard.setup.{Bootstrap, Environment}

class ExtremeStartupClient extends Application[Configuration] {
  override def initialize(bootstrap: Bootstrap[Configuration]): Unit = {
  }

  override def run(configuration: Configuration, environment: Environment): Unit = {
    environment.jersey.register(new ExtremeStartupResource)
  }
}