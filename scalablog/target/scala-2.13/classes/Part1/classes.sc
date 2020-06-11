class Person(firstName: String, lastName: String)

val gump = new Person("Forrest", "Gump")

class Compass {

  val directions = List("north", "east", "south", "west")
  var bearing = 0
  print("Initial bearing: ")
  println(direction())

  def direction() = directions(bearing)

  def inform(turnDirection: String): Unit = {
    println("Turning " + turnDirection + ". Now bearing " + direction)
  }

  def turnRight(): Unit = {
    bearing = (bearing + 1) % directions.size
    inform("right")
  }

  def turnLeft(): Unit = {
    bearing = (bearing + (directions.size - 1)) % directions.size
    inform("left")
  }
}

val myCompass = new Compass

myCompass.turnRight()
myCompass.turnRight()

myCompass.turnLeft()
myCompass.turnLeft()
myCompass.turnLeft()

class Person1(firs_name: String) {
  println("Outer constructor")

  def this(first_name: String, last_name: String) {
    this(first_name)
    println("Inner constructor")
  }

  def talk(): Unit = println("Hi")
}

val bob = new Person1("Bob")
val bobTate = new Person1("Bob", "Tate")

object TrueRing {
  def rule(): Unit = println("To rule them all")
}

TrueRing.rule()

class Person2(val name: String) {
  def talk(message: String): Unit = println(name + " says " + message)
  def id(): String = name
}

class Employee(override val name: String,
               val number: Int) extends Person2(name) {
  override def talk(message: String): Unit = {
    println(name + " with number " + number + " says " + message)
  }
  override def id(): String = number.toString
}

val employee = new Employee("Yoda", 4)
employee.talk("Extend or extend not. There is no try.")

class Person3(val name: String)

trait Nice {
  def greet(): Unit = println("Howdily doodily.")
}

class Character(override val name: String) extends Person3(name) with Nice

val flanders = new Character("Ned")
flanders.greet()

