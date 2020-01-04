fun main(){

    /*
    * EXPLICIT DECLARATION OF VARIABLE TYPE SYNTAX
    *
    *  val variableName : variableType = variableValue
    * */

    /*
    * DECLARATION OF VARIABLE TYPE WITHOUT SPECIFYING TYPE
    *
    * val variableName = variableValue
    *
    * N.B. compiler infers what type variable is.
    *
    * */


    /* MAXIMUM RANGES FOR INTEGER NUMBERS
    * */

    val varByte : Byte = 127
    val varShort : Short = 32767
    val varInt : Int = 2_147_483_647 // same as 2147483647, kotlin allows _ between numbers to enhance readability
    val varLong : Long = 9_223_372_036_854_775_807


    //    var someNumber : Int =     214748364790
    val anotherNumber : Long = 214748364790


    /* FLOAT AND DOUBLE NUMBER TYPE
    * */

    val floatVariable : Float = 3.123456789f
    val doubleVariable : Double = 3.123456789

    println(floatVariable)   // 3.1234567
    println(doubleVariable)  // 3.123456789


    /* BOOLEAN TYPE
    * */

    val isEarthSpherical = true
    val isEarthFlat = false


    /*
    *
    * CHARACTER TYPE
    *
    * */

    val aCharacterVariable : Char = 'c'
    val anotherCharacterVariable : Char= '1'
    val aCharacter = '+'   // Char type is inferred.

    println(aCharacter)               // +
    println(aCharacterVariable)       // c
    println(anotherCharacterVariable) // 1


    /*
    *
    * ARRAY TYPE
    *
    * */

    val intArray : IntArray = intArrayOf(1, 2, 3, 4, 5)
    val booleanArray : BooleanArray = booleanArrayOf(true, false, false)
    val fruitArray : Array<String> = arrayOf("apple", "oranges", "melon")



    //accessing array members

    println("The 5th element in the intArray is " + intArray[4])
    println("The last fruit in the fruit array is " + fruitArray[2])

    // COMPILATION OUTPUT
    //
    // The 5th element in the intArray is 5
    // The last fruit in the fruit array is melon


    /*
    *
    * STRING TYPE
    *
    * */

    val aString : String = "what's on your mind? "

    println(aString)

    println(aString + "None of your business!")

    // COMPILATION OUTPUT
    //
    // what's on your mind? None of your business!


    val rawString = """
        what's up?
            I'm good

        You sure?
            really Sure!

    """

    println(rawString)
}




