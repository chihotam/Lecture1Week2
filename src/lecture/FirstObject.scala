package lecture

object FirstObject {
  def computeShippingCost(input: Double): Double = {
    if (input <= 30.0) {
      5.0
    }
    else {
      5.0 + (0.25 * (input - 30.0))
    }
  }
}