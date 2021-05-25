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

    //defining a parameter

    fun printingBlue( x :Int?) : String = "blue"

    fun printlnBlack(color: String?): String? {

        val col = color

        return col
    }


    //defining functions to be nullable types

    fun res() : Int?{

        return 56
    }

}