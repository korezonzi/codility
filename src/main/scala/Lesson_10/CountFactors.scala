import scala.collection.JavaConverters._
import scala.math.sqrt

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//10_1 https://app.codility.com/demo/results/trainingSXRJ8W-3UQ/
object CountFactors {
  def solution(n: Int): Int = {
    def rec(n: Int, i: Long, cnt: Int): Int = {
      if (i * i > n) cnt
      else if (n == i * i) cnt + 1
      else if (n % i == 0) rec(n, i+1, cnt+2)
      else rec(n, i+1, cnt)
    }
    rec(n, 1, 0)
  }

  def solution_2(n: Int): Int = {
    val num   = sqrt(n).toInt
    var count = 0
    for(i <- 0 until num) {
      if (n % i == 0) count += 1
    }
    count = count * 2
    if(num * num == n) count -= 1
    count
  }

  def solution_1(n: Int): Int = {
    // write your code in Scala 2.12
    var count = 1
    var num   = 0
    while(count * count < n) {
      if(n % count == 0) {
        num += 2
      }
      count += 1
    }
    if(count * count == n) {
      num += 1
    }
    num
  }
}
