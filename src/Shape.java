public interface Shape {

  // Code Sharing ins't useful in this case, because each class implements its own behavior
  // so we interfaces Shape as an Interface, and @Override its methods (w/o body methods)

  public double CalculateArea();
  public double CalculatePerimeter();

}
