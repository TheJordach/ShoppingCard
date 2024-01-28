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


scalacOptions += "-Ymacro-annotations"

// The following setting are not in the book

Global / excludeLintKeys += root / idePackagePrefix  // Add this line to exclude the unused key from lintUnused check

// Replace deprecated semicolon syntax with slash syntax for other settings
Global / historyPath := None
Global / shellPrompt := { _ => "" }






resolvers ++=Seq(
  Resolver.defaultLocal,
  Resolver.mavenLocal,
  "Maven Central" at "https://repo1.maven.org/maven2/"
)