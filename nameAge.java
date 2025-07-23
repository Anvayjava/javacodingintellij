import java.util.Scanner;

public class nameAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name and age: ");
        String name = input.next();
        int age = input.nextInt();

        int year = 2025;
        int birthYear = year - age;

        System.out.println("Your name is " + name + " and birth year is " + birthYear);
        System.out.println("Is this correct? (y/n): ");
        String answer = input.next();

        if (answer.charAt(0) == 'y') {
            System.out.println("You are correct");
        } else {
            System.out.println("You are wrong");
        }

        int h = 2011;
        System.out.println("Your name is " + name + " and birth year is " + h);

    }
}
