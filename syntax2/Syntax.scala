object Syntax {
  def main(args: Array[String]): Unit = {
    val adder = new Adder()
    println(adder.add(2)(3))
    println(adder.add(2) _)

    val fun = adder.add(2) _
    println(fun(3))

    val a: APrinter = new APrinter()
    val b: APrinter = new BPrinter()

    a.print()
    b.print()
  }
}

class Adder {
  def add(x: Int)(y: Int) = x + y
}

class APrinter() {
  def print(): Unit = {
    println("A")
  }
}

class BPrinter() extends APrinter {
  override def print(): Unit = {
    println("B")
  }
}