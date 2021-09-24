object ReverseList
{
  def main(args: Array[String]): Unit = {
    var a=0
    val numList=List(1,2,3,4,5)
    println("List")
    for(a<-numList) {
      print(a+" ")
    }
    println()
    println("Reversed List")
    for(a<-numList.reverse)
      print(a+" ")
    println()
    var list=List.fill(10)(2)
    println(list);
  }
}
