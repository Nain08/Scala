object Operator {
  def main(args: Array[String])=
    {
      var a = 10
      var b = 4
      var c = true
      var d = false
      var result = 0
      println("Addition is "+(a+b))
      println("Subtraction is "+(a-b))
      if(a==b)
        println("Equal To Operator is true")
      else
        println("Equal To Operator is false")
      println("Logical Or of a || b = " + (c || d))
      result = a & b
      println ("Bitwise AND: " + result )
      a+=b
      println ("Addition Assignment Operator: " + a );
    }
}
