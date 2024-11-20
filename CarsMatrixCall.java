public class CarsMatrixCall {
    public static void main(String[] args) {
        
        String [][] CarsModel = {
            {"AMG", "Myvi", "G Wagon"},
            {"Waja", "i8", "i7"},
            {"Kancil","Kelisa", "Axia"}

        };

        double [][] CarsPrice = {
            {300000, 50000, 200000},
            {10000, 150000, 125000},
            {5000, 7000, 15000}
        };
    

        for (int i=0; i<CarsModel.length; i++) {

            for (int j=0; j<CarsModel[i].length; j++) {
            
                if (CarsPrice [i][j] == 50000) {
                System.out.println("Car Model : " + CarsModel[i][j]);
                System.out.println("Car Price : RM " + CarsPrice[i][j]);
                }
            }   
        }

    }

}

