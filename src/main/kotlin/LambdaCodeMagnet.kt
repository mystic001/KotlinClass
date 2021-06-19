
data class Grocery(val name:String, val category: String, val unit:String, val unitPrice:Double)


fun search(list: List<Grocery>,criteria:(Grocery)->Boolean){

    for(l in list){
      if(criteria(l)) println(l.name)
    }

}


fun main(){
    val groceries = listOf<Grocery>(Grocery("Tomatoes","Vegetable","lib",3.0),
    Grocery("Bagels","Bakery","Pack",1.5),Grocery("Olive Oil","Pantry", "Bottle",6.0),
    Grocery("Ice cream","Frozen","Pack",3.0))

    println("Expensive ingredients:")
    search(groceries){i:Grocery-> i.unitPrice > 5.0 }
    println("Print All Vegetables")
    search(groceries){
        it.category == "Vegetable"
    }

    println("All packs")
    search(groceries){
        it.unit == "Pack"
    }
}

fun myFun1(x: Int = 6, y: (Int)-> Int = {it}):Int{

    return y(x)
}

fun myFun5(x:(Int)->Int ={
    print(it)
    it + 7
} ){
    x(4);
}