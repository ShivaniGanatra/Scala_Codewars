object YourOrderPlease2 extends App{
  val string = "3jsdkh 4jvdfk fj8dbv 6jkfdh n1njf 3njdcn"
  val splitString = string.split(" ")
  println(splitString.sortBy(n => n).mkString("Array(", ", ", ")"))

  def getDigitFromString(x: Int): Int = {
    val arrayOfInts:Array[String] = x.toString.split("")
    val sortThenReverse: Array[String] = arrayOfInts.sorted.reverse
    sortThenReverse.mkString("").toInt
  }


}
