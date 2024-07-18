package s

//////////////######################## Example Person #######################//////////////////////////////////

class Person {
    fun cook() { /* Cooking logic */ }
    fun paint() { /* Painting logic */ }
    fun repair() { /* Repairing logic */ }
}

//////////////######################## Example Vehicle #######################//////////////////////////////////

class Vehicle {
    fun drive() { /* Driving logic */ }
    fun repair() { /* Repairing logic */ }
    fun wash() { /* Washing logic */ }
    fun refuel() { /* Refueling logic */ }
}

//////////////######################## Example Document #######################//////////////////////////////////

class Document {
    fun print() { /* Printing logic */ }
    fun save() { /* Saving logic */ }
    fun send() { /* Sending logic */ }
    fun translate() { /* Translating logic */ }
}

fun main(){

    /**
     * person class object have multiple responsibility e.g cook,painter,repair.
     */
    val person = Person()
    person.cook()
    person.repair()
    person.paint()
}


