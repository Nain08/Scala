//Write a function in scala that takes two numbers as parameters and returns the Maximum and Minimum of them. (Use Single Nested Function)
object MaxAndMin{
  def main(args: Array[String]) {
    println("Min and Max from 5, 3")
    maxAndMin(5,3)
  }
  def maxAndMin(a: Int, b: Int):Unit = {
    def maxValue(): Int = {
      if (a > b)
        a
      else
        b
    }
  }
}