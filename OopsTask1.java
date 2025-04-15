// Creating Car Class
class Car {
    String brand;
    int year;
    double price;

    // Constructor for Car
    Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    //Showing the car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("\n");
    }
}
public class OopsTask1 {
    public static void main(String[] args) {
        //objects for Car class
        Car car1 = new Car("Toyota", 2020, 200000.0);
        Car car2 = new Car("Honda", 2022, 250000.0);

        car1.displayDetails();
        car2.displayDetails();
    }
}