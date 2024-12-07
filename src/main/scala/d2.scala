package day2


class Day2 {
    def isIncrease(x: Int, y: Int): Boolean = return x < y

    def isDecrease(x: Int, y: Int): Boolean = return x > y

    def isDiffInCondition(x: Int, y: Int): Boolean =
        return math.abs(x - y) match
            case 1 => true
            case 2 => true
            case 3 => true
            case _ => false

    def isSafe(report: Array[Int]): Boolean =
        val a = report
        .sliding(2)
        .map {
            case Array(x, y) => Array(
                isIncrease(x, y), 
                isDecrease(x, y), 
                isDiffInCondition(x, y)
            )
        }
        .reduce((x, y) => Array(x(0) & y(0), x(1) & y(1), x(2) & y(2)))
        .toList

        val _isIncrease: Boolean = a(0)
        val _isDecrease: Boolean = a(1)
        val _isDiff: Boolean = a(2)

        if _isDiff && _isIncrease then return true 
        else if _isDiff && _isDecrease then return true
        else return false


    def getDataFromFile(): Seq[String] = 
        val file_path: os.Path = os.pwd / "inputs"/ "d2" / "input.txt"
        val lines: Seq[String] = os.read.lines(file_path)
        return lines

    def day2(lines: Seq[String] = getDataFromFile()): Int =
        
        val reports: Seq[Array[Int]] = lines.map(x => x.split(" ").map(y => y.toInt))

        val countSafe: Int = reports.map(x => isSafe(x)).count(_ == true)

        // reports.foreach(x => println(x.mkString(" ")))

        return countSafe

}