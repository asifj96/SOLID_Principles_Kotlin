package s

/**
 * According to SRP
 * A module/class/function should have one and only one reason to change.
 */

//////////////######################## Example Person #######################//////////////////////////////////

class Cook {
    fun cook() { /* Cooking logic */
    }
}

class Painter {
    fun paint() { /* Painting logic */
    }
}

class Repairer {
    fun repair() { /* Repairing logic */
    }
}

//////////////######################## Example Vehicle #######################//////////////////////////////////

class Driver {
    fun drive() { /* Driving logic */
    }
}

class Mechanic {
    fun repair() { /* Repairing logic */
    }
}

class Washer {
    fun wash() { /* Washing logic */
    }
}

class Refueler {
    fun refuel() { /* Refueling logic */
    }
}

//////////////######################## Example Document #######################//////////////////////////////////

class Printer {
    fun print() { /* Printing logic */
    }
}

class Saver {
    fun save() { /* Saving logic */
    }
}

class Sender {
    fun send() { /* Sending logic */
    }
}

class Translator {
    fun translate() { /* Translating logic */
    }
}


fun main() {

    /**
     * Each class has single responsibility
     * cook can made cook.
     * painter can do paint.
     * repairer can do repair.
     */
    val cook = Cook()
    cook.cook()

    val painter = Painter()
    painter.paint()

    val repairer = Repairer()
    repairer.repair()

}