organization := "com.github.biopet"
name := "biopet-utils"

scalaVersion := "2.11.11"

resolvers += Resolver.mavenLocal

lazy val biopetUtils = (project in file("."))
  .aggregate(biopetToolUtils, biopetConfigUtils, biopetNgsUtils, biopetCommonUtils, biopetSummaryUtils)

lazy val biopetTestUtils = project in file("biopet-test-utils")

lazy val biopetCommonUtils = (project in file("biopet-common-utils")).dependsOn(biopetTestUtils)
lazy val biopetSummaryUtils = (project in file("biopet-summary-utils")).dependsOn(biopetCommonUtils)
lazy val biopetToolUtils = (project in file("biopet-tool-utils")).dependsOn(biopetCommonUtils)
lazy val biopetConfigUtils = (project in file("biopet-config-utils")).dependsOn(biopetCommonUtils)
lazy val biopetNgsUtils = (project in file("biopet-ngs-utils")).dependsOn(biopetCommonUtils)
lazy val biopetSparkUtils = (project in file("biopet-spark-utils")).dependsOn(biopetCommonUtils)
