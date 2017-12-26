
def combine(a: String, b: String): String = {
  if(a == null) b
  else if(b == null) a
  else a + b
}

def combine2(a: Option[String], b: Option[String]): Option[String] = {
  if(a == None) b
  else if(b == None) a
  else Some(a.asInstanceOf[Some[String]].value + b.asInstanceOf[Some[String]].value)
}

def combine3(a: Option[String], b: Option[String]): Option[String] = (a, b) match {
  case (None, _)          => b
  case (_, None)          => a
  case (Some(x), Some(y)) => Some(x + y)
}

val m = Map(1 -> "a", 2 -> "b")

m.get(11)
m.get(1)
//
//sealed trait Option[T]
//case class None[T]() extends Option[T]
//case class Some[T](x: T) extends Option[T]
