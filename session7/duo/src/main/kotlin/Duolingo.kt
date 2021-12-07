class Duolingo (
    val soundSize: Int = 5,
    val language: String = "fr"
        ){

        var words = mutableListOf<Word>(
            Frenchword( "nain de jardin", "tuinkabouter"),
            Frenchword("Oiseau", "Vogel"),
            Frenchword("Chaussures","Schoenen"),
            Englishword("Night", "Nacht"),
            Englishword("Food", "Voedsel")
        )
    init {
     words = words.filter {it.language == language} .toMutableList()
    }


        fun play() {
         val currentWords = words.shuffled().take(soundSize).toMutableSet()
            println(currentWords.count())

            while (currentWords.isNotEmpty()){
                val selectWords = currentWords.random()
            println("what's the translation of ${selectWords.original}")
            val userAnswer = readLine()

            if (selectWords.translated == userAnswer){
                currentWords.remove(selectWords)
            }
            println(currentWords.count())
        }
    }}
