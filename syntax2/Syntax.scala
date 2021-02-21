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

    val p = new Point3D(10, 20, 30)
    println(p.x)
    println(p.y)
    println(p.z)

    val rectangle: Shape = new Rectangle(10.0, 20.0)
    println(rectangle.area)

    val circle: Shape = new Circle(2.0)
    println(circle.area)
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

class Point3D(val x: Int, val y: Int, val z: Int)

abstract class Shape {
  def area: Double
}

class Rectangle(val w: Double, val h: Double) extends Shape {
  override def area: Double = {
    w * h
  }
}

class Circle(val r: Double) extends Shape {
  override def area: Double = {
    r * r * math.Pi
  }
}