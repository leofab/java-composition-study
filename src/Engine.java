public class Engine {
  int productionYear;
  String manufactureCompany;

  public Engine(int productionYear, String manufactureCompany) {
    this.productionYear = productionYear;
    this.manufactureCompany = manufactureCompany;
  }

  public int SetMaxRotationSpeed(){ return 1000; }
}
