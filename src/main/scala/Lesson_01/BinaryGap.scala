
import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//1_1 https://app.codility.com/demo/results/training7G3YFD-VSJ/
object BinaryGap {
  def solution(n: Int): Int = {
    if(n == 0) 0

    val binaryNumber = n.toBinaryString
    val checkNum = if(n % 2 == 0) 1 else 0
    //dropRight：右側から(n)取り除く
    val arr = binaryNumber.split("1").dropRight(checkNum)

    if(arr.nonEmpty) { arr.max.length }
    else 0
  }
  }

  def solution_1(n: Int): Int = {
    // write your code in Scala 2.12
    //toBinaryString: 10進数 -> 2進数
    val binaryNumber:String = n.toBinaryString.split("1")
    val result = binaryNumber.isEmpty match {
      //only 1
      case true  => 0
      //include 0
      case false => {
        val hasSol = binaryNumber.last match {
          case "" => binaryNumber
          case _  => binaryNumber.reverse.tail
        }
        hasSol.map(_.size).max
      }
    }
    result
  }
}
