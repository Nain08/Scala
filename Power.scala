//Write a scala program that reads a number(dynamic) and display its square, cube, and fourth power.
import scala.math.pow
object Power
{
  def main(args: Array[String]): Unit = {
    print("Enter a number : ")
    val num=scala.io.StdIn.readFloat()
    println("Square = "+pow(num,2))
    println("Cube = "+pow(num,3))
    println("Fourth power = "+pow(num,4))
  }
}
