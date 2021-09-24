object Prime {
  def main(args: Array[String]): Unit = {
    print("Enter number:")
    val n = scala.io.StdIn.readInt()
    val result=isPrime(n)
    if(result)
      println("Prime")
    else
      println("Not Prime")
  }
  def isPrime(i: Int):Boolean= {
    def prime(n:Int): Boolean = {
      var found=true
      if(n==1)
        false
      else
        {
          val h=n/2
          for(x <-2 to h)
            {
                if(n%x==0)
                  {
                    found=false

                  }
            }
        }
      return found
    }
    return prime(i)}
}