fun main(){

    val test = "Yes"
    val test2 = "No"

    try{
        println("Start try")
        /*
        * When a code throws and exception every other parts of the code
        * that has not been executed before the throeing of the exception
        *  wnt be executed and the program or block of code exit and runs
        * the code in the catch if any exist a perfect example is the one
        * in page 414 of headfirst ...when test is yed the code in the risky part of the
        * code stops running and executes twhats in the catch also the try is not e printed as the code jhumps to catch
        * straight and leaves behind every code.

        * */
        riskyCode(test2)
        println("End try ")
    }catch (e: BadException){
        println("BadException")
    }finally {
        println("finally")
    }

    println("End of main")
}


class BadException: Exception()

fun riskyCode(test: String){
    println("Start risky code")

    if(test =="Yes"){
        throw BadException()
    }

    println("End risky code");
}