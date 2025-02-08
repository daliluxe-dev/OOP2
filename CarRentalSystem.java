package carrentalsystem;
import java.util.Scanner;

class Car{
    String model;
    double price;
    
    //constructor used to store the values to objects
    Car(String model, double price){
        this.model=model;
        this.price=price;
    }
    
    //method used to display the rented car information
    void CarRental(){
        System.out.println("Car: " +model);
        System.out.println("Price: " +price);
    }
}

class Customer{
    String customerName;
    double customerID;
    
    //constructor used to store the values to objects
    Customer( String customerName, double customerID){
        this.customerName=customerName;
        this.customerID=customerID;
    }
    
    //method used to display the renting customer informating
    void CustomerManagement(){
        System.out.println("Customer: " +customerName);
        System.out.println("National ID: " +customerID);
    }
}

class RentalAgency{
    
    //method used for calculation and displaying info from all three classes
    void RentalTransactions(Car Car, Customer Customer, int RentedDays){
        
        //calculation to calculate the total price of renting the car
        double TotalPrice= Car.price *  RentedDays;
        
        //displaying all the information
        System.out.println(" Car Rental Details ");
        Car.CarRental();   //calling the method from class Car
        Customer.CustomerManagement(); //calling the method from class Customer
        System.out.println("This car will be rented for: " +RentedDays+ "days");
        System.out.println("Total Price: " +TotalPrice+ "Ksh");
        
    }
}


public class CarRentalSystem {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        //taking the car details from the user
        System.out.println("Enter car model: ");
        String model = scanner.nextLine();
        System.out.println("Enter car price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        
        //taking the customer details from the user
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter customer's nNational ID: ");
        double customerID = scanner.nextDouble();
        
        //taking the rental details from the user
        System.out.println("Enter the amount of days the car is rented for: ");
        int  RentedDays = scanner.nextInt();
       
        //making the objects
       Car car1= new Car(model, price);
       Customer cust1= new Customer(customerName,customerID);
       RentalAgency rent1= new RentalAgency();
       
       //calling the method in class RentalAgency
       rent1.RentalTransactions(car1, cust1, RentedDays);
       
       scanner.close();
       
    }
    
}
