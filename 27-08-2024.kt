Theory:
Primary Constructor:
	•	The primary constructor is a concise way to initialize a class.
	•	It is defined in the class header (after the class name) and can take parameters.
	•	Properties can be initialized directly in the primary constructor.

Secondary Constructor:
	•	A class in Kotlin can also have one or more secondary constructors.
	•	Secondary constructors are defined using the constructor keyword.
	•	They are used when you need to add more initialization logic or if you need to create multiple constructors with different parameters.

Summary:
	•	If a class has a primary constructor, all secondary constructors must call the primary constructor (directly or indirectly).
	•	The primary constructor is the most concise and preferred way to initialize properties, while secondary constructors are used for additional logic or multiple initialization scenarios.

Execution:

// Define the class with primary constructor
class Intro(var name: String, var age: Int) {    //class header

    // Secondary constructor with one parameter
    constructor(name: String) : this(name, 0) 

    // Secondary constructor with no parameters
    constructor() : this("Apple", 0)

    // Method to print the introduction
    fun intro() {
        println("My name is $name and my age is $age.")
    }
}

fun main() {
    println("Enter name:")
    val name = readLine() ?: "Default Name"  // Use readLine() to get user input

    println("Enter age:")
    val ageInput = readLine() ?: "0"
    val age = ageInput.toIntOrNull() ?: 0  // Convert input to Int, default to 0 if invalid

    val x = Intro(name, age)
    x.intro()

    val a = Intro("Izaz", 10)
    a.intro()

    val b = Intro("Syed")
    b.intro()

    val c = Intro()
    c.intro()
}
