import scala.collection.mutable
// ----------- Lists ----------- //

List(1, 2, 3)
List("one", "two", "three")
List("one", "two", 3)
List("one", "two", 3)(2)
//List("one", "two", 3)(4)  -- will throw an exception
//List("one", "two", 3)(-1) -- will throw an exception, older versions return the first element
Nil // empty list

// ----------- Sets ----------- //

val animals = Set("lions", "tigers", "bears")
animals + "armadillos" // Add to set
animals - "tigers" // Remove from set

animals ++ Set("armadillos", "raccoons") // Union
animals.union(Set("armadillos", "raccoons")) // Union

animals -- Set("lions", "bears") // Difference
animals -- Set("lions", "bears") // Difference

animals.intersect(Set("armadillos", "raccoons", "lions", "tigers")) // Intersection

Set(1, 2, 3) == Set(3, 2, 1) // true because a Set is independent of order
List(1, 2, 3) == List(3, 2, 1) // false because a List is dependent of order

// ----------- Maps ----------- //

val ordinals = Map(0 -> "zero", 1 -> "one", 2 -> "two")
ordinals(2)

val map = new mutable.HashMap[Int, String]
map += 4 -> "four"
map += 8 -> "eight"
map
// map += "zero" -> 0 -- results in type error

