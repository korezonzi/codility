import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//6_1 https://app.codility.com/demo/results/trainingZFFX5V-VVD/
object MaxProductOfThree {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    //max: compare to other number
    val numLength = a.length
    val sortArr   = a.sorted
    sortArr(0) * sortArr(1) * sortArr(numLength -1) max sortArr(numLength -1) * sortArr(numLength -2) * sortArr(numLength -3)
  }
}
