import scala.io.StdIn.readLine

trait Messages {
  val welcome: String
  def greeting(os: String, jdk: String): String
}

object EN extends Messages {
  val welcome = "Hey, what's your name?! (please press <ENTER> after entering your name)"
  def greeting(os: String, jdk: String) = ???
}

@main
def sayhello = {
  println(EN.welcome)

  val name = readLine()

  val greeting = s"Hello there, ${name}."
  println(greeting)

  if (name != osUserName) {
    val snarkyGreeting =
      s"""Dear ${name} -- or should I say 'Dear ${osUserName}'?!
         |
         |Are you lying to me, or are you lying to your operating system?
         |""".stripMargin
    println(snarkyGreeting)
  }

  val systemInfo =
    s"""Seems like you have all dependencies set up correctly.
      |Apparently, this application is running on ${os} with JDK ${jdkVersion}.
      |""".stripMargin

  println(systemInfo)
}


def jdkVersion = System.getProperty("java.version")

def os = System.getProperty("os.name")

def osUserName = System.getProperty("user.name")
