package tests

import org.scalatest._
import lecture.FirstObject

class UnitTesting extends FunSuite{
  test("Use many test cases for each category"){
    val big: Double = 40.0
    val upper: Double = 31.0
    val middle: Double = 30.0
    val lower: Double = 29.0
    val small: Double = 10.0

    assert(FirstObject.computeShippingCost(big) == 7.5, big)
    assert(FirstObject.computeShippingCost(upper) == 5.25, upper)
    assert(FirstObject.computeShippingCost(middle) == 5.0, middle)
    assert(FirstObject.computeShippingCost(lower) == 5.0, lower)
    assert(FirstObject.computeShippingCost(small) == 5.0, small)
  }
}