object makeBiggestNumberFromInt extends App{
  val intToBeUsed  =91383463
  val arrayOfInts = intToBeUsed.toString.split("")
  val sortThenReverse = arrayOfInts.sorted.reverse
  println(sortThenReverse.mkString("").toInt)
  //https://www.geeksforgeeks.org/scala/how-to-sort-an-array-in-scala/

  def makeBiggestNumFromInt(x: Int): Int = {
    val arrayOfInts:Array[String] = x.toString.split("")
    val sortThenReverse: Array[String] = arrayOfInts.sorted.reverse
    sortThenReverse.mkString("").toInt
  }

  println(makeBiggestNumFromInt(32823864))
  println(makeBiggestNumFromInt(38129))
  println(makeBiggestNumFromInt(1756))
  println(makeBiggestNumFromInt(2132))

}
