name := "Spark Stats"

version := "1.0"

val scalaVersion212 = "2.12.20"
val scalaVersion213 = "2.13.16"
val scalaVersion3 = "3.3.6"

scalaVersion := scalaVersion212

val sparkVersion3 = "3.5.6"
val sparkVersion4 = "4.0.0"

crossScalaVersions := Seq(scalaVersion212, scalaVersion213, scalaVersion3)

val isScala212 = Def.setting {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, 12)) => true
    case _             => false
  }
}

scalacOptions ++= Seq(
  "-feature",
  "-deprecation"
)

libraryDependencies ++= {
  if (isScala212.value)
    Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion3
    )
  else
    Seq(
      ("org.apache.spark" %% "spark-core" % sparkVersion4).cross(
        CrossVersion.for3Use2_13
      )
    )
}

Compile / run / fork := true

javaOptions ++= Seq(
  "-XX:+IgnoreUnrecognizedVMOptions",
  "--add-opens=java.base/java.nio=ALL-UNNAMED",
  "--add-opens=java.base/sun.nio.ch=ALL-UNNAMED",
  "--add-opens=java.base/java.lang=ALL-UNNAMED",
  "--add-opens=java.base/java.lang.invoke=ALL-UNNAMED",
  "--add-opens=java.base/jdk.internal.misc=ALL-UNNAMED"
)
