package d

//////////////######################## Example Payment #######################//////////////////////////////////

class CreditCardProcessor {
    fun processPayment(amount: Double) {
        println("Processing payment of $amount using Credit Card")
    }
}

class PaymentService(private val creditCardProcessor: CreditCardProcessor) {
    fun makePayment(amount: Double) {
        creditCardProcessor.processPayment(amount)
    }
}


//////////////######################## Example Notification #######################//////////////////////////////////

class EmailNotification {
    fun sendNotification(message: String) {
        println("Sending email notification: $message")
    }
}

class NotificationService(private val emailNotification: EmailNotification) {
    fun notify(message: String) {
        emailNotification.sendNotification(message)
    }
}

//////////////######################## Example Database #######################//////////////////////////////////


class SQLDatabase {
    fun storeData(data: String) {
        println("Storing data in SQL Database: $data")
    }
}

class DataService(private val sqlDatabase: SQLDatabase) {
    fun save(data: String) {
        sqlDatabase.storeData(data)
    }
}

//////////////######################## Example Logs #######################//////////////////////////////////


class ConsoleLogger {
    fun log(message: String) {
        println("Logging to console: $message")
    }
}

class Application(private val consoleLogger: ConsoleLogger) {
    fun run() {
        consoleLogger.log("Application is running")
    }
}


fun main() {
    // Example Payment
    val paymentService =
        PaymentService(CreditCardProcessor()) // high level class CreditCardProcessor depends on low level class PaymentService which violates DIP.
    paymentService.makePayment(100.0)

    //  Example Notification
    val notificationService = NotificationService(EmailNotification())
    notificationService.notify("Hello, World!")

    // Example Database
    val dataService = DataService(SQLDatabase())
    dataService.save("Sample Data")

    // Example Logs
    val application = Application(ConsoleLogger())
    application.run()

}
