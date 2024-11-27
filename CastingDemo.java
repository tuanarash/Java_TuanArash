public class CastingDemo {
    public static void main(String[] args) {
        int numInt = 20;
        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);

        double numDouble2 = 10.5;
        int numInt2 = (int) numDouble2;
        System.out.println(numInt2);
        System.out.println(numDouble2);
    }
}
