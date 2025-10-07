object FindTheOddInt extends App{
  //make it into a set ao val appears once
  val sequence = Seq(1,1,2,-2,5,2,4,4,-1,-2,5)

//https://stackoverflow.com/questions/11448685/scala-how-can-i-count-the-number-of-occurrences-in-a-list
  //https://www.geeksforgeeks.org/scala/how-to-get-all-the-keys-from-a-scala-map/
  val a = sequence.groupBy(l => l).map(t => (t._1, t._2.length))
  println(a)


  //println(a.map(pair => pair._1-> pair._2)) //this will lowercase keys
  // Map(jim -> 55, daniel -> 789)
  val x = a.filter(pair => pair._2 % 2 == 1)
  val v = x.keySet.mkString
  val j = v.toInt
  println(j)

  def findOddInt(xs: Seq[Int]): Int = {
   val valuesAndTheirOccurencesMap = xs.groupBy(l => l).map(t => (t._1, t._2.length))
    val filterIfOccurenceIsOdd = valuesAndTheirOccurencesMap.filter(pair => pair._2 % 2 == 1)
    val getKeyAndMakeString = filterIfOccurenceIsOdd.keySet.mkString
    val turnStringIntoInt = getKeyAndMakeString.toInt
    turnStringIntoInt
  }

}
