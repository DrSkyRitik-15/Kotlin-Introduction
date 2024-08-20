fun main() {
    // Array of integers
    val number = arrayOf(1, 2, 3, 4, 5)

    // Array of Strings
    val name = arrayOf("John", "Mary", "David")
    val word: Array<String> = arrayOf("Kotlin", "Ritik", "Zoom", "King")

    // Array of squares using lambda function
    val square = Array(5) { i -> i * i }

    val firstNumber = number[0]
    val secondWord = word[1]
    println(firstNumber)
    println(secondWord)

    // Modify elements
    number[0] = 10  // modify the number
    word[1] = "Lalpila"
    println(number[0])
    println(word[1])


    println("Prinnt array")
        for( jk in number)
        {
            println(jk)
        }

        // using for each loop
        println("Print array using for each loop")
        word.forEach{ok-> println(ok)}

        //Or
        word.forEach{println(it)}   // it is the keyword


        // properties of array
        // isEmpty()
        //first()
        //last()
        //indexOf()
        //
}



