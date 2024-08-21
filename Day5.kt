fun main(){
    var a=5
    var b=6
     val isFalse=false
     val isTrue=true
     // arithmethic 
     val sum=a+b
     println("Addition: $a + $b = $sum")
     println("Multiply: $a * $b = ${a*b}")

     //comparison 
     println("Is $a greater than $b? ${a>b}")
     val isEqual= a==b;
     println("Is $a equal to $b: $isEqual")
     // logical

     val andResult= isTrue && isFalse
     val notResult= !isTrue;
     println("Is true and false: $andResult")
     println("Is true and false: $notResult")




}