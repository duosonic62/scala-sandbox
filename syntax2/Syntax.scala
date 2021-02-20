object Syntax {
  def main(args: Array[String]): Unit = {
    val adder = new Adder()
    println(adder.add(2)(3))
    println(adder.add(2) _)

    val fun = adder.add(2) _
    println(fun(3))
  }
}

class Adder {
  def add(x: Int)(y: Int) = x + y
}