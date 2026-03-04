import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Reverse extends App{
// Get rid of 0s at the end
//  1450 -> 145
//  960000 -> 96
//  1050 -> 105
//  -1050 -> -105
//  0 -> 0
  def noBoringZeroes(n: Int): Int = {

    var thing = n
    if (thing == 0) {
      thing = 0
    } else {
      while (thing % 10 == 0) {
        thing = thing / 10
      }
    }
    thing
  }
  println(noBoringZeroes(-1000))

//  Americans are odd people: in their buildings, the first floor is actually the ground floor and there is no 13th floor (due to superstition).
//
//    Write a function that given a floor in the american system returns the floor in the european system.
//
//  With the 1st floor being replaced by the ground floor and the 13th floor being removed, the numbers move down to take their place. In case of above 13, they move down by two because there are two omitted numbers below them.
//
//    Basements (negatives) stay the same as the universal level.
//
//  More information here

  def getRealFloor(n: Int): Int = {
    if(n == 1 || n == 0) {
      return 0
    } else if (n > 13) {
      return n - 2
    } else if (n < 0) {
      return n
    }else {
      return n - 1
    }
  }
  println(getRealFloor(13))

  val text = "Programming"
  val target = 'g'

  val count = text.chars.filter((ch: Int) => ch == target).count

  System.out.println("Occurrences of '" + target + "': " + count)

  };
