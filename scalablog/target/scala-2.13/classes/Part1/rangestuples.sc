val range1 = 0 until 10
range1.start
range1.end
range1.step
(0 to 10) by 5
(0 to 10) by 6
(0 until 10 by 5)

val range2 = (10 until 0) by -1
val range3 = (10 until 0)
val range4 = (0 to 10)

val range5 = 'a' to 'e'

val person = ("Elvis", "Presley")
person._1
person._2
//person._3 -- this will generate an error

val (x, y) = (1, 2)

//val (a, b) = (1, 2, 3) -- this will generate an error