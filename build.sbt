resolvers += Resolver.mavenLocal
resolvers += "Mobile Mind" at "https://raw.githubusercontent.com/mobilemindtech/m2/master"

lazy val root = crossProject(JVMPlatform, JSPlatform)
  .crossType(CrossType.Full)
  .in(file("."))
  .platformsEnablePlugins(JSPlatform)(ScalaJSJUnitPlugin)
  .settings(
    organization := "org.getshaka",
    name := "native-converter",
    version := "0.10.1",
    versionScheme := Some("early-semver"),
    scalaVersion := "3.8.2",

    homepage := Some(url("https://github.com/getshaka-org/native-converter")),
    licenses += ("Apache-2.0", url("https://opensource.org/licenses/Apache-2.0"))
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      "com.github.sbt" % "junit-interface" % "0.13.3" % "test"
    )
  )
