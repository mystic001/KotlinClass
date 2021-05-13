/*
The code on the left represents a source file. Your job is to play like you’re
the compiler and say which of the A-B pairs of functions on the right would
compile and produce the required output when inserted into the code on the
left. The A function fits into class Monster, and the B function fits into class
Vampyre.
 */


open class Monster {
    open fun frighten():Boolean{
        println("Argh")
        return true
    }

    class Vampyre:Monster(){

        override fun frighten(): Boolean {
            println("Fancy a bite")
            return false;
        }
    }

    class Dragon:Monster(){
        override fun frighten(): Boolean {
            println("fire")
            return true
        }
    }
}


fun main(){
    val m = arrayOf(Monster.Vampyre(),Monster.Dragon(),Monster())
    for(item in m){
        item.frighten()
    }
}

