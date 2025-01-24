class Vehicle{
    protected String vehicleModel, RNo;
    protected double VSpeed, FCapacity, FConsumption;

    Vehicle(String vehicleModel, String RNo, double VSpeed, double FCapacity, double FConsumption){
        this.vehicleModel = vehicleModel;
        this.RNo = RNo;
        this.VSpeed = VSpeed;
        this.FCapacity = FCapacity;
        this.FConsumption = FConsumption;
    }

    //setter methods
    public void setVehicleModel(String vehicleModel){
        this.vehicleModel = vehicleModel;
    }
    public void setRNO(String RNo){
        this.RNo = RNo;
    }
    public void setVSpeed(double VSpeed){
        this.VSpeed = VSpeed;
    }
    public void setFCapacity(double FCapacity){
        this.FCapacity = FCapacity;
    }
    public void setFConsumption(double FConsumption){
        this.FConsumption = FConsumption;
    }

    //getter methods
    public String getVehicleModel(){
        return vehicleModel;
    }
    public String getRNO(){
        return RNo;
    }
    public double getVSpeed(){
        return VSpeed;
    }
    public double getFCapacity(){
        return FCapacity;
    }
    public double getFConsumption(){
        return FConsumption;
    }

    //fule needed
    protected double fuelNeeded(double distanceCover){
        return (distanceCover/FConsumption);
    }

    protected double distanceCovered(double time){
        return time * VSpeed;
    }

    public void display(){
        System.out.println("--------------Vehicle Information------------");
        System.out.println("Vehicle Model: "+vehicleModel);
        System.out.println("Registrattion No.: "+RNo);
        System.out.println("Vehicle Speed: "+VSpeed);
        System.out.println("Fule Capacity: "+FCapacity);
        System.out.println("Fule Consumption: "+FConsumption);
        System.out.println("---------------------------------------------");

    }
}

class Truck extends Vehicle{
    private double cargoWeightLimit;

    public Truck(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption, double cargoWeightLimit) {
        super(model, registrationNumber, speed, fuelCapacity, fuelConsumption);
        this.cargoWeightLimit = cargoWeightLimit;
    }

    public double getCargoWeightLimit(){
        return cargoWeightLimit;
    }

    public void setCargoWeightLimit(double cargoWeightLimit){
        this.cargoWeightLimit = cargoWeightLimit;
    }

    public void display(){
        super.display();
        System.out.println("Cargo Weight Limit: " + cargoWeightLimit + " kg");
    }
    
}

class Bus extends Vehicle {
    private int numberOfPassengers;

    // Parameterized constructor
    public Bus(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption, int numberOfPassengers) {
        super(model, registrationNumber, speed, fuelCapacity, fuelConsumption);
        this.numberOfPassengers = numberOfPassengers;
    }

    // Getter and Setter for number of passengers
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    // Overriding display method
    public void display() {
        super.display();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
}

// Driver Class: Transport
public class Transport {
    public static void main(String[] args) {
        // Create an instance of Truck
        Truck truck = new Truck("TruckModel-X", "TRK1234", 80, 300, 5, 15000);

        // Create an instance of Bus
        Bus bus = new Bus("BusModel-Y", "BUS5678", 60, 200, 10, 50);

        // Display details of Truck
        System.out.println("Truck Details:");
        truck.display();
        System.out.println("Fuel Needed for 100 km: " + truck.fuelNeeded(100) + " liters");
        System.out.println("Distance Covered in 5 hours: " + truck.distanceCovered(5) + " km");
        System.out.println();

        // Display details of Bus
        System.out.println("Bus Details:");
        bus.display();
        System.out.println("Fuel Needed for 100 km: " + bus.fuelNeeded(100) + " liters");
        System.out.println("Distance Covered in 5 hours: " + bus.distanceCovered(5) + " km");
    }
}