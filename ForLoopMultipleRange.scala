object ForLoopMultipleRange
{
  def main(args: Array[String]): Unit =
  {
    var a=0
    var b=0
    for(a <- 1 to 2;b <- 1 to 2)
    {
      println("Value of a: "+a);
      println("Value of b: "+b);
    }
  }
}
