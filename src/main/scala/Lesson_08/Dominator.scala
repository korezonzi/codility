import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//8_1 https://app.codility.com/demo/results/trainingYTMFEY-5XB/
object Solution {
  def solution(a: Array[Int]): Int = {
    val arr = a.foldLeft(Map[Int, Int]()){ (x, count) =>
      x.get(count) match {
        case None => x + (count -> 1)
        case _    => x.updated(count, x(count) + 1)
      }
    }
    val dom = arr.filter(m => m._2 > a.length / 2)
    if (dom.nonEmpty) a.indexOf(dom.keys.head) else -1
  }

  def solution_1(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val len = a.length
    var scale = 0
    var value = -1
    for (x <- 0 until len) {
      if (scale == 0) {
        scale += 1
        value = a(x)
      } else if (value != a(x)) scale -= 1
        else scale += 1
    }
    var num = -1
    if (scale > 0) num = value
    var leader = -1
    var cnt = 0
    for (k <- 0 until len) if (a(k) == num) cnt += 1
    if (cnt >= len / 2) leader = num
    a.indexOf(leader)
  }
}
