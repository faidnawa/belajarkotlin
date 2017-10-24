/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
class Mobil4(mesin:Int,roda:Int,body:Int){
    init {
        println("Mesin : $mesin")
        println("Roda  : $roda")
        println("Body  : $body")
    }
    var mesin = mesin
    var roda = roda
    var body = body
}

fun main(args: Array<String>) {
    var avanza =Mobil4(1,4,1)
    println("mesin avansa :" +avanza.mesin)
    println("Roda avansa :" +avanza.roda)
    println("Body avansa :" +avanza.body)
}