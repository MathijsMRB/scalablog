name := "scalablog"

version := "0.1"

scalaVersion := "2.13.2"

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.2.0"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.6"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-slf4j" % "2.6.6",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
