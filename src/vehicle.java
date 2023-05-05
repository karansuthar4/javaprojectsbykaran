public class vehicle {
    protected String vehicleType;

    public vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void display() {
        System.out.println("Vehicle type: " + vehicleType);
    }
}

class Car extends vehicle {
    private String modelType;
    private String companyName;

    public Car(String vehicleType, String modelType, String companyName) {
        super(vehicleType);
        this.modelType = modelType;
        this.companyName = companyName;
    }

    public void display() {
        super.display();
        System.out.println("Model type: " + modelType);
        System.out.println("Company name: " + companyName);
    }


public static void main(String[] args) {
    Car car = new Car("sedan", "Accord", "Honda");
    car.display();
    }
}
