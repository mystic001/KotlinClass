val first = { x: Int -> x + 5 }
typealias DoubleConversion = (Double)->Double
typealias DuckArray = Array<Duck>
fun main() {
    print(first(5))
    print(first.invoke(5))
    val res = first(10)
    println(res)
    val msg = { x: Int -> "The value of int $x" }
    println(msg(30))
    val msgremix: (Int, Int) -> String = { x: Int, y: Int -> "That value is ${x + y}" }
    println(msgremix(100, 20))

    //When defining paramaters in lambda always keep dem in bracket
    val add: (Int) -> Int
    //This is saying you can use it since when defining the add value only one parameter is indicated so when u are establishing th variable
    // You can omit the paramrter.
    add = { it + 4 }
    //call add
    val pod = add(2)
    println(pod)

    //incase you have a lambda that is not returning anything you can define such
    val empty: (str: String) -> Unit
    empty = { m -> print(m.lowercase()) }
    empty("THEBOY")

    //U can pass a lambda as function

    fun convert(x: Double, converter: (Double) -> Double): Double {
        val converted = converter(x)
        return converted
    }
    println(convert(20.0, { c: Double -> c * 1.8 + 32 }))
    //It can be moved outside if the lambda parameter is d last...
    println(convert(20.00) { c: Double ->
        c * 1.8 + 32
    })
    println(convert(5.0, converter = { x -> 30 + x }))

    // You can slso remove the bracket completely if the lambda is the only parameter in the function;

    fun converFive(conv: (Double) -> Double): Double {
        val fin = conv(5.0);
        return fin;
    }

    println("This is the one with bracket ${converFive(conv = { it + 5 })}}")
    println(converFive({ c: Double -> c + 20 }))
    println(converFive {
        it + 800
    })
    //fuction returning lambda
    fun getConversionType(str: String): (Double) -> Double {

        when (str) {
            "CentiToFahr" -> return { it * 1.8 + 2 }
            "kgToPounds" -> return { it * 2.04263 }
            "PoundsToUsPounds" -> return { it/2000 }
            else -> return  {it}
        }

    }

    print(getConversionType("CentiToFahr")(2.5))

//This is how u use lambda
    fun arithmetic(str:String):(Double,Double)-> Double{
        when(str){
            "Addition" -> return { x,y-> x+y}
            "Subtraction" -> return {x,y -> if(x > y) x - y else y - x}
            "Division" -> return {x,y -> x/y}
            "Multiplication" -> return{x,y -> x*y}
            else -> return {x,y -> x}
        }
    }

    println(arithmetic("Addition")(10.00,4.00))
    println(arithmetic("Subtraction")(10.00,4.00))
    println(arithmetic(str="Division")(10.00,2.00))
    println(arithmetic("Multiplication")(10.00,4.00))

    //Combination of lambdas in a function

    fun combine(lambda1: (Double)-> Double, lambda2: (Double)-> Double): (Double) -> Double{
        return {c:Double -> c}

    }

    // The above function that is defined can be redefined using type alias
    //Note that type alias are allowed to be done outside of a method they are not allowed locally

    fun comb(lambda1:DoubleConversion,lambda2:DoubleConversion):DoubleConversion{
        return {c:Double -> c}
    }

}


