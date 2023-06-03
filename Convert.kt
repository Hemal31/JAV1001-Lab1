import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter a numeric value:")
    val value = scanner.nextDouble() //”Value” variable accept input from user in numeric value

    println("Enter the current unit of measurement:")
    val currentUnit = scanner.next().lowercase() //” currentUnit” variable accept input in measurement from user

    println("Enter the target unit of measurement:")
    val targetUnit = scanner.next().lowercase() // “targetUnit” variable accept unit input in measurement

    val convertedValue = convertMeasurement(value, currentUnit, targetUnit) 
  //if condition return user message based on user input
  if (convertedValue != null) {
        println("Converted value: $convertedValue")
    } else {
        println("Invalid units of measurement.")
    }
}
// “convertMeasurement”  function process inputed values to convert based on user input
fun convertMeasurement(value: Double, currentUnit: String, targetUnit: String): Double? {
    return when {
        currentUnit == "km" && targetUnit == "mi" -> value * 0.62
        currentUnit == "mi" && targetUnit == "km" -> value * 1.61
        currentUnit == "cm" && targetUnit == "in" -> value * 0.39
        currentUnit == "in" && targetUnit == "cm" -> value * 2.54
        currentUnit == "kg" && targetUnit == "lb" -> value * 2.2
        currentUnit == "lb" && targetUnit == "kg" -> value * 0.45
        currentUnit == "g" && targetUnit == "oz" -> value * 0.04
        currentUnit == "oz" && targetUnit == "g" -> value * 28.35
       
        else -> null
    }
}
