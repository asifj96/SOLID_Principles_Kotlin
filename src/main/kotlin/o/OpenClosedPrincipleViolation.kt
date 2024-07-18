package o

//////////////######################## Example Calculator #######################//////////////////////////////////

class Calculator {

    fun calculate(operation: String, a: Int, b: Int): Int {
        return when (operation) {
            "add" -> a + b
            "subtract" -> a - b
            "multiply" -> a * b
            "divide" -> a / b
            else -> throw IllegalArgumentException("Operation not supported")
        }
    }
}

//////////////######################## Example Shape #######################//////////////////////////////////

class Shape {

    fun draw(shapeType: String) {
        when (shapeType) {
            "circle" -> drawCircle()
            "rectangle" -> drawRectangle()
            "triangle" -> drawTriangle()
            else -> throw IllegalArgumentException("Shape not supported")
        }
    }

    private fun drawCircle() {
        println("Drawing Circle")
    }

    private fun drawRectangle() {
        println("Drawing Rectangle")
    }

    private fun drawTriangle() {
        println("Drawing Triangle")
    }
}

//////////////######################## Example Shape #######################//////////////////////////////////


class Vehicle {

    fun startVehicle(vehicleType: String) {
        if (vehicleType == "car") {
            startCar()
        } else if (vehicleType == "motorcycle") {
            startMotorcycle()
        } else {
            throw IllegalArgumentException("Vehicle type not supported")
        }
    }

    private fun startCar() {
        println("Starting Car")
    }

    private fun startMotorcycle() {
        println("Starting Motorcycle")
    }
}



fun main() {

    //////////////////######################### Calculator Example #########################///////////////////////////

    val calculator = Calculator()
    println(calculator.calculate("add", 5, 3))
    println(calculator.calculate("subtract", 5, 3))
    println(calculator.calculate("multiply", 5, 3))
    println(calculator.calculate("divide", 5, 3))
    /**
     * when new requirement added
     */
    println(calculator.calculate("Modulus", 5, 3))

    //////////////////###################### Shape Example ############################///////////////////////////

    val shape = Shape()
    shape.draw("circle")
    shape.draw("rectangle")
    shape.draw("triangle")
    /**
     * when new requirement added
     */
    shape.draw("square")

    //////////////////###################### Vehicle Example ############################///////////////////////////

    val vehicle = Vehicle()
    vehicle.startVehicle("car")
    vehicle.startVehicle("motorcycle")
    /**
     * when new requirement added
     */
    vehicle.startVehicle("bike")


}