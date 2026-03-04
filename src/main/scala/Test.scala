import scala.collection.mutable.ListBuffer

object Test extends App{
  //  Build a function that returns an array of integers from n to 1 where n > 0.
  //
  //  Example: n
  //  = 5 --> [5,4,3,2,1]

  def reverseSequ(n: Int): Seq[Int] = {
    val mutableList = ListBuffer[Int]()
    for (i <- 1 to n) { // inclusive range
      mutableList += i;
    }
    mutableList.reverse.toSeq

  }
  println(reverseSequ(4))

}
