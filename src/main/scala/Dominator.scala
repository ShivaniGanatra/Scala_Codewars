import scala.collection.mutable

//What dominates your array?

//Instructions
//Output
//A zero-indexed array arr consisting of n integers is given. The dominator of array arr is the value that occurs in more than half of the elements of arr.
//  For example, consider array arr such that arr = [3,4,3,2,3,1,3,3]
//The dominator of arr is 3 because it occurs in 5 out of 8 elements of arr and 5 is more than a half of 8.
//Write a function dominator(arr) that, given a zero-indexed array arr consisting of n integers, returns the dominator of arr. The function should return −1 if array does not have a dominator. All values in arr will be >=0.
//


object Dominator extends App{
  def dominator(xs: Seq[Int]): Int = {


    var middleNumber = 0
    if (xs.length % 2 == 0) {
      middleNumber = xs.length / 2
    } else {
      middleNumber = (xs.length - 1) / 2
    }

    println("middle number = " + middleNumber)

    var result = -1

    val mutableHashSet: mutable.HashSet[Int] = mutable.HashSet(xs: _*)
    val list = mutableHashSet.toSeq
    println("list = " + list)
    println(list.length)

    for (thing <- list)  {
      println("count of int in sequence = " + xs.count(_ == thing))
      println("thing = " + thing)
      println("thing in sequence "+xs.count(_ == thing))
      println("thing "+ thing + " is in sequence"+xs + xs.count(_ == thing) +" many times")

      if (xs.count(_ == thing) > middleNumber) {
        result = thing
      }


    }

    result



  }

  print(dominator(Seq(3,4,3,2,3,1,3,3)))

}