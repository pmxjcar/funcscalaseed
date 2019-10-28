
import sbt._

object Dependencies {
  //Core

  val macros = "com.softwaremill.macwire" %% "macros"                              % "2.3.2" % "provided" // Scala Macros - https://docs.scala-lang.org/overviews/macros/overview.html
  val shapeless = "com.chuusai" %% "shapeless"                                     % "2.3.3" // Shapeless is a type class and dependent type based generic programming library for Scala - https://github.com/underscoreio/shapeless-guide
  val chimney = "io.scalaland" %% "chimney"                                        % "0.3.2" // Scala library for boilerplate-free data transformations.
  val catsCore = "org.typelevel" %% "cats-core"                                    % "2.0.0-M4" // Lightweight, modular, and extensible library for functional programming - https://typelevel.org/cats/
  val catsFree = "org.typelevel" %% "cats-free"                                    % "2.0.0-M4" // Cats Free Monad - https://typelevel.org/cats/datatypes/freemonad.html
  val catsEffect = "org.typelevel" %% "cats-effect"                                % "2.0.0-M4" // The IO Monad for Scala - https://typelevel.org/cats-effect/
  val kittens = "org.typelevel" %% "kittens"                                       % "2.0.0-M1" // Automatic type class derivation for Cats - https://github.com/milessabin/kittens
  val circeCore = "io.circe" %% "circe-core"                                       % "0.12.0-M4" // A JSON library for Scala powered by Cats - https://circe.github.io/circe/
  val circeGeneric = "io.circe" %% "circe-generic"                                 % "0.12.0-M4" // A JSON library for Scala powered by Cats - https://circe.github.io/circe/
  val circeParser = "io.circe" %% "circe-parser"                                   % "0.12.0-M4" // A JSON library for Scala powered by Cats - https://circe.github.io/circe/
  val circeOptics = "io.circe" %% "circe-optics"                                   % "0.11.0" // Tools for working with JSON values using circe and Monocle
  val circeKafka = "com.nequissimus" %% "circe-kafka"                              % "2.2.0" //Implicit conversion of Encoder and Decoder into Serializer/Deserializer/Serde
  val fs2Core = "co.fs2" %% "fs2-core"                                             % "1.1.0-M1" // FS2 is a library for purely functional, effectful, and polymorphic stream processing library in the Scala programming language. - https://fs2.io/
  val fs2Io = "co.fs2" %% "fs2-io"                                                 % "1.1.0-M1" // FS2 is a library for purely functional, effectful, and polymorphic stream processing library in the Scala programming language. - https://fs2.io/
  val fs2Cats = "co.fs2" %% "fs2-cats"                                             % "0.5.0" // FS2 is a library for purely functional, effectful, and polymorphic stream processing library in the Scala programming language. - https://fs2.io/
  val monix = "io.monix" %% "monix"                                                % "3.0.0-RC2" // Monix is a high-performance Scala / Scala.js library for composing asynchronous, event-based programs. - https://monix.io/
  val monixReactive = "io.monix" %% "monix-reactive"                               % "3.0.0-RC2" // The monix-reactive sub-project exposes the Observable data type, along with adjacent utilities, a high performance streaming abstraction that’s an idiomatic implementation of ReactiveX for Scala - https://monix.io/docs/3x/#monix-reactive
  val monixEval = "io.monix" %% "monix-eval"                                       % "3.0.0-RC2" // The monix-eval sub-project exposes the Task and Coeval data types, for dealing with purely functional effects in a principled way - https://monix.io/docs/3x/#monix-eval
  val monixCats = "io.monix" %% "monix-cats"                                       % "2.3.3" // Monix Cats Integration - https://monix.io/
  val kafka = "org.apache.kafka" %% "kafka"                                        % "0.11.0.1" // Kafka Libs - https://kafka.apache.org/documentation
  val kafkaClient = "org.apache.kafka"                                             % "kafka-clients" % "0.11.0.1" // Standard Kafka Client - https://kafka.apache.org/documentation
  val kafkaStreams = "org.apache.kafka" %% "kafka-streams-scala"                   % "2.2.0" // Kafka Streams DSL - https://kafka.apache.org/20/documentation/streams/developer-guide/dsl-api.html
  val kafkaRxCore = "io.bfil" %% "rx-kafka-core"                                   % "0.2.0" // General Purpose Kafka Client that Just Behaves - https://github.com/cjdev/kafka-rx
  val vertxcore = "io.vertx"                                                       % "vertx-core" % "3.6.3" // Eclipse Vert.x is event driven and non blocking. This means your app can handle a lot of concurrency using a small number of kernel threads. Vert.x lets your app scale with minimal hardware. - https://vertx.io/
  val vertxscala = "io.vertx" %% "vertx-lang-scala"                                % "3.6.3" //Scala language API for Vert.X
  val scalactic = "org.scalactic" %% "scalactic"                                   % "3.0.0" // Scalactic is a small library of utilities related to quality and functional programming that can help you keep code correct. - http://www.scalactic.org/
  val scalatest = "org.scalatest" %% "scalatest"                                   % "3.0.0" % "test" // Scala Unit Test Framework - http://www.scalatest.org/
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging"               % "3.9.2" //Scala Logging is a convenient and fast logging library wrapping SLF4J.
  val argonautShapeless = "com.github.alexarchambault" %% "argonaut-shapeless_6.2" % "1.2.0-M11" // Automatic argonaut codec derivation with shapeless - https://github.com/alexarchambault/argonaut-shapeless
  val anorm = "org.playframework.anorm" %% "anorm"                                 % "2.6.2" // Anorm is a simple data access layer that uses plain SQL to interact with the database and provides an API to parse and transform the resulting datasets. - https://github.com/playframework/anorm
  val avro4s = "com.sksamuel.avro4s" %% "avro4s-core"                              % "2.0.4" // Avro schema generation and serialization / deserialization for Scala - https://github.com/sksamuel/avro4s
  val caseApp = "com.github.alexarchambault" %% "case-app"                         % "2.0.0-M7" // Type-level & seamless command-line argument parsing for Scala - https://github.com/alexarchambault/case-app
  val monocle = "com.github.julien-truffaut" %% "monocle-core"                     % "1.6.0-M4" // Monocle is an optics library for Scala (and Scala.js) strongly inspired by Haskell Lens - https://github.com/julien-truffaut/Monocle
  val patchless = "io.github.jeremyrsmith" %% "patchless"                          % "1.0.4" // patchless is a tiny Scala library which provides a data type Patch[T], which extends T => T and encapsulates a set of updates to be performed to values of type T. - https://github.com/jeremyrsmith/patchless
  val spire = "org.typelevel" %% "spire"                                           % "0.16.1" // Spire is a numeric library for Scala which is intended to be generic, fast, and precise. - https://typelevel.org/spire/
  val attoCore = "org.tpolecat" %% "atto-core"                                     % "0.6.5" // atto is a compact, pure-functional, incremental text parsing library for Scala
  val attoRefined = "org.tpolecat" %% "atto-refined"                               % "0.6.5" // atto is a compact, pure-functional, incremental text parsing library for Scala
  val playJsonDerivedCodecs = "org.julienrf" %% "play-json-derived-codecs"         % "5.0.0" //Reads, OWrites and OFormat derivation for algebraic data types (sealed traits and case classes, possibly recursive), powered by shapeless.
  val pureConfig = "com.github.pureconfig" %% "pureconfig"                         % "0.11.0" // PureConfig is a Scala library for loading configuration files. It reads Typesafe Config configurations written in HOCON, Java .properties, or JSON to native Scala classes in a boilerplate-free way.
  val zio = "dev.zio" %% "zio"                                                     % "1.0.0-RC15"  // A functional effects library
  val zioStreams = "dev.zio" %% "zio-streams"                                      % "1.0.0-RC15"  // A functional effects streams  library

}