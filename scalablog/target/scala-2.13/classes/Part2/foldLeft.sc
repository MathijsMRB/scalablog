val list = List(1, 2, 3)
val sum = list.foldLeft(0)(_+_) // different way of saying list.sum
val sum2 = list.foldLeft(0)((sum, value) => sum + value) // same as above
