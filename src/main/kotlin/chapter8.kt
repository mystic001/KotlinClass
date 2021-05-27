fun main(){
    val w: Wolf? = Wolf()

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


    // this is the use of let keyword. and it
    // Once you’ve established that the value is not null, you can refer to it(w)
    // in the body of the let using it.
    w?.let{
        print("Printing hunger")
        println(it.hunger)
    }


    val alpha = getWolf(w)
// Another use of let keyword
    getWolf(w)?.let{
        it.eat()
    }

// Another use of it keyword it refers to the object in context
    val array = arrayOf("Hi", "Hello",null)
    for(item in array){
        if(item == null){
            println("I am $item")
        }
        item?.let { println(it) }
    }
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


fun getWolf(wolf: Wolf?): Wolf?{
    return wolf;
}


//defining functions to be nullable types

fun res(x: Double, y: Double) : Double? = (x+y)


class MyWolf(){
    private var w : Wolf? = Wolf()


    fun myFunction(){
        w?.eat()
    }



}
