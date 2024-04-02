import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the color:");
        String circleColor= scanner.nextLine();

        System.out.println("Enter the radius:");
        Double circleRadius= scanner.nextDouble();

        Circle circleDetails = new Circle(circleColor, circleRadius);
        System.out.println("Circle Color: "+circleDetails.getColor());
        System.out.println("The radius is: "+circleDetails.getRadius());
        System.out.println("The area of the circle is: "+circleDetails.calculateCircleArea());

        scanner.close();
    }
}