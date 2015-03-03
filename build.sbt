name := """assignment"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  //javaWs,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.hibernate" % "hibernate-entitymanager" % "4.3.6.Final",
  "org.springframework.data" % "spring-data-jpa" % "1.7.1.RELEASE",
  "org.springframework" % "spring-aop"        % "4.1.1.RELEASE",
  "org.springframework" % "spring-context"    % "4.1.1.RELEASE",
  "org.springframework" % "spring-expression" % "4.1.1.RELEASE",
  "org.springframework" % "spring-jdbc"       % "4.1.1.RELEASE",
  "org.springframework" % "spring-orm"        % "4.1.1.RELEASE",
  "org.springframework" % "spring-tx"         % "4.1.1.RELEASE",
  "org.springframework" % "spring-test"       % "4.1.1.RELEASE" % "test",
  "mysql" % "mysql-connector-java" % "5.1.32"
)
