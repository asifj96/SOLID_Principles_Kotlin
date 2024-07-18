package d

/**
 * - High-level modules should not depend on low-level modules.
 *   Both should depend on the abstraction.
 * - Abstractions should not depend on details.
 *   Details should depend on abstractions.
 *
 * This principle focuses at reducing the dependency of
 * a high-level Class on the low-level Class by introducing an interface.
 *
 */

//////////////######################## Example Payment #######################//////////////////////////////////

interface PaymentProcessor {
    fun processPayment(amount: Double)
}

class CreditCardProcessorClass : PaymentProcessor {
    override fun processPayment(amount: Double) {
        println("Processing payment of $amount using Credit Card")
    }
}

/**
 * when new requirement added
 */
class PaypalProcessorClass : PaymentProcessor{
    override fun processPayment(amount: Double) {
        println("Processing payment of $amount using PayPal")
    }

}

class PaymentServiceClass(private val paymentProcessor: PaymentProcessor) {
    fun makePayment(amount: Double) {
        paymentProcessor.processPayment(amount)
    }
}

//////////////######################## Example Notification #######################//////////////////////////////////


interface Notification {
    fun sendNotification(message: String)
}

class EmailNotificationClass : Notification {
    override fun sendNotification(message: String) {
        println("Sending email notification: $message")
    }
}
/**
 * when new requirement added
 */
class OneSignalNotification : Notification {
    override fun sendNotification(message: String) {
        println("Sending oneSignal notification: $message")
    }

}

class NotificationServiceClass(private val notification: Notification) {
    fun notify(message: String) {
        notification.sendNotification(message)
    }
}


//////////////######################## Example Database #######################//////////////////////////////////

interface Database {
    fun storeData(data: String)
}

class SQLDatabaseClass : Database {
    override fun storeData(data: String) {
        println("Storing data in SQL Database: $data")
    }
}
/**
 * when new requirement added
 */
class FirestoreDatabaseClass : Database{
    override fun storeData(data: String) {
        println("Storing data in Firestore Database: $data")
    }
}

class DataServiceClass(private val database: Database) {
    fun save(data: String) {
        database.storeData(data)
    }
}

//////////////######################## Example Logs #######################//////////////////////////////////

interface Logger {
    fun log(message: String)
}

class ConsoleLoggerClass : Logger {
    override fun log(message: String) {
        println("Logging to console: $message")
    }
}
/**
 * when new requirement added
 */
class RetrofitApiLoggerClass : Logger{
    override fun log(message: String) {
        println("Retrofit Logs : $message")
    }

}

class ApplicationClass(private val logger: Logger) {
    fun print() {
        logger.log("Application is running")
    }
}

fun main() {

    // Example Payment
    val paymentProcessor: PaymentProcessor = CreditCardProcessorClass()

    val paymentService = PaymentServiceClass(paymentProcessor)
    paymentService.makePayment(100.0)
    /**
     * when new requirement added
     */
    val paypalProcessor: PaymentProcessor = PaypalProcessorClass()
    val paypalService = PaymentServiceClass(paypalProcessor)
    paypalService.makePayment(200.0)

    // Example Notification
    val notification: Notification = EmailNotificationClass()
    val notificationService = NotificationServiceClass(notification)
    notificationService.notify("Hi email notify")
    /**
     * when new requirement added
     */
    val oneSignalNotification: Notification = OneSignalNotification()
    val oneSignalNotificationService = NotificationServiceClass(oneSignalNotification)
    oneSignalNotificationService.notify("one Signal notify")


    // Example Database
    val database: Database = SQLDatabaseClass()
    val dataService = DataServiceClass(database)
    dataService.save("SQL Sample Data")
    /**
     * when new requirement added
     */
    val firestoreDatabase: Database = FirestoreDatabaseClass()
    val firestoreDataService = DataServiceClass(firestoreDatabase)
    firestoreDataService.save("Firestore Sample Data")


    // Example Logs
    val logger: Logger = ConsoleLoggerClass()
    val application = ApplicationClass(logger)
    application.print()
    /**
     * when new requirement added
     */
    val apiLogger: Logger = RetrofitApiLoggerClass()
    val apiLoggerApplication = ApplicationClass(apiLogger)
    apiLoggerApplication.print()
}
