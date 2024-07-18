package i


interface Worker {
    fun code()
    fun design()
    fun test()
    fun manage()
}

class Developer : Worker {
    override fun code() {
        println("I can code")
    }

    override fun design() {
        println("")
    }

    override fun test() {
        println("")
    }

    override fun manage() {
        println("")
    }
}

class Designer : Worker {
    override fun code() {
        println("")
    }

    override fun design() {
        println("I can design")
    }

    override fun test() {
        println("")
    }

    override fun manage() {
        println("")
    }
}

class Tester : Worker {
    override fun code() {
        println("")
    }

    override fun design() {
        println("")
    }

    override fun test() {
        println("I can test")
    }

    override fun manage() {
        println("")
    }
}

class Manager : Worker {
    override fun code() {
        println("")
    }

    override fun design() {
        println("")
    }

    override fun test() {
        println("")
    }

    override fun manage() {
        println("I can manage")
    }
}

fun main() {
    val developer: Worker = Developer()
    developer.code()
    developer.design()
    developer.test()
    developer.manage()

    val designer: Worker = Designer()
    designer.code()
    designer.design()
    designer.test()
    designer.manage()

    val tester: Worker = Tester()
    tester.code()
    tester.design()
    tester.test()
    tester.manage()

    val manager: Worker = Manager()
    manager.code()
    manager.design()
    manager.test()
    manager.manage()
}
