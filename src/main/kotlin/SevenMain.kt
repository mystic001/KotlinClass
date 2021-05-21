fun main(){
    val w = Wolf()
    val x = Wolf();

    if(w == x) println("they are the same ${w.hashCode()} and ${x.hashCode()}")
    else print("they are not the same  ${w.hashCode()} and ${x.hashCode()}")

}