object Solution {

  def main(args: Array[String]) {
    draw(scala.io.StdIn.readInt(), 128, 150, 1) foreach println
  }

  def draw(n: Int, height: Int, width: Int, level: Int): List[String] = n match {
    case 0 => (1 until height).map(r => (1 to width).map(c => " ").mkString("")).toList
    case _ => draw(n-1, (height+1)/2, width, level+1) ::: fillSpace(baseTree((height+1)/2), level, (height+1)/2, width)
  }

  def fillSpace(tree: List[String], level: Int, height: Int, width: Int): List[String] = level match {
    case 1 => tree.map(s => " "*((width-s.length)/2) + s + " "*((width-s.length)/2+1))
    case _ => fillSpace( tree.map(s => s + " "*(height-1) + s), level-1, height, width)
  }

  def baseTree(height: Int): List[String] =
    (1 to height/2).map(r => (1 to height+1).map(c => if (r == c || c == height-r+2) "1" else " ").mkString("")).toList :::
      (1 to height/2).map(i => (1 to height+1).map(c => if (c == height/2+1) "1" else " ").mkString("")).toList

}