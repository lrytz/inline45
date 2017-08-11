resolvers += "prs" at "https://scala-ci.typesafe.com/artifactory/scala-pr-validation-snapshots"

scalaVersion := "2.13.4-bin-a1f4272-SNAPSHOT"

scalacOptions ++= List("-opt:l:inline", "-opt-inline-from:**", "-Vinline", "_")
