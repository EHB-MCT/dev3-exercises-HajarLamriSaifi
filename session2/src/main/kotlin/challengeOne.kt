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
        }else {
            println("you are wrong")
        }
    }
}