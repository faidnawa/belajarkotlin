/**
 * Created by faidnawa on 18/10/17
 */
fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"faidl")
    map.put(2,"fahruddin")
    map.put(33,"nawa")
    println(map.get(33))
    map.put(33,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }

    var map2=HashMap<String,String>()
    map2.put("nama_depan :","faidl")
    map2.put("nama_tengah :","fahruddin")
    map2.put("nama_belakang :","nawa")
    map2.put("nama_tengah :","Unisnu Jepara")
    //println(map.keys)
    for (j in map2.keys){
        println(j + ""+map2.get(j))
    }
}