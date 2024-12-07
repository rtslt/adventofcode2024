// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  test("example test that succeeds") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }
}

class TestDay2 extends munit.FunSuite {
  import day2.Day2
  
  test("all increase") {
    var obtained = true
    var expected = true
    obtained = Day2().isAllIncrease(Array(7,6,4,2,1))
    expected = false
    assertEquals(obtained, expected, "Should be false")

    obtained = Day2().isAllIncrease(Array(1,2,7,8,9))
    expected = true
    assertEquals(obtained, expected, "Should be true")

    obtained = Day2().isAllIncrease(Array(1,2,7,5,9))
    expected = false
    assertEquals(obtained, expected, "Should be false")

    obtained = Day2().isAllIncrease(Array(1,2,2,5,9))
    expected = false
    assertEquals(obtained, expected, "Should be false")
  }

  test("all decrease") {
    var obtained = true
    var expected = true
    obtained = Day2().isAllDecrease(Array(7,6,4,2,1))
    expected = true
    assertEquals(obtained, expected, "Should be true")

    obtained = Day2().isAllDecrease(Array(7,6,2,2,1))
    expected = false
    assertEquals(obtained, expected, "Should be false")

    obtained = Day2().isAllDecrease(Array(1,2,7,8,9))
    expected = false
    assertEquals(obtained, expected, "Should be false")

    obtained = Day2().isAllDecrease(Array(1,2,7,5,9))
    expected = false
    assertEquals(obtained, expected, "Should be false")
  }

  test("all diff in conditions") {
    var obtained = true
    var expected = true
    obtained = Day2().isDiffInCondition(Array(7,6,4,2,1))
    expected = true
    assertEquals(obtained, expected, "Should be true")

    obtained = Day2().isDiffInCondition(Array(1,2,7,8,9))
    expected = false
    assertEquals(obtained, expected, "Should be false")

    obtained = Day2().isDiffInCondition(Array(9,7,6,2,1))
    expected = false
    assertEquals(obtained, expected, "Should be false")

    obtained = Day2().isDiffInCondition(Array(1,3,2,4,5))
    expected = true
    assertEquals(obtained, expected, "Should be true")

    obtained = Day2().isDiffInCondition(Array(8,6,4,4,1))
    expected = false
    assertEquals(obtained, expected, "Should be false")

    obtained = Day2().isDiffInCondition(Array(1,3,6,7,9))
    expected = true
    assertEquals(obtained, expected, "Should be true")

    obtained = Day2().isDiffInCondition(Array(7,6,4,2,2))
    expected = false
    assertEquals(obtained, expected, "Should be false")
  }

  test("d2-1") {
    val obtained = Day2().isSafe(Array(7,6,4,2,1))
    val expected = true
    assertEquals(obtained, expected)
  }

  test("d2-2") {
    val obtained = Day2().isSafe(Array(1,2,7,8,9))
    val expected = false
    assertEquals(obtained, expected)
  }

  test("d2-3") {
    val obtained = Day2().isSafe(Array(9,7,6,2,1))
    val expected = false
    assertEquals(obtained, expected)
  }

  test("d2-4") {
    val obtained = Day2().isSafe(Array(1,3,2,4,5))
    val expected = false
    assertEquals(obtained, expected)
  }

  test("d2-5") {
    val obtained = Day2().isSafe(Array(8,6,4,4,1))
    val expected = false
    assertEquals(obtained, expected)
  }

  test("d2-6") {
    val obtained = Day2().isSafe(Array(1,3,6,7,9))
    val expected = true
    assertEquals(obtained, expected)
  }
}
