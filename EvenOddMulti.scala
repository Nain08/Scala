//Write a program in scala to check the number is even or odd(Multiple Nested Function)
object EvenOddMulti {
  def main(args: Array[String]): Unit = {
    print("15  ")
    evenOdd(15)
    print("220  ")
    evenOdd(220)
  }
  def evenOdd(n : Int)=
  {
    def nested()={
      def check()={
        if(n%2==0)
          println("Even")
        else
          println("Odd")
      }
      check()
    }
    nested()
  }
}
