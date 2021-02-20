class Point (val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }

  override def toString: String = "(" + x + ", " + y + ")"
}

object Main {
  def main(args: Array[String]): Unit = {
    val a = new Point(1, 2)
    val b = new Point(3, 4)

    println(a + b)
  }
}