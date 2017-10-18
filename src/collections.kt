/**
 * Created by faidnawa on 18/10/17
 */
fun main(args: Array<String>) {
    var map= hashMapOf("nama_depan" to "faidl","nama_tengah" to "fahruddin")
    map.put("nama_belakang","nawa")
    println(map.get("nama_belakang"))
    println(map["nama_belakang"])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])
    var lint = mutableListOf(11,22,33,22)
    lint[0]=22

    for (item in lint){
        println(item)
    }


}