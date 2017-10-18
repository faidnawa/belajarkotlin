fun main(args: Array<String>) {
   var arraylist=ArrayList<String>()
    arraylist.add("faidl")
    arraylist.add("fahruddin")
    arraylist.add("nawa")
    arraylist.add("jepara")

    println("First Name :" +arraylist.get(0))
    println("all element by object")

    for (item in arraylist){
        println(item)
    }

    arraylist.set(0,"Unisnu Jepara")
    println("all element by index")
    for(index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    //search
    if (arraylist.contains("faidl")){
        println("name is found")
    }
    else{
        println("name is not found")
    }
}
