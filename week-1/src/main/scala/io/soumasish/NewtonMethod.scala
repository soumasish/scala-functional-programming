package io.soumasish

import scala.math.abs

object NewtonMethod {
  def main(args: Array[String]) = println(sqrt(2))

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double = {
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))
    }

    def improve(guess: Double) = (guess + x / guess) / 2

    def isGoodEnough(guess: Double): Boolean = abs(guess * guess - x) < 0.001

    sqrtIter(x)
  }

}
