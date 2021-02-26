package vehicles;

public class Car extends Vehicle {

  int passengers;

  public Car(String name, int fuelCapacity, int milesPerGallon, int passengers) {
    super(name, fuelCapacity, milesPerGallon);
    this.passengers = passengers;
  }

  public int getPassengers() {
    return passengers;
  }

  public void printName() {
    System.out.println("Car : " + name);
  }
}
