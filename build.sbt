name := "Spark Stats"

version := "1.0"

val scalaVersion212 = "2.12.20"
val scalaVersion213 = "2.13.16"

scalaVersion := scalaVersion212

val sparkVersion212 = "3.5.6"
val sparkVersion213 = "4.0.0"

val sparkVersion = sparkVersion212

crossScalaVersions := Seq(scalaVersion212, scalaVersion213)

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
