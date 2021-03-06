name := "abhijeet_mohanty_cs441_course_project"

version := "0.1"

scalaVersion := "2.12.8"

sbtVersion := "1.1.2"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case PathList("reference.conf", xs @ _*) => MergeStrategy.concat
  case x => MergeStrategy.first
}

libraryDependencies ++= Seq(

  "com.typesafe" % "config" % "1.3.2",

  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",

  "ch.qos.logback" % "logback-classic" % "1.2.3",

  "org.scalactic" %% "scalactic" % "3.0.8",

  "org.scalatest" %% "scalatest" % "3.0.8" % "test",

  "org.scala-lang.modules" %% "scala-xml" % "1.1.1",

  // Akka dependency for akka actors
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.0",

// Akka dependency for creating and managing clusters
  "com.typesafe.akka" %% "akka-cluster-typed" % "2.6.0",

  "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.0" % Test,

  "com.typesafe.akka" %% "akka-remote" % "2.6.0",

  "com.typesafe.akka" %% "akka-http" % "10.1.11",

  "com.typesafe.akka" %% "akka-stream" % "2.6.0",

  "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.0",

  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.11"

)


mainClass in(Compile, run) := Some("com.akka.WebService")
mainClass in assembly := Some("com.akka.WebService")

enablePlugins(DockerPlugin)