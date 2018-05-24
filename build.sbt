organization := "com.github.biopet"
name := "Utils"

scalaVersion := "2.11.12"

biopetUrlName := "utils"

biopetIsTool := false

parallelExecution in Test := false

developers += Developer(id = "ffinfo",
                        name = "Peter van 't Hof",
                        email = "pjrvanthof@gmail.com",
                        url = url("https://github.com/ffinfo"))

lazy val utils = (project in file("."))
  .aggregate(toolUtils,
             ngsUtils,
             commonUtils,
             testUtils,
             toolTestUtils,
             sparkUtils,
             biowdlTestUtils)

lazy val testUtils = project in file("test-utils")

lazy val commonUtils = (project in file("common-utils")).dependsOn(testUtils)
lazy val biowdlTestUtils =
  (project in file("biowdl-test-utils")).dependsOn(commonUtils)
lazy val toolUtils = (project in file("tool-utils")).dependsOn(commonUtils)
lazy val toolTestUtils =
  (project in file("tool-test-utils")).dependsOn(toolUtils, testUtils)
lazy val ngsUtils = (project in file("ngs-utils")).dependsOn(commonUtils)
lazy val sparkUtils = (project in file("spark-utils")).dependsOn(commonUtils)
