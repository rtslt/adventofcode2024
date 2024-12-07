import scala.io.StdIn
import day1.Day1
import day2.Day2

@main def hello(): Unit =
  print("Enter day: ")
  val day: Int = StdIn.readInt()

  day match
  case 1 => println(Day1().day1())
  case 2 => println(Day2().day2())
  case _ => println("Not implemented yet.")