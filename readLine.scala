object readLine
{
  def main(args: Array[String]): Unit = {
    while(true)
      {
        val result=scala.io.StdIn.readLine()
        printf("Entered String:%s",result)
        println()
      }
  }
}
