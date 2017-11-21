import java.io.FileWriter

/**
 * Created by SAINTEK 101 on 11/21/2017.
 */

fun main(args: Array<String>) {
    print("masukkan nama :")
    var isidata = readLine().toString()
    writeFile(isidata)

}

fun  writeFile(str: String) {
    try {
        var lokasifile="src/test.txt";
        var fo = FileWriter(lokasifile,true)
        fo.write(str)
        fo.close()
        println("text telah berhasil di simpan di "+lokasifile)
    }catch (err: Exception){
        println(err.message)
    }
}
