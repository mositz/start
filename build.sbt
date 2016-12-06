name := "start"

version := "1.0"

scalaVersion := "2.12.0"

resolvers ++= Seq(
  "jje mirror" at "http://wiki.jje.com/archiva/repository/internal/",
  "local maven" at "file:///" + Path.userHome.absolutePath + "/.m2/repository/",
  "remote resolver " at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe repository2" at "https://repo.typesafe.com/typesafe/maven-releases/"
)

lazy val interface = (project in file("interface"))

lazy val provider = (project in file("provider")).dependsOn(interface)

lazy val consumer = (project in file("consumer")).dependsOn(interface)