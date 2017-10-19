/**
 * Created by faidnawa on 19/10/17
 */

fun show(name:String):Unit{
    println("name :"+name)
}

fun show(number:Int):Unit{
    println("number :"+number)
}

fun show(numberD:Double):Unit{
    print("numberD :"+numberD)
}

fun main(args: Array<String>) {
    show("faidl")
    show(100)
    show(100.1)
}