//Write a function in scala that takes two numbers as parameters and returns the Maximum and Minimum of them. (Use Multi Nested Function)
// Scala program of Multiple Nested Function
object MaxMinMultipleNested {
  def main(args: Array[String])
  {
    println("To Find Min and Max from 10,2")
    maxAndMin(10,2)
  }
  def maxAndMin(a: Int, b: Int) = {

    def findMax() = {
      def maxValue() = {
        if (a > b)
          println("Max is: " + a)
        else
          println("Max is: " + b)
      }
      maxValue()
    }
    def findMin() = {
      def minValue() = {
        if (a < b)
          println("Min is: " + a)
        else
          println("Min is: " + b)
      }
      minValue()
    }
    findMin()
    findMax()
  }
}

