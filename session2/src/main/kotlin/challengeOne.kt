fun main(){
    println("Geuss my name ")
    challengeOne()
}

fun challengeOne(){
    val correctanswer = "hajar"
    val playerAnswer = readLine();

    if ( playerAnswer != null ){
        if (playerAnswer.contains(correctanswer)){
            println("you are correct")
            challengeTwo()
        }else {
            println("you are wrong")
        }
    }
}


fun challengeTwo(){
    val userGeuss = readLine()
    val diceResult = (1..6)random()

    //TODO: check  == problem for strings
    if (diceResult >= 4){
        winner()
    }
    else{
        gameover()
    }
}

fun winner()