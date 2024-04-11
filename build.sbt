name := "Spark Stats"

version := "1.0"

scalaVersion := "2.13.13"

val sparkVersion = "3.5.1"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion
)

Compile / run / fork := true

javaOptions ++= Seq(
  "-XX:+IgnoreUnrecognizedVMOptions",
  "--add-opens=java.base/java.nio=ALL-UNNAMED",
  "--add-opens=java.base/sun.nio.ch=ALL-UNNAMED",
  "--add-opens=java.base/java.lang=ALL-UNNAMED",
  "--add-opens=java.base/java.lang.invoke=ALL-UNNAMED",
  "--add-opens=java.base/jdk.internal.misc=ALL-UNNAMED"
)
