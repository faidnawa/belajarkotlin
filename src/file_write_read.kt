import java.io.FileReader
import java.io.FileWriter
import kotlin.system.exitProcess
/**
 * Created by faidnawa on 23/11/17
 */

class baca_tulis_file(){
    fun writeFile(str: String) {
        try {
            var fo = FileWriter("src/test.txt",true)
            fo.write(str)
            fo.close()
        }catch (err: Exception){
            println(err.message)
        }
    }

    fun readFile() {
        try {
            var fin=FileReader("src/test.txt")
            var c:Int
            do {
                c= fin.read()
                print(c.toChar())
            }while (c!=-1)
        }catch (err:Exception){
            println(err.message)
        }
    }
}

fun main(args: Array<String>) {
        println("Program Read Write")
    var pilih: Int?=null
    while (pilih !=3) {
        println("pilih salah satu action dibawah ")
        println("1 Write File")
        println("2 Read File")
        println("3 Keluar")
        print("Pilih :")
        pilih = readLine()!!.toInt()
        var tulis = baca_tulis_file()
        if (pilih == 1) {
            print("Masukkan Teks :")
            var isidata = readLine()!!.toString()
            tulis.writeFile(isidata)
        } else if (pilih == 2) {
            tulis.readFile()
            println("")
        } else if (pilih == 3) {
            print("trimakasih telah menggunakan aplikasi ini")
            exitProcess(0)
        } else {
            println("inputan hanya sampai 1-3")
        }
    }
}