organization := "nl.biopet"
name := "biopet-utils"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.11"

resolvers += Resolver.mavenLocal

lazy val biopetUtils = (project in file("."))
  .aggregate(biopetToolUtils, biopetConfigUtils, biopetNgsUtils, biopetCommonUtils)

lazy val biopetCommonUtils = (project in file("biopet-common-utils"))
lazy val biopetToolUtils = (project in file("biopet-tool-utils")).dependsOn(biopetCommonUtils)
lazy val biopetConfigUtils = (project in file("biopet-config-utils")).dependsOn(biopetCommonUtils)
lazy val biopetNgsUtils = (project in file("biopet-ngs-utils")).dependsOn(biopetCommonUtils)

