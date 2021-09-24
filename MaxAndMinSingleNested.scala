//Write a function in scala that takes two numbers as parameters and returns the Maximum and Minimum of them. (Use Single Nested Function)
object MaxAndMinSingleNested{
def main(args: Array[String]) {
    println("Min and Max from 8, 3")
    maxAndMin(8, 3);
  }
  def maxAndMin(a: Int, b: Int) = {
    def maxValue() = {
      if(a > b)
        println("Max is: " + a)
      else
        println("Max is: " + b)
    }
    def minValue() = {
      if (a < b)
        println("Min is: " + a)
      else
        println("Min is: " + b)
    }
    maxValue()
    minValue()
  }
}