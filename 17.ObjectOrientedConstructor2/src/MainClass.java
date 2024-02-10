import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car's make: ");
        String make = scanner.nextLine();
        System.out.print("Enter the car's model: ");
        String model = scanner.nextLine();
        System.out.print("Enter the car's year: ");
        int year = scanner.nextInt();

        Car myCar = new Car(make, model, year);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        System.out.print("Enter the updated year: ");
        int updatedYear = scanner.nextInt();
        myCar.setYear(updatedYear);

        System.out.println("Updated year: " + myCar.getYear());
    }
}
