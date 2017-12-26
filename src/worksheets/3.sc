def combine3(a: Option[String], b: Option[String]): Option[String] = (a, b) match {
  case (None, _)          => b
  case (Some(x), Some(y)) => Some(x + y)
}

