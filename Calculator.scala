/*Develop a calculator for two numbers(user defined using console for input)using Scala Anonymous(Inline) function with following capability :
  a. Divide
  b. Multiply
  c. Subtract
  d. Addition */
object Calculator
{
  def main(args: Array[String]): Unit =
  {
      print("Enter first number:")
      val a=scala.io.StdIn.readInt()
      print("Enter first number:")
      val b=scala.io.StdIn.readInt()
      println("Addition of "+a+" and "+b+"="+add(a,b))
      println("Subtraction of "+a+" and "+b+"="+subtract(a,b))
      println("Multiplication of "+a+" and "+b+"="+multiply(a,b))
      println("Division of "+a+" and "+b+"="+divide(a,b))
  }
  def add(a: Int, b: Int): Int = a+b
  def subtract(a: Int, b: Int): Int= a-b
  def multiply(a: Int, b: Int): Int = a*b
  def divide(a: Int, b: Int): Int = a/b
}
