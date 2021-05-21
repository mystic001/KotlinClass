fun main(){
    val flyers = arrayOf(Bird(),Superhero(),Plane())
    var xf = 0;
    var x = 0;
    while ( xf in 0..2){
        when(flyers[xf]){
            is Plane, is Superhero-> flyers[xf].fly()
        }
        xf++
    }

   println("wants to execute the scond possible option ")
    while(x in 0..2){
        val y = when(flyers[x]){
            is Bird -> false
            else -> true
        }

        if(y) flyers[x].fly()

        x++
    }

}