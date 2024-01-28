ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12" // Book scala version is "2.13.0"

lazy val root = (project in file("."))
  .settings(
    name := "ShoppingCard-VER01",
    idePackagePrefix := Some("com.shoppingCard.bookVersion1")
  )

libraryDependencies ++= Seq(
  compilerPlugin(
    "org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full  // Change the "kind-projector "0.11.0"  ---> "0.13.2"

  ),
  compilerPlugin(
    "org.augustjune" %% "context-applied" % "0.1.2"
  ),
  "org.typelevel" %% "cats-core" % "2.1.0",
  "org.typelevel" %% "cats-effect" % "2.1.0",
  "dev.profunktor" %% "console4cats" % "0.8.1",
  "org.manatki" %% "derevo-cats" % "0.10.5",
  "org.manatki" %% "derevo-cats-tagless" % "0.10.5",
  "co.fs2" %% "fs2-core" % "2.2.2",
  "com.olegpy" %% "meow-mtl-core" % "0.4.0",
  "com.olegpy" %% "meow-mtl-effects" % "0.4.0", // Added missing double quote and closing parenthesis
  "io.estatico" %% "newtype" % "0.4.3",
  "eu.timepit" %% "refined" % "0.9.12",
  "com.github.julien-truffaut" %% "monocle-core" % "2.0.1",
  "com.github.julien-truffaut" %% "monocle-macro" % "2.0.1"
)

/***
 *   -Ymacro-annotations
 *   Used for : "io.estatico" %% "newtype" % "0.4.3",
 *     - It uses macros, for which we need the macro paradise compiler plugin in Scala versions
         below 2.13.0, and only an extra compiler flag -Ymacro-annotations in versions 2.13.0 and above
 */

scalacOptions += "-Ymacro-annotations"



/********************* The following setting are not in the book **************************************/

/*
    ERROR
    Wen i tried to compile the project i get ERROR -> "scalac: 'nullary-override' is not a valid choice for '-Xlint'"
    Following solve the compiler error
 */
scalacOptions --= Seq(
  "-Xlint:by-name-right-associative",
  "-Xlint:nullary-override",
  "-Xlint:unsound-match",
  "-Yno-adapted-args"
)

/**
 * Add this line to exclude the unused key from lintUnused check
 */
Global / excludeLintKeys += root / idePackagePrefix

/**
 * Replace deprecated semicolon syntax with slash syntax for other settings
 */
Global / historyPath := None
Global / shellPrompt := { _ => "" }

/**
 * ISSUE WITH kind-projector
 * 1- Write resolvers like so to allow Scala 2.13.12 to find kind-projector
 * 2- Change the "kind-projector VER from "0.11.0" --> "0.13.2"
 */

resolvers ++=Seq(
  Resolver.defaultLocal,
  Resolver.mavenLocal,
  "kind-projector library uses Maven Central" at "https://repo1.maven.org/maven2/"
)