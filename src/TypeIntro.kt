import com.sun.tools.classfile.Opcode

const val MAX_EXPERIENCE: Int = 5000
const val PLAYER_NAME = "Estragon"
val SEED: List<String> = listOf("Dragon", "Minotaur")
const val BAR_NAME = "The Unicorn's Horn"
var DRINKS_MENU = setOf ( "mead", "wine", "LaCroix")

fun main() {
    // Note: var can be modified at any point in the code!
    var experiencePoints = 5
    experiencePoints += 5

    //Challenge: The Unicorn's Horn
    // variables
    var hasSteed = ""
    val barPublican = "Madrigal"
    var totalGold = 50


    println("\n\t\t***\t  $BAR_NAME \t***\n\n")

    println("The hero $PLAYER_NAME $hasSteed at a pub known as $BAR_NAME. " +
            "\nThe $barPublican asks, “Do you need to stable a steed?”")
    println("\"No,\" $PLAYER_NAME  replies, \"I have no steed. \nBut I do have $totalGold gold pieces, and I would like a drink.\"" +
            "\n\"Excellent!\" says the $barPublican. \"I have $DRINKS_MENU. What will you have?\"")


    println("\n\n\t\t***\t Challenge: Magic Mirror \t***\n")

    println("The hero discovers a magic mirror that shows a player the reflection of their $PLAYER_NAME. " +
            "\nUsing the String type’s magic, transform the playerName string \"Estragon\" into \"nogartsE\", a reflection of its value.")
    println("Player's name $PLAYER_NAME ")
    println("Magic: $PLAYER_NAME.reversed()")
    println(hasSteed)
}
