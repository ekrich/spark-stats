name := "Spark Stats"

version := "1.0"

scalaVersion := "2.11.7"

val sparkVersion = "1.5.1"

libraryDependencies ++= Seq(
 "org.apache.spark" % "spark-core_2.11" % sparkVersion
)

fork in run := true