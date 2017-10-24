/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
open class pesawat2(val sayap:Int=2){
    init {
        println("object pesawat di buat ...")
    }
    fun cetakSayap(){
        println("Sayap :" +sayap)
    }
}

class PesawatTempur2(val rudal:Int=4) : pesawat2(){
    init {
        println("object pesawat tempur di buat ..")
   super.cetakSayap()
    }
}

fun main(args: Array<String>) {
val f16= PesawatTempur2()
}