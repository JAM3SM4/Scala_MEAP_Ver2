// A comment
/* Another comment */
/** A documentation comment */
// Object name is MyProgram
// The MyProgram has 3 methods; abs, formatAbs, printAbs
object MyProgram:

  // The abs method is a pure function that takes an integer and returns its absolute value.
  // abs is the name of the method followed by the parameter list.
  // abs only takes one argument, n of type Int. the : (has type) Int indicates the type of the result is Int.
  def abs(n: Int): Int =
    if n <0 then -n
    else n
  // This method is declared private which means it cant be called from any code outside of the MyProgram object. This
  // function takes an Int an returns a string, but NOTE the return type is not declared.
  private def formatAbs(x: Int) =
    // Here we are calling the format method on the msg object passing the value of abs applied to x, this results in a
    // new string with the occurrences of %d in msg replaced with the evaluated results of x and abs(x) respectively.
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))

  // Main entry point of the program. It takes no arguements amd its return type is Unit.
  @main def printAbs: Unit =
    println(formatAbs(-42))

// This is simple program outputs the absolute value
// Absolute value by definition is the magnitude of a real number without regard to its sign