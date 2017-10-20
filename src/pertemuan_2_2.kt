fun main(args: Array<String>) {
    var arraylist= ArrayList<String>()
    arraylist.add("ahmad")
    arraylist.add("ulil")
    arraylist.add("abshor")
    arraylist.add("jepara")

    println("First name: "+ arraylist.get(0))
    println("last name: "+ arraylist.get(3))

    println(" all element by object ")
    for (item in arraylist){
        println(item)
    }
}