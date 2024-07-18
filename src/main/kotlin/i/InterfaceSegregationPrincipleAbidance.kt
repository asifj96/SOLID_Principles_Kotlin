package i

/**
 * Clients should not be forced to depend on methods that they do not use.
 * When a Class is required to perform actions that are not useful,
 * it is wasteful and may produce unexpected bugs
 * if the Class does not have the ability to perform those actions.
 *
 * A Class should perform only actions that are needed to fulfil its role.
 * Any other action should be removed completely or moved somewhere else
 * if it might be used by another Class in the future.
 *
 * This principle says that splitting a set of actions into smaller sets
 * so that a Class executes ONLY the set of actions it requires.
 */


interface ICoder {
    fun code()
}

interface IDesigner {
    fun design()
}

interface ITester {
    fun test()
}

interface IManager {
    fun manage()
}

class DeveloperClass : ICoder {
    override fun code() {
        println("I can code")
    }
}

class GraphicDesigner : IDesigner {
    override fun design() {
        println("I can design")
    }
}

class QAEngineer : ITester {
    override fun test() {
        println("I can test")
    }
}

class ProjectManager : IManager {
    override fun manage() {
        println("I can manage")
    }
}

fun main() {
    val coder: ICoder = DeveloperClass()
    coder.code()

    val designer: IDesigner = GraphicDesigner()
    designer.design()

    val tester: ITester = QAEngineer()
    tester.test()

    val manager: IManager = ProjectManager()
    manager.manage()
}
