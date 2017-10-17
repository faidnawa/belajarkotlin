import java.util.*

/**
 * Created by SAINTEK 101 on 10/2/2017.
 */
fun main(args: Array<String>) {
    //inputan
    print("Enter your Year =")
    var DOB:Int= readLine()!!.toInt()

    //proses

    var year=Calendar.getInstance().get(Calendar.YEAR)
    var Age:Int?
    Age=year-DOB

    //output
    println("your Age is $Age year")
}