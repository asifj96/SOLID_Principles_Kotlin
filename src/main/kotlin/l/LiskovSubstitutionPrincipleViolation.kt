package l

//////////////######################## Example Animal and Bird #######################//////////////////////////////////

open class Bird {
    open fun fly() {
        println("I can fly!")
    }
}

class Penguin : Bird() {
    override fun fly() {
        println("I cannot fly!")
    }
}

//////////////######################## Example Shape and Square #######################//////////////////////////////////

open class Rectangle {
    open var width: Int = 0
    open var height: Int = 0

    fun area(): Int {
        return width * height
    }
}

class Square : Rectangle() {
    override var width: Int
        get() = super.width
        set(value) {
            super.width = value
            super.height = value
        }

    override var height: Int
        get() = super.height
        set(value) {
            super.width = value
            super.height = value
        }
}

fun main() {

    // Animal and Bird
    val bird: Bird = Penguin()
    bird.fly()  // This will print "I cannot fly!" which violates the LSP.

    // Shape and Square
    val rectangle: Rectangle = Square()
    rectangle.width = 5
    rectangle.height = 10
    println("Area: ${rectangle.area()}")
}
