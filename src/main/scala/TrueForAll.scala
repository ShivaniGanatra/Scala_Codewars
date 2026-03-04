import scala.collection.mutable.ListBuffer

object TrueForAll extends App{

//  Task
//  Create a method all which takes two params :
//
//    a sequence
//      a function
//      and returns true
//    if the function in the params returns true for every element in the sequence.Otherwise
//  , it should
//  return false.If the sequence is empty
//  , it should
//  return true
//  , since technically nothing failed the test
//.
//
//  Example
//  all((1, 2, 3, 4, 5), greater_than_9) -> false
//  all((1, 2, 3, 4, 5), less_than_9) -> True

  def all(xs: Seq[Int], f: Int => Boolean): Boolean =  {
    val booleanList = new ListBuffer[Boolean]()

    for (number <- xs) {
        println(number)
      booleanList += f(number)
    }

    println(booleanList)
    if (booleanList.contains(false)) {
      return false
    }
    true

  }


  println(all(Seq(1, 2, 3, 4, 5), _ > 9))
}
