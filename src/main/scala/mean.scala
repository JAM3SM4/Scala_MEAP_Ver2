object mean {

  // the mean function is an example of whats called a partial function: its not
  // defined for some inputs. a function is typically partial because
  // it makes some assumptions about its inputs that arent implied by the input types


  def mean(xs: Seq[Double]): Double =
    if xs.isEmpty then
      throw new ArithmeticException("Mean of empty list")
    else xs.sum / xs.length
}
