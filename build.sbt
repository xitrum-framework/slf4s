organization := "tv.cntt"
name := "slf4s-api"
version := "1.7.25"

crossScalaVersions := Seq("2.11.8", "2.12.1")
scalaVersion := "2.12.1"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions := Seq("-unchecked", "-deprecation", "-language:experimental.macros")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.slf4j" % "slf4j-api" % version.value,

  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.8" % "test"
)
