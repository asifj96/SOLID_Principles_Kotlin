package o

/**
 * Classes, modules, functions, should be open for extension,
 * but closed for modification
 * Open: We can add new features to our classes. When new requirement comes,
 * we should be able to add new features to our class easily.
 * Close: The base features of the class should not be changed.
 */

//////////////######################## Example Calculator #######################//////////////////////////////////

interface Operation {
    fun execute(a: Int, b: Int): Int
}

class Addition : Operation {
    override fun execute(a: Int, b: Int) = a + b
}

class Subtraction : Operation {
    override fun execute(a: Int, b: Int) = a - b
}

class CalculatorAbidance(private val operation: Operation) {
    fun calculate(a: Int, b: Int): Int {
        return operation.execute(a, b)
    }
}

//////////////######################## Example Shape #######################//////////////////////////////////


interface ShapeAbidance {
    fun draw()
}

class Circle : ShapeAbidance {
    override fun draw() {
        println("Drawing Circle")
    }
}

class Rectangle : ShapeAbidance {
    override fun draw() {
        println("Drawing Rectangle")
    }
}

class Triangle : ShapeAbidance {
    override fun draw() {
        println("Drawing Triangle")
    }
}

class ShapeDrawer(private val shape: ShapeAbidance) {
    fun drawShape() {
        shape.draw()
    }
}

//////////////######################## Example Vehicle #######################//////////////////////////////////


interface VehicleAbidance {
    fun start()
}

class Car : VehicleAbidance {
    override fun start() {
        println("Starting Car")
    }
}

class Motorcycle : VehicleAbidance {
    override fun start() {
        println("Starting Motorcycle")
    }
}

class VehicleStarter(private val vehicle: VehicleAbidance) {
    fun startVehicle() {
        vehicle.start()
    }
}

fun main() {

//     Example Calculator
    val additionCalculator = CalculatorAbidance(Addition())
    println(additionCalculator.calculate(5, 3))

    val subtractionCalculator = CalculatorAbidance(Subtraction())
    println(subtractionCalculator.calculate(5, 3))

    // Example Shape
//    val circleDrawer = ShapeDrawer(Circle())
//    circleDrawer.drawShape()
//
//    val rectangleDrawer = ShapeDrawer(Rectangle())
//    rectangleDrawer.drawShape()
//
//    val triangleDrawer = ShapeDrawer(Triangle())
//    triangleDrawer.drawShape()

    // Example Vehicle
//    val carStarter = VehicleStarter(Car())
//    carStarter.startVehicle()
//
//    val motorcycleStarter = VehicleStarter(Motorcycle())
//    motorcycleStarter.startVehicle()

}