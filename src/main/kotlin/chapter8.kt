fun main(){
    var w: Wolf? = Wolf()

    w = null
    var a : Canine
    val b : Wolf? = Wolf()
    var c : Animal?
    b?.hunger
    val d : Bird? = Bird()
    // elvis operator
    //Simply means if the object d is not null return
    //the property x else returns boys
    val s = d?.x ?: "boys"
    val str : String? = "Pizza";

    println(printingBlue(4))
    println(printlnBlack("yellow"))
    println(res(4.0,6.0))

}


//defining a parameter

fun printingBlue( x :Int?) : String = "blue"

fun printlnBlack(color: String?): String? {

    val col = color

    return col
}


//defining functions to be nullable types

fun res(x: Double, y: Double) : Double? = (x+y)


class MyWolf(){
    private var w : Wolf? = Wolf()


    fun myFunction(){
        w?.eat()
    }



}
