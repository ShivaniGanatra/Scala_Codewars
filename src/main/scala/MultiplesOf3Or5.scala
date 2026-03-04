import scala.collection.mutable.ListBuffer
import scala.language.postfixOps

object MultiplesOf3Or5 extends App{

//  If we list all the natural numbers below 10 that are multiples of
//  3 or 5
//  , we get 3
//  , 5
//  , 6 and 9. The sum of these multiples is
//  23.
//
//  Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in
//.
//
//  Note: If a number is a multiple of both 3 and 5
//  , only count it once
//.
  def solution(number: Int): Long = {

    var a: Long = 0
    for (i <- 1 until number) {
      if(i %3 == 0 && i % 5 == 0){
        a = a + i
      }else if(i %3 == 0){
        a = a + i
      }else if(i % 5 == 0){
        a = a + i
      }
    }
    a



  }

  println(solution(10000))





}
