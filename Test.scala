object Test
{
  def main(args: Array[String])=
    {
      val a=max(5,4);
      val b=max(12,40);
      println(a);
      println(b);

    }
  def max(x: Int,y:Int):Int =
    {
      if(x>y)
        x;
      else
        y;
    }
}
