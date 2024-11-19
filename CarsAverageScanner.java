import java.util.Scanner;

public class CarsAverageScanner {
    
    private String CarModel;
    private String CarMaker;
    private double CarPrice;
    Scanner scanner = new Scanner(System.in);

    public CarsAverageScanner() {
            
             System.out.println("Enter Car model: ");
             this.CarModel = scanner.nextLine();
             System.out.println("Enter Car make: ");
             this.CarMaker = scanner.nextLine();
             System.out.println("Enter Car price: ");
             this.CarPrice = scanner.nextDouble();

    }

        public void displayDetails(){
            System.out.println("The Car Model is " + CarModel);
            System.out.println("The Car Maker is " + CarMaker);
            System.out.println("The Car Price is " + CarPrice);
           
        }
         

        public static void main(String[] args) {
            CarsAverageScanner Car1 = new CarsAverageScanner();
            CarsAverageScanner Car2 = new CarsAverageScanner();
            CarsAverageScanner Car3 = new CarsAverageScanner();
            
            Car1.displayDetails();
            Car2.displayDetails();
            Car3.displayDetails();
        
            System.out.println("Average Price is " + (Car1.CarPrice + Car2.CarPrice +Car3.CarPrice) /3);

        }

    }