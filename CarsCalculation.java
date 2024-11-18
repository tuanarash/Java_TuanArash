public class CarsCalculation {
    double MercedesPrice = 500000;
    double PeroduaPrice = 60000;
    double BMWPrice = 1000000;
    double Average = (MercedesPrice + PeroduaPrice + BMWPrice) / 3;
    
    public static void main(String[] args) {
        CarsCalculation myCarsCalculation = new CarsCalculation();
        System.out.println("Average Price is " + myCarsCalculation.Average);
    }
    }
    

