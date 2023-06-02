import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the value to convert:")
    val value = scanner.nextDouble()

    println("Enter the current unit of measurement:")
    val unit = scanner.next()
4
    val result = when (unit.toLowerCase()) {
        "km" -> convertKilometersToMiles(value)
        "mi" -> convertMilesToKilometers(value)
        "cm" -> convertCentimetersToInches(value)
        "in" -> convertInchesToCentimeters(value)
        "kg" -> convertKilogramsToPounds(value)
        "lb" -> convertPoundsToKilograms(value)
        "g" -> convertGramsToOunces(value)
        "oz" -> convertOuncesToGrams(value)
        "l" -> convertLitersToCups(value)
        "cup" -> convertCupsToLiters(value)
        else -> {
            println("Unsupported unit of measurement.")
            return
        }
    }

    println("Result: $result")
}

fun convertKilometersToMiles(kilometers: Double): Double {
    return kilometers * 0.621371
}

fun convertMilesToKilometers(miles: Double): Double {
    return miles * 1.60934
}

fun convertCentimetersToInches(centimeters: Double): Double {
    return centimeters * 0.393701
}

fun convertInchesToCentimeters(inches: Double): Double {
    return inches * 2.54
}

fun convertKilogramsToPounds(kilograms: Double): Double {
    return kilograms * 2.20462
}

fun convertPoundsToKilograms(pounds: Double): Double {
    return pounds * 0.453592
}

fun convertGramsToOunces(grams: Double): Double {
    return grams * 0.035274
}

fun convertOuncesToGrams(ounces: Double): Double {
    return ounces * 28.3495
}

fun convertLitersToCups(liters: Double): Double {
    return liters * 4.16667
}

fun convertCupsToLiters(cups: Double): Double {
    return cups * 0.24
}
