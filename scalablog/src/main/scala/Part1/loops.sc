def whileLoop(): Unit = {
  var i = 1
  while (i <= 3) {
    println(i)
    i += 1
  }
}

whileLoop()

def forLoop(): Unit = {
  for(i <- 0 until "args".length) {
    println("args"(i))
  }
}

forLoop()

def foreachLoop(): Unit = {
  "args".foreach { i =>
    println(i)
  }
}

foreachLoop()