object Bonus extends App {

  def bonusTime(salary: Int, bonus: Boolean): String = {
    if(bonus) {
      return "£" + (salary*10)
    }
    "£" + salary

  }


  println(bonusTime(100,true))





}
