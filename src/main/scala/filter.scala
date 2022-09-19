object filter {
  val dept: String =
    lookupByName("Joe").
    map(_.department).
    filter(_ != "Accounting").
    getOrElse("Default Dept")
}
