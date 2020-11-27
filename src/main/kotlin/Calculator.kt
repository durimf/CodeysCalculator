class Calculator(val name: String) {
    init {
        println("$name's Calculator \uD83E\uDDEE")

    }

    fun add(one: Int, two: Int): Int {
        return one + two
    }

    fun subtract(one: Int, two: Int): Int {
        return one - two
    }

    fun multiply(one: Int, two: Int): Int {
        return one * two
    }

    fun divide(one: Int, two: Int): Any {
        if (two == 0) {
            return "Error! Dividing by zero is not allowed."
        } else {
            return one / two
        }
    }

    fun power(one: Int, two: Int): Int {
        var result = 1
        for(i in 1..one) {
            result *= two
        }
        return result

    }




}

fun main() {
    val cal = Calculator("Codey")
    //Add
    println(cal.add(2, 4))
    //Subtract
    println(cal.subtract(2, 4))
    //Multiply
    println(cal.multiply(2, 4))
    //Divide
    println(cal.divide(2, 4))
    //Power
    println(cal.power(2, 4))
}