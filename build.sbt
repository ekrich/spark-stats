name := "Spark Stats"

version := "1.0"

scalaVersion := "2.13.10"

val sparkVersion = "3.3.2"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion
)

Compile / run / fork := true
