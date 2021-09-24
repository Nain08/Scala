object ForLoopYield
{
  def main(args: Array[String]): Unit = {
    var a=0
    val numList=List(1,2,3,4,5)
    var retVal=for(a<-numList
        if a!=3; if a<4)yield a
    for(a<-retVal)
      println("Value of a: "+a);
  }
}
