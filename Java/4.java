import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        try {
            if (num < 0) {
                throw new NegativeNumberException("The number is a negative number");
            }
            double sqrt = Math.sqrt(num);
            System.out.println("The square root of " + num + " is " + sqrt);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
