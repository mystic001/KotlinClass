fun main(args: Array<String>){
    val addFive = {x: Int -> x + 5}
    println("When we pass the value of 6 to 5 we get ${addFive(6)}")

    val addInts = {x:Int, y:Int -> x+y}
    val results = addInts.invoke(6,7);
    println("The addition of 6 and 7 gives $results")
    val IntLambda: (Int,Int) -> Int = {x,y-> x*y}
    println("The multiplication of the 6 and 7 is ${IntLambda(6,7)}")

    val addSeven : (Int) -> Int = {it + 7}
    println("The addition of seven to 10 is ${addSeven(10)}")

    val myLambda:() -> Unit = { println("Hi dere")}
    myLambda()
}