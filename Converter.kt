fun main() {
  //I defined my variable as fahrenheitValue here, 
  //giving the variable a list of 5 values which I just chose multiples of 32.
    val fahrenheitValue = listOf(32.0, 64.0, 96.0, 128.00, 160.00)

  //On this line, I told the code that it needed to go through each value in the list above and convert it to celsius. 
    for (fahrenheit in fahrenheitValue) {
        
  //Fahrenheit to Celsius converstion formula.
    val celsius = (fahrenheit - 32) * 5 / 9

  //After it was converted, println tells the code to print the final product so you can see the conversion. 
        println("$fahrenheit°F is equal to %.2f°C".format(celsius))
    }
    
   //This prints out that below this is the conversions from celsius to fahrenheit.
    println("Celsius to Fahrenheit Conversion:")
    //We stated our variables again, instead they are in celsius values this time.
    val celsiusValue = listOf(15.0, 30.0, 45.0, 60.0, 85.0)
    
    //Similarly to what's above, the code is being told that it needs to go through all the values to convert it.
    for (celsius in celsiusValue) {
        
     //Celsius to Fahrenheit conversion formula.
        val fahrenheit = (celsius * 9 / 5) + 32
     //Printing out our final values...
        println("$celsius°C is equal to %.2f°F".format(fahrenheit))
    }
}
