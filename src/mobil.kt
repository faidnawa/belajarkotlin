/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
class Mobil{
    var mesin=1
    var roda=4
    var body=1

    fun maju(){
        println("maju ...")
    }
    fun mundur(){
        println("mundur ...")
    }
    fun  belok(){
        println("belokk ...")
    }
}

fun main(args: Array<String>) {
    var avanza=Mobil()
    avanza.maju()
    avanza.mundur()
    avanza.belok()

    println(" mesin :" +avanza.mesin)
    println(" roda  :" +avanza.roda)
    println(" body  :" +avanza.body)

}