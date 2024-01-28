package com.shoppingCard.bookVersion1
package testingStuffs

import cats.effect.Sync
import cats.{Functor, Monad}
import cats.implicits.catsStdInstancesForOption
import cats.syntax.all._

import scala.annotation.unused
//import com.olegpy.meow.internal.TellOptics.Functor
import eu.timepit.refined._
import eu.timepit.refined.auto._
import eu.timepit.refined.types.string._
import eu.timepit.refined.types.all._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.collection.Contains


import io.estatico.newtype.macros._

object testLibraries {

  @unused
  type Username2 = String Refined Contains['g']
 def lookedup(username:NonEmptyString):Option[Unit] = ???
  @newtype case class Username(value:NonEmptyString)
  @newtype case class Email(value:NonEmptyString)

  def lookup(username:Username,email:Email):Unit = {
    println(s"the username is $username and email is $email")

  }



  def main(args: Array[String]): Unit = {

   /* lookup("John","einstein")
    lookup("einstein","")
    lookup("","")
    lookup("John","123")*/




  }
}
