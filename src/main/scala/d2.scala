package day2


class Day2 {
    def isAllIncrease(arr: Array[Int]): Boolean =
        return arr.sliding(2).forall {
            case Array(x, y) => x < y
        }

    def isAllDecrease(arr: Array[Int]): Boolean =
        return arr.sliding(2).forall {
            case Array(x, y) => x > y
        }

    def isDiffInCondition(arr: Array[Int]): Boolean =
        return arr.sliding(2).forall {
            case Array(x, y) => {
                math.abs(x - y) match
                case 1 => true
                case 2 => true
                case 3 => true
                case _ => false
            }
            
        }

    def isSafe(report: Array[Int]): Boolean =
        val isDiff: Boolean = isDiffInCondition(report)
        val isIncrease: Boolean = isAllIncrease(report)
        val isDecrease: Boolean = isAllDecrease(report)

        if isDiff && isIncrease then return true 
        else if isDiff && isDecrease then return true
        else return false

    def getDataFromFile(): Seq[String] = 
        val file_path: os.Path = os.pwd / "inputs"/ "d2" / "input.txt"
        val lines: Seq[String] = os.read.lines(file_path)
        return lines

    def day2(lines: Seq[String] = getDataFromFile()): Int =
        
        val reports: Seq[Array[Int]] = lines.map(x => x.split(" ").map(y => y.toInt))

        val countSafe: Int = reports.map(x => isSafe(x)).count(_ == true)

        reports.foreach(x => println(x.mkString(" ")))

        return countSafe

}