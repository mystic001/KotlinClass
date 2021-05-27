class WolfOne {
     var hunger = 10
    val food = "meat"

    fun eat(){
        println("The wolf is eating $food")
    }
}


class MyWolfone{
    var wolf : WolfOne? = WolfOne()

    fun myFunction(){
        wolf?.eat()
    }
}

fun getAlphaWolf(): WolfOne{
    return WolfOne()
}

fun main(){
    var w : WolfOne? = WolfOne()

    if(w != null){
        w.eat()
    }
    var x = w?.hunger
    println("The value of hunger is $x")
    println("")

    val y = w?.hunger ?: -1

    print("The value of y is $y")
    println("")

    val mywolfone = MyWolfone()
    mywolfone?.wolf?.hunger


    val myStrings = arrayOf("Hi","Hello","Welcome","Goodbye",null)
    for(contents in myStrings){
        contents?.let {
            println(it)
        println("")}
    }


    getAlphaWolf()?.let { it.eat() }

    w = null


}