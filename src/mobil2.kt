/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
class mobil2{
    var mesin =1
    var roda  =4
    var body = 1
}

fun main(args: Array<String>) {
    var avanza = mobil2()
    var innova = mobil2()

    println(" Roda avanza :" + avanza.roda)
    println(" Roda innova :"  + innova.roda)
    avanza.roda=5
    println("Mesin avanza :" + avanza.mesin)
    println("mesin innova :" +innova.mesin)
    avanza.mesin=2

    println("Mesin avanza :" + avanza.mesin)
    println("Mesin innova :" + innova.mesin)
}