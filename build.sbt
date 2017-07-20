name := "Spark Stats"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.2.0"

scalacOptions ++= Seq(
    "-feature"
)

libraryDependencies ++= Seq(
 "org.apache.spark" %% "spark-core" % sparkVersion
)

val gitHeadCommitSha = taskKey[String]("Determines the current git commit SHA: ")
gitHeadCommitSha := {
  val result = Process("git rev-parse HEAD").lines.head
  println("GIT head commit SHA: " + result)
  result
}

fork in run := true