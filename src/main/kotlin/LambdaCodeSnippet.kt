fun unless(condition: Boolean,code:()->Unit){

    if(!condition){
        code()
    }
}


fun main(){

    val arrayOfColors = arrayOf("Red","Yellow","Green")

    var crossWalk = arrayOfColors[(Math.random()*arrayOfColors.size).toInt()]

    if(crossWalk == "") print("walk")
    unless(crossWalk == "Green"){
        println("Stop")
    }



}