import scala.collection.JavaConverters._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//5_1
object PassingCars {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var car  = 0
    var pass = 0
    for(number <- a) {
      val result = number match {
        case zero if zero == 0 => car += 1
        case _                 => {
          pass += car
          if(pass > 1000000000) -1 else pass
        }
      }
    }
  }
}
