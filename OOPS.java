//* OOPS concepts to cover */
// polymorphism(covered)
// inheritance(covered)
// encapsulation(covered)
// packages
// abstraction

//* Thing we covered in this code */
// single inheritance
// ternary operator
// constructors
// function overloading
// getters and setters
// Arrays

class Car {
    String company;
    String model;
    String color;
    int price;
}

class Hyundai extends Car {
    // This is constructor
    Hyundai() {
        System.out.println("This is constructor");
        this.company = "Hyundai";
        this.emiAvailable = true;
        this.warrantyAvailable = true;
    }

    String[] availableModels = { "M097AX11", "M097AX12", "M097AX13" };
    int discount;
    boolean warrantyAvailable;
    boolean emiAvailable;
    private int chassisNumber;
    // We have violated DRY principle, ignore it its for demo purpose only...
    void carModelDetails(String model) {

        for (int i = 0; i < availableModels.length; i++) {
            if (availableModels[i] == model) {
                System.out.println(model + ": In Stock");
                System.out.println("Price: " + this.price);
            }
        }
    }

    void carModelDetails(String model, int discount) {
        for (int i = 0; i < availableModels.length; i++) {
            if (availableModels[i] == model) {
                System.out.println(model + ": In Stock");
                System.out.println("Price: " + this.price);
                System.out.println("Discount: " + discount);

            }
        }

    }
    // setters
    void setChassisNumber(int chassisNumber){
        this.chassisNumber = chassisNumber;
    }
    // getters
    int getChassisNumber(){
        return this.chassisNumber;
    }

    void carDetails() {
        System.out.println(company + " " + model + " " + color + " " + price + " " + discount + " emi available:"
                + (emiAvailable ? "Yes" : "No"));
    }
}

public class OOPS {

    public static void main(String arg[]) {
        Hyundai h1 = new Hyundai();
        h1.model = "M097AX11";
        h1.price = 50_00_000;
        h1.color = "blue";
        h1.discount = 10;
        h1.carDetails();
        h1.carModelDetails("M097AX11");
        h1.carModelDetails("M097AX11", 50);
        h1.setChassisNumber(12131516);
        int h1ChassisNumber = h1.getChassisNumber();
        System.out.println("Chassis number is " + h1ChassisNumber);
    }

}
