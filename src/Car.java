public class Car extends Vehicle {

  // Car has-an Engine
  Engine eng;

  // Car is-a Vehicle
  public Car(int modelYear, String companyName, Engine eng){
    super(modelYear,companyName);
    this.eng = eng;
  }

  public void StarCar(){
    System.out.println("Car Started");
  }
}
