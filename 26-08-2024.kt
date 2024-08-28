Theory:
In Kotlin, to create a switch case we use -> symbol




fun main() {
    // add(10,20)
    // myName("Mohammad", "Izaz")
    
    // Sample input values
    val day = 4
    
    val result = when(day) {      //switch case
        1 -> "Sunday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        else -> "Invalid day"
    }
    
    println(result)  // Output: Thursday
    
    // Convert temperatures
    print("Enter the temperature in Fahrenheit: ")
    val num1 = readln().toInt()
    print("Enter the temperature in Celsius: ")
    val num2 = readln().toInt()
    
    toCelsius(num1)      // Convert Fahrenheit to Celsius
    toFahernheit(num2)   // Convert Celsius to Fahrenheit
}

// Function to convert Fahrenheit to Celsius
fun toCelsius(a: Int) {
    val d = (a - 32) / 1.8
    println("Fahrenheit to Celsius: $d")
}

// Function to convert Celsius to Fahrenheit
fun toFahernheit(a: Int) {
    val e = (a * 1.8) + 32
    println("Celsius to Fahrenheit: $e")
}

// Function to add two numbers with default values
fun addDef(a: Int = 3, b: Int = 4) {
    val s = a + b
    println(s)
}

// Function to add two integers
fun add(a: Int, b: Int) {
    val c = a + b
    println(c)
}

// Function to print full name
fun myName(a: String, b: String) {
    println("$a $b")
}
