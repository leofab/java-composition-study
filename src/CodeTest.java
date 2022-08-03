public class CodeTest {

  public static void main(String[] args) {

  //inheritance : is used to implement the "is-a" relationship
  //composition : is used to implement the "has-a" relationship

  Point center = new Point(5,5);
  Circle c = new Circle(center,10);

  System.out.println(c.CalculateArea());
  }

}
