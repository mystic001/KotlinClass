import java.lang.Exception

fun main(){
    val test1 = "No"
    val test2 ="Yes"
    try{
        print("t")
        print("h")
        myFuntion(test2)
    }catch (e: BadException){
        print("r")
        print("o")
    }finally {
        print("w")
        print("s")
    }
}

 fun myFuntion(test : String){
     if(test == "Yes"){
         throw BadException()
     }
     print("a")
}