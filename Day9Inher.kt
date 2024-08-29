fun main()
{
    var a=BCD()
    a.think()
}
open class ABC{
    open fun think()
    {
        println("ABC apllk yellow love i think")
    }

}
class BCD:ABC()
{
    override fun think(){
        println("/////////////////")
    }
}