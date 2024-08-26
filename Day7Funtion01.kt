fun sum(a:Int=20,b:Int=30)
{
    val c=a+b;
    println("The sum is => $c");
}
fun mul(a:Int ,b:Int)
{
    val c=a*b;
    println("The product is => $c");

}
fun main()
{

sum();
sum(10,10)
// mul();      will generate error.
mul(10,10);
}