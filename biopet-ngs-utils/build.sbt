organization := "nl.biopet"
name := "biopet-ngs-utils"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.11"

resolvers += Resolver.mavenLocal

libraryDependencies += "com.github.samtools" % "htsjdk" % "2.11.0"
