package Task1;

public class Main {
    public static void main(String[] args) {

            Driver driver = new Driver ("Andreas", 26);
            Car car = new Car ("Ferrari", "focus1", 1997, "red (255,000,000");
            car.setDriver(driver);

            System.out.println(car);
            System.out.println(driver);

            Car car2 = new Car ("Audi", "r20", 2010, "Yellow (255, 255, 000)");

            car2.setDriver(driver);

            System.out.println(car2);
            System.out.println(driver);




    }

}
