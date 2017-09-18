organization := "nl.biopet"
name := "biopet-utils"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.11"

lazy val biopetUtils = (project in file("."))

lazy val biopetToolUtils = (project in file("biopet-tool-utils"))
  .dependsOn(biopetUtils)
lazy val biopetNgsUtils = (project in file("biopet-ngs-utils"))
  .dependsOn(biopetUtils)

resolvers += Resolver.mavenLocal

libraryDependencies += "log4j" % "log4j" % "1.2.17"
