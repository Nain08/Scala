object keywordsDemo //object_1
{
  def main(args: Array[String]): Unit = { //def_2
    val intValue:Int=1 //val_3
    var floatValue:Float=20.8f //var_4

    while(intValue>3) //while_5
      {
        if(intValue%2==0)  //if_6
          print(true) //true_7
        else //else_8
          print(false)  //false_9
      }
      val obj=new Demo_Keywords() //new_10
      val value=obj.getValue()
      println("Value="+value);
      for(intValue <- 1 to 5 )  //for_11  <-_12
        {
          val x=null //null_13
        }
      obj.test()
  }
}
class Demo_Keywords //class_14
{
  def getValue():Int=
    {
      var x=50
      return x //return_15
    }
    def test(): Unit =
    {
        try //try_16
          {
            var y=15/0
          }
        catch //catch_17
          {
            case e:ArithmeticException =>{ //case_18 =>_19
              println("Cannot divide a number by zero")
            }
          }
      finally
        {
          println("In finally block") //finally_20
        }
    }
}
