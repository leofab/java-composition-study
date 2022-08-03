public class Circle implements Shape {

  Point point; // composition
  double r;

  public Circle(Point point, double r) {
    this.point = point;
    this.r = r;
  }

  // return Area of circle
  public double CalculateArea() {
    return Math.PI * r * r;
  }

  @Override
  public double CalculatePerimeter() {
    return 2 * Math.PI * r;
  }
}


