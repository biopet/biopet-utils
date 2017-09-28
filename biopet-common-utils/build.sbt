organization := "nl.biopet"
name := "biopet-common-utils"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.11"

resolvers += Resolver.mavenLocal

libraryDependencies += "log4j" % "log4j" % "1.2.17"
libraryDependencies += "commons-io" % "commons-io" % "2.1"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.3"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % Test
libraryDependencies += "org.testng" %% "testng" % "6.8" % Test
