package io.soumasish

import scala.annotation.tailrec

object TailRecursion {
  def main(args: Array[String]): Unit = factorial2(14)

  def gcd(a: Int, b:Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n-1)
  }

  @tailrec
  def factorial2(n: Int, m: Int = 1): BigInt = {
    if (n == 0) 1 else factorial2(n-1, m * n)
  }
}
