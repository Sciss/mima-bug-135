name         := "mima-baz"
version      := "0.1.0"
organization := "de.sciss"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "de.sciss" %% "mima-foo" % "0.1.0",
  "de.sciss" %% "mima-bar" % "0.1.0"
)

// mainClass in (Compile, run) := Some("de.sciss.mima.Baz")
