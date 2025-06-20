organization := "tv.cntt"
name := "slf4s-api"
version := "2.0.13"

crossScalaVersions := Seq("3.3.3")
scalaVersion := "3.3.3"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions := Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % version.value,

  "org.scalatest" %% "scalatest" % "3.2.17" % "test",
  "org.mockito" % "mockito-core" % "5.7.0" % "test",
  "ch.qos.logback" % "logback-classic" % "1.4.14" % "test"
)

// https://github.com/xerial/sbt-sonatype
publishTo := sonatypePublishToBundle.value
