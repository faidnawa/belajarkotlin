fun main(args: Array<String>) {
   var arraylist=ArrayList<String>()
    arraylist.add("faidl")
    arraylist.add("fahruddin")
    arraylist.add("nawa")
    arraylist.add("jepara")

    println("First Name :" +arraylist.get(0))
    println("all element by object")

    for (item in arraylist){
        print(item)
    }
}