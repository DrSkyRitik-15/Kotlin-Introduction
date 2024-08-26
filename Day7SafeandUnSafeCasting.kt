fun main(){
    val a="hi";
    val b: String=a as String
    println("Un Safe cast result $b")

    // val c:Int=a as Int
    // println("This will be not excuted $c")

    val d:String?= a as? String // Suceesfully cast
    if (d!=null)
    {
        println("Safe Cast Result: $d")

    }
    else
    {
        println("Safe Cast Result: field or null")
    }
    val e:Int?=a as? Int // SAfe cast will return null

    if(e!=null)
    {
        println("Safe cast will   $e")
    }
    else
    {
        println("SAfe   e   is field")
    }
}