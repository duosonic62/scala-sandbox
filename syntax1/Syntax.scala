object Syntax {
  def main(args: Array[String]): Unit = {
    println(foo())

    var age = 17
    if (age > 18) {
      println("成年です")
    } else {
      println("未成年です")

    }

    age = 18
    if (age >= 18) {
      println("成年です")
    } else {
      println("未成年です")
    }
  }

  def foo(): String = {
    "foo" + "foo"
  }
}