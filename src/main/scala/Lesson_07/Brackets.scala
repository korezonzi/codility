import scala.collection.JavaConverters._
import scala.collection.mutable

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

//7_1 https://app.codility.com/demo/results/training89MRAE-XRT/
object Solution {
  def solution(s: String): Int = {
    // write your code in Scala 2.12
    val convertion = Map(
      '(' -> ')',
      '{' -> '}',
      '[' -> ']'
    )

    val stack = new mutable.Stack[Char]

    for(x <- s) {
      if(convertion.contains(x)) {
        stack.push(x)
      } else if(stack.isEmpty || convertion.get(stack.top).get != x) {
        return 0
      } else {
        stack.pop()
      }
    }
    if(stack.isEmpty) 1 else 0
  }
}
