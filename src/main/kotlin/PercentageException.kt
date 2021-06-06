import java.lang.IllegalArgumentException

fun main(){
    var str:String = ""
    val w : Wolf? = Wolf()
    try {
        setWorkRatePercentage(100)
    }catch (e: IllegalAccessException){
        println(e.message)
    }

    //How to use try as an expression
    var result = try { str.toInt() } catch(e: Exception) { null }
    //How to use throw as an expression
    val h = w?.hunger ?: throw BakingException()

}

fun setWorkRatePercentage(x: Int){
    if(x !in 0..100){
        throw IllegalArgumentException("Percentage not in range 0..100: $x")
    }
}

