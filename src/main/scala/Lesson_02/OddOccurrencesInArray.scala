import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//2_2 https://app.codility.com/demo/results/training5QZ7NX-C8H/
object Solution {
  def solution(a: Array[Int]): Int = {
    var num = 0
    for(x <- a)
      //^=: XOR(2つのbitが同じなら0, 違う1)
      num ^= x
    num
  }

  def solution_1(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val notHasPair = a[0]
    val len        = a.length
    if(a.isEmpty || len == 0 ) 0
    if(len == 1) a(0)
    val result = 0
    for(num <- 0 to len) {
      result ^= a(num)
    }
    result
  }
}

