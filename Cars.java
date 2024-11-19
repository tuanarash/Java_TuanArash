public class Cars {
    private String CarModel;
    private String CarMaker;
    private double CarPrice;

    public Cars(String CarModel, String CarMaker, double CarPrice) {
        this.CarModel = CarModel;
        this.CarMaker = CarMaker;
        this.CarPrice = CarPrice;
    }
        public void displayDetails(){
            System.out.println("The Car Model is " + CarModel);
            System.out.println("The Car Maker is " + CarMaker);
            System.out.println("The Car Price is " + CarPrice);
           
        }
        public static void main(String[] args) {
             Cars FirstCar = new Cars("G_Wagon", "Mercedes", 500000);
            FirstCar.displayDetails();
        }
}

   
    

