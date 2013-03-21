name := "jsonz"

organization := "jsonz"

version := "0.4-SNAPSHOT"

scalaVersion := "2.10.0"

resolvers ++= Seq(
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases",
  "spray.io" at "http://repo.spray.io/",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
  "Coda Hale" at "http://repo.codahale.com"
)

publishTo := Some("Banno Snapshots Repo" at "http://nexus.banno.com/nexus/content/repositories/snapshots")

credentials += Credentials(Path.userHome / ".ivy2" / ".banno_credentials")

libraryDependencies ++= Seq(
  "org.scalaz" % "scalaz-core_2.10" % "7.0.0-M8",
  "org.scalaz" % "scalaz-typelevel_2.10" % "7.0.0-M8",
  "jerkson" % "jerkson_2.10" % "0.1-SNAPSHOT"
)

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-core" % "2.1.1",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.1.1"
)

// spray support
libraryDependencies ++= Seq(
  "io.spray" % "spray-httpx" % "1.0-M7" % "provided",
  "com.typesafe.akka" % "akka-actor" % "2.0.5" % "provided"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.12.3" % "test",
  "org.scalacheck" % "scalacheck_2.10.0-RC5" % "1.10.0" % "test"
)

// scalacOptions += "-Xlog-implicits"
