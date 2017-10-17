/**
 * Created by SAINTEK 101 on 10/2/2017.
 */
fun main(args: Array<String>) {
    println("------- Math Calculator -------")
    print("enter n1 :")
    var n1:Int= readLine()!!.toInt()
    print("enter n2 :")
    var n2:Int= readLine()!!.toInt()
    print("enter n3 :")
    var n3:Int= readLine()!!.toInt()
    var sum:Int?
    sum=(n1+n2)*n3-3
    print("sum =" + sum)
}