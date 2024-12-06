package day1

class Day1 {
    def day1(): Int =
        val file_path: os.Path = os.pwd / "inputs"/ "d1" / "input.txt"

        val lines: Seq[String] = os.read.lines(file_path)
        val a:Seq[Array[Int]] = lines.map(x => x.replace("   ", " ")).map(x => x.split(" ").map(y => y.toInt))

        val l: Seq[Int] = a.map(x => x.take(1)).flatten.sorted
        val r: Seq[Int] = a.map(x => x.drop(1)).flatten.sorted

        val ans: Int = (l zip r).map((x,y) => math.abs(x-y)).reduce((x,y) => x+y)

        return ans
}