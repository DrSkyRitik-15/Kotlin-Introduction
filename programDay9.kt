fun main(){
    val sq=LLL();
    sq.square(5.55);
    sq.rect(6.5,1.2);
}
open class Parent{
open fun square(x:Double){
   // println(" The Square number is $x")

}
open fun rect(x:Double,b:Double){
    //println(" The Rectangle number is $x")

}

}
class LLL:Parent(){
    override fun square(x:Double){
        println(" The Square number is ${x*x}")
        }
        override fun rect(x:Double,b:Double){
            println(" The Rectangle number is ${x*b}")
            }
            }
