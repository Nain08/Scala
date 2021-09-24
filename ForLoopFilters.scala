object ForLoopFilters
{
  def main(args: Array[String]): Unit = {
    val numList=List(1,2,3,4,5,6)
    var a=0
    for(a<-numList
        if a!=4;if a>2)
      println("Value of a: "+a);
  }
}
