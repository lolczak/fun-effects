name := "fun-effects"

organization := "org.lolczak"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.5"

resolvers += "Tim Tennant's repo" at "http://dl.bintray.com/timt/repo/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.2" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.11.6" % "test" withSources() withJavadoc(),
  "com.chuusai" %% "shapeless" % "1.2.4" withSources() withJavadoc(),
  "joda-time" % "joda-time" % "2.4" withSources() withJavadoc(),
  "com.propensive" %% "rapture-json" % "1.0.8" withSources() withJavadoc(),
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2" withSources() withJavadoc(),
  "ch.qos.logback" % "logback-classic" % "1.1.2" withSources() withJavadoc()
)