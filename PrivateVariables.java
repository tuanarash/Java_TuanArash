public class PrivateVariables {
    private String name;
    private int age;
    private boolean isAlive;
    private long netWorth;
    private double salary;


    public PrivateVariables(String name, int age, boolean isAlive, long netWorth, double salary) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.netWorth = netWorth;
        this.salary = salary;

    }

    
    }

    public static void main(String[] args) {
        PrivateVariables pv = new PrivateVariables("Syafiq", 22, true, 5544554454444L, 5000);
        pv.displayDetails();
    }
}