
object YourOrderPlease extends App {
  val string = "is2 Thi1s T4est 3a"
  val arrayOfStringss: Array[String] = string.split(" ")

  val oneWord = "6shivani"

  //get number make 1 <- "shivani"
  //https://www.baeldung.com/scala/check-string-number

  val splitWord = oneWord.split("") //split word into array of strings
  val getInt = splitWord.filter(x => x.forall(Character.isDigit)) //filter so that your left with a digit
  val inty = getInt.mkString.toInt
  println(inty)

  val thing = "h"
  val thingy = "4"
  println(thingy.forall(Character.isDigit))

  val mapIm = Map(inty -> oneWord)
  println(mapIm)

  def makeSingleMapFromOneWord(word: String): Map[Int, String] = {
    val splitWord = word.split("")
    val getInt = splitWord.filter(x => x.forall(Character.isDigit))
    val madeInt = getInt.mkString.toInt
    Map(madeInt -> word)
  }

  println(makeSingleMapFromOneWord("3shivani"))
  println(makeSingleMapFromOneWord("6vani"))
  println(makeSingleMapFromOneWord("5dkn"))

  def something(longString: String) = {

    def makeSingleMapFromOneWordInside(word: String) = {
      val splitWord = word.split("")
      val getInt = splitWord.filter(x => x.forall(Character.isDigit))
      val madeInt = getInt.mkString.toInt
      Map(madeInt -> word)
    }

    val arrayOfStrings = longString.split(" ")
    val mapIntWord = arrayOfStrings.map(x => makeSingleMapFromOneWordInside(x))
    val sortedMapIntWord = mapIntWord.sorted




  }



  //println(something("3jsdkh 4jvdfk 8fjdbv 6jkfdh").mkString("Array(", ", ", ")"))




}