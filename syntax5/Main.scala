object Main{
  def main(args: Array[String]): Unit = {
    // 共変 これはエラー
    // val arr: Array[Any] = new Array[String](1)

    // 反変
    // val x1: AnyRef => AnyRef = (x: String) => (x:AnyRef)
    val x1: String => AnyRef = (x: String) => x

    val pair = new ShowablePair(new ShowImple("A"), new ShowImple("B"))
    println(pair.show)

    val low: Low = new High()
    val middle: Middle = new High()
    val high: High = new High()

    val stack = new NonEmptyStack[Middle](middle, null)
    val pushedStack = stack.push(high).push(low)

    println(pushedStack.pop.top.low)
    println(pushedStack.pop.top.low)
  }
}

abstract class Show {
  def show: String
}

class ShowImple(val value: String) extends Show {
  override def show: String = value
}

class ShowablePair[A <: Show, B <: Show](val a: A, val b: B) extends Show {
  override def show: String = "(" + a.show + "," + b.show + ")"
}

abstract class Stack[+A]{
  def push[E >: A](element: E): Stack[E]
  def top: A
  def pop: Stack[A]
}

class NonEmptyStack[+A](private val first: A, private val rest: Stack[A]) extends Stack[A] {
  def push[E >: A](e: E): Stack[E] = new NonEmptyStack[E](e, this)
  def pop: Stack[A] = rest
  def top: A = first
}

abstract class Low {
  def low: String
}

abstract class Middle extends Low {
  def middle: String
}

class High extends Middle {
  override def low: String = "low"

  override def middle: String = "middle"
}