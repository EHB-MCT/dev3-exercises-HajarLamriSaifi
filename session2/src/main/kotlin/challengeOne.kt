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
    val lowResult = (1-3)
    val highResult = (4-6)

    if (userGeuss == lowResult){
        
    } if (userGeuss == highResult){

    }
    else{
        println("gameover")
    }
}



