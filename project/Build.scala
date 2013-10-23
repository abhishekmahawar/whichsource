import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "whichsource"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    scalaVersion := "2.10.2",
    // Add your own project settings here 
    libraryDependencies ++= Seq("org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
      "com.typesafe.akka" %% "akka-actor" % "2.2.1",
      "com.typesafe.akka" %% "akka-testkit" % "2.2.1"
    )
  )

}
