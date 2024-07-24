//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}
// Part A : class Vehicle
open class Vehicle(val colour: String, val make: String, val model: String) {
    open fun accelerate() {
        println("The $make $model is accelerating.")
    }

    open fun stop() {
        println("The $make $model has stopped.")
    }
}

// Part B: Create class Car
class Car(colour: String, make: String, model: String, val numberOfDoors: Int) : Vehicle(colour, make, model) {
    override fun accelerate() {
        println("The $make $model car is accelerating rapidly.")
    }

    override fun stop() {
        println("The $make $model car has come to a smooth stop.")
    }

    fun parallelPark() {
        println("The $make $model car is parallel parking.")
    }
}

// Part C: Create class Bus
class Bus(colour: String, make: String, model: String, val passengerCapacity: Int) : Vehicle(colour, make, model) {
    override fun accelerate() {
        println("The $make $model bus is accelerating steadily.")
    }

    override fun stop() {
        println("The $make $model bus has stopped safely.")
    }

    fun openRearDoor() {
        println("The $make $model bus's rear door is opening.")
    }
}

