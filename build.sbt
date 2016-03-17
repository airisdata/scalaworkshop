name in ThisBuild := "Scala Meetups"

organization in ThisBuild := "com.airisdata.meetups"

version := "1.0"

scalaVersion := "2.11.8"


resolvers in ThisBuild ++= Seq(
  // Typesafe
  Resolver.typesafeRepo("releases"),
  Resolver.typesafeRepo("snapshots"),
  Resolver.typesafeIvyRepo("releases"),
  Resolver.typesafeIvyRepo("snapshots"),
  // Sonatype
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  // Scalaz
  "Scalaz Bintray Repo"  at "http://dl.bintray.com/scalaz/releases",
  // Apache
  "Apache Releases"      at "http://repository.apache.org/content/repositories/releases/",
  "Apache Snapshots"     at "http://repository.apache.org/content/repositories/snapshots",
  // Cloudera
  "Cloudera"             at "https://repository.cloudera.com/artifactory/cloudera-repos/"
)

def ScalaMeetupsProject(path:String) = Project(path, file(path))


lazy val meetup1 = ScalaMeetupsProject("meetup-1")