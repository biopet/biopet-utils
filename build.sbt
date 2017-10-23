organization := "com.github.biopet"
name := "utils"

scalaVersion := "2.11.11"

resolvers += Resolver.mavenLocal

lazy val utils = (project in file("."))
  .aggregate(toolUtils, ngsUtils, commonUtils)

lazy val testUtils = project in file("test-utils")

lazy val commonUtils = (project in file("common-utils")).dependsOn(testUtils)
lazy val toolUtils = (project in file("tool-utils")).dependsOn(commonUtils)
lazy val ngsUtils = (project in file("ngs-utils")).dependsOn(commonUtils)
lazy val sparkUtils = (project in file("spark-utils")).dependsOn(commonUtils)
