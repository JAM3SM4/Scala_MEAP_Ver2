object ex_pattern_matching {
List(1,2,3) match { case _ => 42}

// results in 42. Using a variable pattern,_, which matches any expression. We could say x or 
// foo instead of _, but _indicates a variable whose value we ignore in the result of the case

List(1,2,3) match {case Cons(h, _) => h }

// Results in 1. Here we are using a data constructor pattern in conjunction with variables to capture 
// or bind a subexpression of the target

List(1,2,3) match {case Cons(_, t) => t }

// results in List(2,3)

List(1,2,3) match { case Ni => 42 } 

// results in a MatchError at runtime. A MatchError indicates that noe of the cases in a match expression
// match the target.

}
