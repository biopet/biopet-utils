organization := "nl.biopet"
name := "biopet-tool-utils"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.11"

resolvers += Resolver.mavenLocal

libraryDependencies += "nl.biopet" %% "biopet-utils" % "0.1.0-SNAPSHOT"
libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.0"
