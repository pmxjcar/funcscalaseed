
import com.typesafe.sbt.SbtNativePackager.Universal
import com.typesafe.sbt.GitVersioning

import com.typesafe.sbt.SbtNativePackager.autoImport.packageSummary
import com.typesafe.sbt.packager.linux.LinuxPlugin.autoImport.defaultLinuxInstallLocation
import com.typesafe.sbt.packager.rpm.RpmPlugin.autoImport.rpmVendor
import sbt.ExclusionRule
import sbt.Keys._

//Command alias and plugins
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.6")
addCommandAlias("fmt", "all scalafmtSbt scalafmt test:scalafmt")
addCommandAlias("check", "all scalafmtSbtCheck scalafmtCheck test:scalafmtCheck")
addCommandAlias("release",     ";clean ;+update ;+compile ;+package ;+publish")

fork in ThisBuild := true

//Project Settings
organization in ThisBuild := "$organization$"
name in ThisBuild := "$name$"
version in ThisBuild := "0.0.1-SNAPSHOT"
scalaVersion in ThisBuild := "$scala_version$"


//Dependency Settings
lazy val commonSettings = Seq(
  libraryDependencies ++= Seq(
    Dependencies.macros,
    Dependencies.shapeless,
    Dependencies.chimney,
    Dependencies.catsCore,
    Dependencies.catsFree,
    Dependencies.catsEffect,
    Dependencies.kittens,
    Dependencies.circeCore,
    Dependencies.circeGeneric,
    Dependencies.circeParser,
    Dependencies.circeOptics,
    Dependencies.circeKafka,
    Dependencies.fs2Core,
    Dependencies.fs2Io,
    Dependencies.fs2Cats,
    Dependencies.monix,
    Dependencies.monixReactive,
    Dependencies.monixEval,
    Dependencies.monixCats,
    Dependencies.kafkaStreams,
    Dependencies.kafka,
    Dependencies.kafkaClient,
    Dependencies.kafkaRxCore,
    Dependencies.vertxcore,
    Dependencies.vertxscala,
    Dependencies.scalactic,
    Dependencies.scalatest,
    Dependencies.scalaLogging,
    Dependencies.argonautShapeless,
    Dependencies.anorm,
    Dependencies.avro4s,
    Dependencies.caseApp,
    Dependencies.monocle,
    Dependencies.patchless,
    Dependencies.spire,
    Dependencies.attoCore,
    Dependencies.attoRefined,
    Dependencies.scalaLogging,
    Dependencies.playJsonDerivedCodecs,
    Dependencies.pureConfig,
    Dependencies.zio,
    Dependencies.zioStreams
  )
)




lazy val root = (project in file("."))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    organization := "$organization$",
    name := "$name$",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "$scala_version$",
    scalacOptions := Seq(
      "-deprecation",
      "-encoding",
      "UTF-8",
      "-feature",
      "-language:existentials",
      "-language:higherKinds",
      "-Ypartial-unification",
      "-Yno-adapted-args",
      "-Xsource:2.13",
      "-Yrepl-class-based",
      "-explaintypes",
      "-Yrangepos",
      "-feature",
      "-Xfuture",
      "-unchecked",
      "-Xlint:_,-type-parameter-shadow",
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-opt-warnings",
      "-Ywarn-extra-implicit",
      "-Ywarn-unused:_,imports",
      "-Ywarn-unused:imports",
      "-opt:l:inline",
      "-opt-inline-from:<source>",
      "-Ypartial-unification",
      "-Yno-adapted-args",
      "-Ywarn-inaccessible",
      "-Ywarn-infer-any",
      "-Ywarn-nullary-override",
      "-Ywarn-nullary-unit"
    )
  )  
  .settings(commonSettings: _*)


//------------- For Release

enablePlugins(GitVersioning)

/* The BaseVersion setting represents the in-development (upcoming) version,
 * as an alternative to SNAPSHOTS.
 */
git.baseVersion := "3.0.0-RC3"

val ReleaseTag = """^v(\d+\.\d+(?:\.\d+(?:[-.]\w+)?)?)$""".r
git.gitTagToVersionNumber := {
  case ReleaseTag(v) => Some(v)
  case _ => None
}

git.formattedShaVersion := {
  val suffix = git.makeUncommittedSignifierSuffix(git.gitUncommittedChanges.value, git.uncommittedSignifier.value)

  git.gitHeadCommit.value map { _.substring(0, 7) } map { sha =>
    git.baseVersion.value + "-" + sha + suffix
  }
}