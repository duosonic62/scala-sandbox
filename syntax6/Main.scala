object Main {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int] (1, 2, 3, 4, 5)
    swapArray(arr)(2,4)
    for (elem <- arr) {
      println("Array: " + elem)
    }

    // 要素一つ + 空リスト(nil)でリストを生成
    val list = 1 :: Nil
    val list2 = List(2, 3) ++ list
    list2.foreach(f => println("list: " + f))
    println(list2.mkString(","))


  }

  def swapArray[T] (arr: Array[T]) (i: Int, j: Int): Unit = {
    val tmp = arr(i)
    arr(i) = arr(j)
    arr(j) = tmp
  }
}