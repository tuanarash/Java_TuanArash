import java.util.Scanner;

public class SwitchCarScanner {

    public String CarModel;

    public SwitchCarScanner() {
            
             System.out.println("Enter Car model: ");
             Scanner scanner = new Scanner(System.in);
             this.CarModel = scanner.nextLine();
                   
    }

    public static void main(String[] args) {

        String CarName;
        Double CarPrice;
        SwitchCarScanner Car = new SwitchCarScanner();

        switch (Car.CarModel) {
            case "AMG":
                CarName = "AMG";
                CarPrice = 100000.00;
                break;
            case "i8":
                CarName = "i8";
                CarPrice = 150000.00;
                break;
            case "Myvi":
                CarName = "Myvi";
                CarPrice = 80000.00;
                break;
            default:
                CarName = "Invalid Car";
                CarPrice = 0.00;
                break;
        }

    
            if (CarPrice > 0 && CarPrice < 100000.00) {
                System.out.println("Average Buyer");
            } else if (CarPrice >= 100000.00){ 
                System.out.println("VIP Buyer");      
             } else {
                System.out.println("Invalid Buyer");
            }


        System.out.println("Car Price is: RM " + CarPrice);
    }
}



