import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//4_1 https://app.codility.com/demo/results/trainingJQYPGP-X6D/
object Solution {
  def solution(a: Array[Int]): Int = {
    if(a.sorted.sameElements(1 to a.max)) 1 else 0
  }

  def solution_1(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    //not array = 1. has number : a+1,  2. 1~N: has same numbers
    val numLen = a.length
    val arr    = Array.ofDim[Int](numLen)
    for(num <-0 until numLen) {
      //not in area
      if(a(num) < 1 || a(num) > numLen ) 0
      //not first
      else if(arr(a(num) - 1) == 1)      0
      //first
      else arr(a(num) - 1) = 1
    }
    1
  }
}
