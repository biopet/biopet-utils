organization := "nl.biopet"
name := "biopet-config-utils"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.11"

resolvers += Resolver.mavenLocal

libraryDependencies += "nl.biopet" %% "biopet-utils" % "0.1.0-SNAPSHOT"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.3"
libraryDependencies += "org.yaml" % "snakeyaml" % "1.17"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % Test
libraryDependencies += "org.testng" % "testng" % "6.8" % Test
