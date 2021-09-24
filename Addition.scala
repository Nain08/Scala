object Addition
{
  def main(args: Array[String]): Unit =
  {
    println("Adding mutuable values result "+addMutuable(5,6))
    println("Adding immutuable values result "+addMutuable(7,8))
  }
  def addMutuable(x:Int,y:Int): Int=
    {
      var sum:Int=0
      sum=x+y
      return sum
    }
  def addImmutuable(x:Int,y:Int): Int=
  {
    val sum:Int=x+y
    return sum
  }
}
