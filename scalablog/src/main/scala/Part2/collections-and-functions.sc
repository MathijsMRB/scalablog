val list = List("frodo", "samwise", "pippin")
list.foreach(hobbit => println(hobbit))

val hobbits = Set("frodo", "samwise", "pippin")
hobbits.foreach(hobbit => println(hobbit))

val hobbits2 = Map("frodo" -> "hobbit", "samwise" -> "hobbit", "pippin" -> "hobbit")
hobbits2.foreach(hobbit => println(hobbit))
hobbits2.foreach(hobbit => println(hobbit._1))
hobbits2.foreach(hobbit => println(hobbit._2))

list
list.isEmpty
Nil.isEmpty
list.length
list.size
list.head
list.tail
list.last
list.init
list.reverse
list.drop(1)
list
list.drop(2)

val words = List("peg", "al", "bud", "kelly")
words.count(word => word.length > 2)
words.filter(word => word.length > 2)
words.map(word => word.length)
words.forall(word => word.length > 1)
words.exists(word => word.length > 4)
words.exists(word => word.length > 5)
words.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)
words.sortWith((s, t) => s.length < t.length)
