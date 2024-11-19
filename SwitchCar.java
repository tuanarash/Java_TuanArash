//Create a Switch which is going to obtain the car model from the terminal and give back the price, if the price is greater than 100,000 RM shows the buyer is VIP

public class SwitchCar {

        public static void main(String[] args) {
            String CarModel = "i7";
            String CarName;
            double CarPrice;
    
            switch (CarModel) {
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
                    CarPrice = 0;
                    break;
            }

        
                if (CarPrice > 0 && CarPrice <= 100000.00) {
                    System.out.println("Average Buyer");
                } else if (CarPrice >= 100000.00){ 
                    System.out.println("VIP Buyer");      
                 } else {
                    System.out.println("Invalid Buyer");
                }


            System.out.println("The Selected Car Model is: " + CarName);
            System.out.println("The Selected Car Price is: RM " + CarPrice);
        }
    }
    

