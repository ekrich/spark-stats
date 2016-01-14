name := "Spark Stats"

version := "1.0"

scalaVersion := "2.11.7"

val sparkVersion = "1.6.0"

libraryDependencies ++= Seq(
 "org.apache.spark" % "spark-core_2.11" % sparkVersion
)

val gitHeadCommitSha = taskKey[String]("Determines the current git commit SHA: ")
gitHeadCommitSha := {
  val result = Process("git rev-parse HEAD").lines.head
  println("GIT head commit SHA: " + result)
  result
}

fork in run := true