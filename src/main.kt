fun main() {
    var temperature: Double = 0.0
    var again: Boolean = true
    var userChoice: String = "Y"

    while(userChoice.equals("Y")) {
        print("Enter a temperature between 92.0 and 104.0: ")
        temperature = readLine()!!.toDouble()

        if (temperature < 97.5)
            println("$temperature is Low")
        else if (temperature < 99.5)
            println("$temperature is Normal")
        else
            println("$temperature is High")

        print("Would you like to check another tempearture? Y or N: ")
        userChoice = readLine()!!.toString()

    }

}