name := "jbwapi-scala-template"

version := "0.1"

scalaVersion := "2.13.1"


resolvers ++= Seq(
  "jitPack" at "https://jitpack.io",
)

libraryDependencies ++= Seq(
  "com.github.JavaBWAPI" % "JBWAPI" % "1.2",
)
