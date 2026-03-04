import scala.annotation.tailrec

object DigitalRoot extends App{
//  Digital root is the recursive sum of all the digits in a number.
//
//    Given n
//  , take the sum of the digits of n
//.If that value has more than one digit
//  , continue reducing in
//  this way until a single - digit number is produced
//.The input will be a non -negative integer
//.

//  16 --> 1 + 6 = 7
//  942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
//  132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
//  493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2

  val numbers = List(1, 2, 3, 4, 5)
  val sum = numbers.reduce(_ + _)
  println(sum) // 15

  def digitalRoot(n: Int): Int =  {

    def intToArray(n:Int): List[Int] = {
      Integer.toString(n).split("").toList.map(s => Integer.parseInt(s))
    }

    var array = intToArray(n)


    var x = 0
    val arraySum = array.sum

    if(arraySum >= 10) {
      x = intToArray(array.sum).sum
      if (x >= 10) {
        x = intToArray(x).sum
        if (x >= 10) {
          x = intToArray(x).sum
          if (x >= 10) {
            x = intToArray(x).sum
          }
          if (x >= 10) {
            x = intToArray(x).sum
          }
        }
      }
    } else {
      x = array.sum
    }

    return x
  }//function


  println(List("4", "4"))

  //SOLVED but could be cleaner
  // better method on codewars

  @tailrec
  def digitalRoot2(n: Int): Int = {
    if (n < 10) return n

    val sumDigits = n.toString.map(_.asDigit).sum
    digitalRoot2(sumDigits)
  }


  println(digitalRoot2(38429174))
  println(digitalRoot(38429174))

}
