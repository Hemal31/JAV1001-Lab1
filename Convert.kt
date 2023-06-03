import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter a numeric value:")
    val value = scanner.nextDouble()

    println("Enter the current unit of measurement:")
    val currentUnit = scanner.next().toLowerCase()

    println("Enter the target unit of measurement:")
    val targetUnit = scanner.next().toLowerCase()

    val convertedValue = convertMeasurement(value, currentUnit, targetUnit)
    if (convertedValue != null) {
        println("Converted value: $convertedValue")
    } else {
        println("Invalid units of measurement.")
    }
}

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
