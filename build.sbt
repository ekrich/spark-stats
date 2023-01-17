name := "Spark Stats"

version := "1.0"

scalaVersion := "2.13.10"

val sparkVersion = "3.3.1"

scalacOptions ++= Seq(
  "-feature"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion
)

fork in run := true
