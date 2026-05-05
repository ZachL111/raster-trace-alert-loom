object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(91, 101, 14, 17, 7)
    assert(Policy.score(signalcase_1) == 188)
    assert(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(61, 99, 22, 13, 13)
    assert(Policy.score(signalcase_2) == 164)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(106, 100, 21, 14, 4)
    assert(Policy.score(signalcase_3) == 206)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
