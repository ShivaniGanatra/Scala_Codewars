object OddOrEven extends App{

  //needs to add numbers
  //then needs to see if divisible by 2
  def oddOrEven(xs: Seq[Int]): String = {
    if (xs.sum % 2 == 1) "odd"
    else "even"
  }
  println(oddOrEven(Seq(0)))
}
