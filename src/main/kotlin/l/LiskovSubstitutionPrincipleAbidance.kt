package l

/**
 * If S is a subtype of T, then objects of type T in a program may
 * be replaced with objects of type S without altering any of the
 * desirable properties of that program.
 * In other words:
 * Objects in a program should be replaceable with instances of their
 * subtypes without altering the correctness of that program.
 */

//////////////######################## Example Animal and Bird #######################//////////////////////////////////


interface Flyable {
    fun fly()
}

open class BirdParent() {

}

class SparrowChild : BirdParent(), Flyable {
    override fun fly() {
        println("I can fly!")
    }
}

class PenguinChild : BirdParent() {
    // Penguins do not implement Flyable, adhering to their expected behavior
}


//////////////######################## Example Shape and Square #######################//////////////////////////////////

interface Shape {
    fun area(): Int
}

class RectangleClass(var width: Int, var height: Int) : Shape {
    override fun area(): Int {
        return width * height
    }
}

class SquareClass(var side: Int) : Shape {
    override fun area(): Int {
        return side * side
    }
}


fun main() {
    // Animal and Bird
    val birds: List<BirdParent> = listOf(SparrowChild(), PenguinChild())
    for (bird in birds) {
        if (bird is Flyable) {
            bird.fly()  // Only Sparrows will fly
        } else {
            println("This bird cannot fly")
        }
    }

    // Shape and Square
    val shapes: List<Shape> = listOf(RectangleClass(5, 10), SquareClass(5))
    for (shape in shapes) {
        println("Area: ${shape.area()}")  // This will print the correct areas for both shapes
    }

}