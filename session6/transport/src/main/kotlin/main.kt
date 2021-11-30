import java.sql.*
import java.util.*


fun main(){
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = credentials()



    val connectionProps = Properties()
    connectionProps["user"] =credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword


    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

}