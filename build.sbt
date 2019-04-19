lazy val root = (project in file("."))
  .settings(
    name := "path-dependent-types",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.1.7"
    )
  )

scalafmtOnCompile in ThisBuild := true
