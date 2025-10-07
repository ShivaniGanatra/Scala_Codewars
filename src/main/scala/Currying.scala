object Currying extends App{
  //https: //www.youtube.com/watch?v=YEudoVTR02o

    def add2 (x:Int) = (y:Int) => x + y
    println(add2(3)(4)) //7

    val aSequence : Array[Int] = Array(1,2,3,4)

  println(aSequence.map(_ + 1)) // List(2, 3, 4)

    def multiplyAll(x : Array[Int]) = (y:Int) => x.map(x => x * y).mkString("Array(", ", ", ")")

    println(multiplyAll(Array(1, 2, 3,4,3,4,55))(4))
}
