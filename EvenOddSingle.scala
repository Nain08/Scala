//Write a program in scala to check the number is even or odd(Single Nested Function)
object EvenOddSingle
{
  def main(args: Array[String]): Unit = {
    print("12  ")
    evenOdd(12)
    print("7  ")
    evenOdd(7)
  }
  def evenOdd(n : Int)=
  {
    def check(n:Int)=
    {
      if(n%2==0) {
       println("Even")
      }
      else
        {
          println("Odd")
        }
    }
    check(n)
  }
}
