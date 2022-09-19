/*
  enum is a data type that consists of a series of data constructors, each defined by the case keyword
  Scala enumerations are similar to enumerations from Java or C but instead of being limited to a set of
  values(eg, red, green or blue). Scala can have data constructors that take arbitrary arguments
  Definition Arbitrary argument is defined as "These are used when you do not know the number of
  arguments you need to pass beforehand and work well when you need to keep the code as versatile as possible."
*/

enum List[+A]:

/* by declaring +A we have declare the list type to be polymorphic therefore we can use the this same definition for a
list of Int elements; i.e List[Int], List[String], List[Double] and so on. The + indicates that the type parameter
A is covariant
*/

/* Dictionary; a function of the coefficients and variables of a given function which is invariant under a linear
transformation except for a factor equal to a power of the determinant of the transformation.
*/

/*
  The List enumeration has two such data constructors, which represent the two possible forms a list can take. A
  list can be empty, denoted by the data constructor 'Nil' or it can be nonempty, denoted by a data constructor
  Cons(construct). A nonempty list consists of an initial element, head, followed by a list (possibly of empty)
  of remaining elements (the tail):
*/
    case Nil
    case Cons(head: A, tail: List[A])
// Dictionary: Polymorphic; occurring in several different forms, in particular with reference to species or genetic
// variation

// Note List is parameterized on a type A, these are polymorphic functions that can be instantiated with different types
// for A.


object List: // a list data constructor representing the empty list.
    def sum(ints: List[Int]): Int = ints match // another data constructor representing nonempty lists. nb. tail is another
      // List[A], which maybe nil or another Cons. As you might expect the sum function states the sum of the empty
      // list is 0, and the sum of the nonempty list is the first element.
      case Nil => 0
      // the sum function states that the sum of the empty list equals zero. This is a recursive function
      case Cons(x, xs) => x + sum(xs) // List companion object. Contains functions for creating and working with lists.
      // Pattern matching works like a switch statement that may descent into the structure of the expression it
      // examines and extract subexpressions of that structure.
    def product(ds: List[Double]): Double = ds match // function that uses pattern matching to add up a list of integers
     // Its introduced with an expression(target or scrutinee) like ds, followed by the keyword match and a sequence
     // of cases
     // these are the cases where if the target matches the pattern in a case the result of that case becomes the result
     // of the entire match expression. If multiple patterns match the target, Scala chooses the first mathing case.
      case  Nil => 1.0
      case Cons(0.0,_) => 0.0 // the sum of a list starting with x is x plus the sum of the rest of the list.
      case Cons(x, xs) => x * product(xs)
    def apply[A](as: A*):List[A] =
      if as.isEmpty then Nil
      else Cons(as.head, apply(as.tail*))

/* References : */