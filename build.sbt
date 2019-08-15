name := "Spark Stats"

version := "1.0"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.3"

scalacOptions ++= Seq(
  "-feature"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion
)

fork in run := true
