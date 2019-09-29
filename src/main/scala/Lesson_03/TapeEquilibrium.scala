import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//3_3 https://app.codility.com/demo/results/trainingCVDBNX-JQF/
object TypeEquilibrium {

  //TODO
  //fix more like scala
  //<- maybe use "for yield" or "map"??
  def solution(A: Array[Int]): Int = {

    val numLength = A.length
    val numSum = A.sum

    var left = numSum - A(numLength - 1)
    var right = A(numLength - 1)
    var min = math.abs(left - right)

    //reverse route ot Number
    for (num <- numLength - 2 to 1 by -1) {
      left -= A(num)
      right += A(num)

      min = math.min(min, math.abs(left - right))
    }
    min
  }
}
