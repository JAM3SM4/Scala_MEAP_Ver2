
def apply[A](as: A*): List[A] =
  if as.isEmpty then Nil
  else Cons(as.head, apply(as.tail*))

