/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
class mobil3{
    companion object{
        @JvmField var pintu =2
        fun bukapintu(){
            println("buka pintu ...")
        }
    }

    var mesin =1
    var roda =4
    var body =1
}

fun main(args: Array<String>) {
    var avanza=mobil3()
    println("Mesin avanza :" +avanza.mesin)
    println("Pintu innova :" +mobil3.pintu)
    println("Pintu avanza :" +mobil3.pintu)

    mobil3.pintu=4
    println("Pintu innova :" +mobil3.pintu)
    println("Pintu avanza :" +mobil3.pintu)
    mobil3.bukapintu()
}