
/* A data constructor declaration gives us a function to construct that form of the data type. Here are a few
examples */

/* The case Nil lets us write List.Nil to construct an empty List */

val ex1: List[Double] = List.Nil


val ex2: List[Int] = List.Cons(1, Nil)

/* case Cons lets us write the following to allow us to build singly linked lists of arbitrary lengths. */

val ex3: List[String] = List.Cons("a", List.Cons("a", List.Cons("b", List.Nil)))