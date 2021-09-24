/*Write a scala program to convert :
  a. temperature from Fahrenheit to Celsius degree.
  b. a number in inches to meters.
  c. Year to number of days
*/
object Conversion
{
  def main(args: Array[String]): Unit = {
    print("Enter the temperature in Farhenheit = ")
    val temp_f=scala.io.StdIn.readFloat();
    println("Temperature in Celsius = "+temperature(temp_f))
    print("Enter inches = ")
    val inch=scala.io.StdIn.readFloat()
    println(inch+" inches in meters = "+meter(inch))
    print("Enter number of years = ")
    val years=scala.io.StdIn.readInt()
    println("Number of days in "+years+" years = "+year(years))
  }
  def temperature(temp_f: Float): Float =
  {
    val temp_c=(5*(temp_f-32))/9
    temp_c
  }
  def meter(inch: Float): Double = inch*0.0254
  def year(years:Int):Int= years*365
}
