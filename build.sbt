name := "extreme_startup_client"

organization := "com.example"

version := "0.0.1"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "io.dropwizard" % "dropwizard-core" % "1.0.0" withSources() withJavadoc(),
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc()
)

initialCommands := "import com.example.extreme_startup_client._"

