import java.util.Scanner;

public class IT26100500Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double square = number * number;
        double squareRoot = Math.sqrt(number);

        System.out.println("Square = " + square);
        System.out.println("Square Root = " + squareRoot);

        input.close();
    }
}