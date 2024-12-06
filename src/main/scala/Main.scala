import scala.io.StdIn
import day1.Day1

@main def hello(): Unit =
  print("Enter day: ")
  val day: Int = StdIn.readInt()

  day match
  case 1 => println(Day1().day1())
  case _ => println("Not implemented yet.")