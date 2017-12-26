trait Shape {
  def name(): String
}
//////////////
case class Circle() extends Shape {
  override def name(): String = "circle"
}

case class Rectangle() extends Shape {
  override def name(): String = "rectangle"
}
///////////////
def draw(shape: Shape): Unit = {
  println(shape.name())
}
def get(shape: Shape): Shape = shape
//////////////
draw(new Circle)
draw(new Rectangle)

get(new Circle)
get(new Rectangle)



