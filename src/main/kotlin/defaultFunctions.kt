private fun findRecipes(title : String, ingredient: String, isVegetarin: Boolean = false, difficulty:String = "Moderate"): Array<Recipe> {
    return arrayOf(Recipe("ewu", true), Recipe("goat", false))
}



fun main(){
    findRecipes(title = "Beans",ingredient = "Salt")
}