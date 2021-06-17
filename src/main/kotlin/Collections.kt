
data class Recip(var name: String)

fun main(){
    var mShoppingList = mutableListOf("Tea","Eggs","Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf("Cookies","Sugar","Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList original: $mShoppingList")
    if(mShoppingList.contains("Tea")) mShoppingList.set(mShoppingList.indexOf("Tea"),"Coffee")
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reversed()
    println("mShoppingList reversed: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reverse: $mShoppingList")
    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingList mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives","Spinach","Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added : $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

    val r1 = Recip("Chicken Soup")
    val r2 = Recip("Quinoa Salad")
    val r3 = Recip("Thai Curry")
    val r4 = Recip("Jambalaya")
    val r5 = Recip("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe1" to r1,"Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMAp original $mRecipeMap")
    val recipeToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    println("recipeToAdd original $recipeToAdd")
    mRecipeMap.putAll(recipeToAdd)
    println("mRecipeMAp new version $mRecipeMap")
    if(mRecipeMap.containsKey("Recipe1"))println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    println()
    println("Code mangnet starts here")
}