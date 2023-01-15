package io.soumasish

object Assignment {

  def main(args: Array[String]): Unit = {
    println(pascal(0,2))
    println(pascal(1,2))
    println(pascal(1,3))
  }

  def pascal(c: Int, r: Int): Int = {
    (c, r) match {
      case (0, _) => 1
      case (c, r) if (c ==r) => 1
      case (c, r) => pascal(c, r-1) + pascal(c-1, r-1)
    }
  }

}
