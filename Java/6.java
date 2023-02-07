import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String lowerCase = input.toLowerCase();
        String upperCase = input.toUpperCase();

        System.out.println("Lower case: " + lowerCase);
        System.out.println("Upper case: " + upperCase);

        System.out.println("Substring from 5 to end: " + input.substring(5));
        System.out.println("Substring from 0 to 5: " + input.substring(0, 5));
        System.out.println("Substring from 3 to 7: " + input.substring(3, 7));
        System.out.println("Substring from 5 to 5: " + input.substring(5, 5));
    }
}

