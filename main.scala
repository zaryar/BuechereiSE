class Catalogue {
  var calatogue : List[Item] = ???
}

trait Person {
  var firstName : String
  var lastName : String
  var id : String

  def browse() : List[Item]
}

class Member extends Person{
  var firstName : String = ???
  var lastName : String = ???
  var id : String = ???

  var borrowedItemIDs : List[String] = ???

  override def browse() : List[Item] = {
    ???
  }
  def howManyItems() : Int = {
    ???
  }
  def myItems() : List[Item] = {
    ???
  }
  def searchByTitle(title : String) : Book = {
    ???
  }
  def isAvailable(title : String) : Boolean = {
    ???
  }
  def whenAvailable(title : String) : Int = { // Days left (in integer) until one is available
    ???
  }
  def overdueInAWeek() : List[Item] = {
    ???
  }
  def borrow(id : String) : Unit = {
    ???
  }
}

class Librarian extends Person{
  var firstName : String = ???
  var lastName : String = ???
  var id : String = ???

  override def browse() : List[Item] = {
    ???
  }
    
  def add(item : Item) : Unit = {
    ???
  }
  def remove(item : Item) : Unit = {
    ???
  }
  def update(id : String, item : Item) : Unit = {
    ???
  }
}

trait Item {
  var id : Int
  var title : String
  var isBorrowed : Boolean
  var borrowedInDays : Int
}

class Book extends Item{
  var id : Int = ???
  var title : String = ???
  var isBorrowed : Boolean = ???
  var borrowedInDays : Int = ???

  var summary : String = ???
  var content : String = ???
}



// Implement Main-Programm here:
@main
def main() = {
  // ???
}