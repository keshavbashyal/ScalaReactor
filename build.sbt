name := "ScalaReactor"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies +=
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4-SNAPSHOT"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1"

libraryDependencies += "org.apache.spark" %% "spark-graphx" % "1.4.1"