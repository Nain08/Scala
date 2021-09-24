object ListFunctions
{
  def main(args: Array[String]): Unit = {
    var a=0
    val numList=List(11,5,30,46,91,7,8,65,11,2,7,10)
    println("Original List : "+numList)
    println("List without duplicates : "+numList.distinct)
    println("First Index of 7: "+numList.indexOf(7))
    println("Length of List  : "+numList.length)
    println("Sorting : "+numList.sorted)
    println("Sum of list elements : "+numList.sum)
    println("List to String : "+numList.toString())
    println("Smallest in list : "+numList.min)
    println("Largest in list : "+numList.max)
    println("Last index of 11: "+numList.lastIndexOf(11))
    println("list to map: "+numList.map(x=>x*x))
  }
}
