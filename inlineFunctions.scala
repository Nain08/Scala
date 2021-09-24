//Practice few inline or first class functions for below scenarios :
//a. Adding one to an integer value
//b. Check integer value is 0 or not
//c. Add,multiply two number
object inlineFunctions
{
  def main(args: Array[String]): Unit = {
    print("Increment : ")
    println(increment(4))
    def increment(a: Int) = a+1
    print("Check Zero : ")
    println(checkZero(3))
    def checkZero(x:Int) = if (x==0) "Zero" else "Not Zero"
    print("Add : ")
    println(add(4,8))
    def add(a:Int,b:Int)= a+b
    print("Multiply : ")
    println(multiply(2,3))
    def multiply(a:Int,b:Int)=a*b
  }
}
