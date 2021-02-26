package vehicles;

public class Vehicle {

  String name;
  int fuelCapacity;
  int milesPerGallon;

  public int getFuelCapacity() {
    return fuelCapacity;
  }

  public int getMilesPerGallon() {
    return milesPerGallon;
  }

  public Vehicle(String name, int fuelCapacity, int milesPerGallon) {
    this.name = name;
    this.fuelCapacity = fuelCapacity;
    this.milesPerGallon = milesPerGallon;
  }

  public int getFullTankFuelCost(int ratePerGallon) {
    return fuelCapacity * ratePerGallon;
  }

  public String getName() {
    return name;
  }

  boolean isBetter(Vehicle otherVehicle) {
    if (this.milesPerGallon > otherVehicle.milesPerGallon) {
      return true;
    } else {
      return false;
    }
  }

  public void printName() {
    System.out.println("Vehicle : " + name);
  }
}
