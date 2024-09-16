fun main()
{
    val a=Car(name="Ritik",type="Petrol",kmRun=100)
    val b=Car(name="Garima",type="Gng",kmRun=200)

    println(a.name)
    println(a.type)
    println(b.name)
    println(b.type)

    a.driveCar();
    b.applyBreaks();

}
class Car(val name:String,val type:String,var kmRun:Int)
{
    fun driveCar()  {
          println("$name Car id driving")
    }                                               // method
    fun applyBreaks(){
        println("$name Car is applying breaks")
    }
}

