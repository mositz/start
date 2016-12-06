name := "provider"

version := "1.0"

scalaVersion := "2.12.0"

resolvers ++= Seq(
  "jje mirror" at "http://wiki.jje.com/archiva/repository/internal/",
  "local maven" at "file:///" + Path.userHome.absolutePath + "/.m2/repository/",
  "remote resolver " at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe repository2" at "https://repo.typesafe.com/typesafe/maven-releases/"
)

libraryDependencies ++= Seq(
  "com.alibaba" %  "dubbo" % "2.5.4-SNAPSHOT",
  "com.github.sgroschupf" %  "zkclient" % "0.1"
)