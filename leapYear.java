import java.util.Scanner;
public class leapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current year: ");
        int year = sc.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("This is a leap year!");
                System.out.println("The next leap year is " + (year + 4));

            }
            else {
                System.out.println("This is not a leap year!");
                System.out.println("The next leap year is " + (year + 4));

            }
            return;
        }

        if(year % 4 == 0){
            System.out.println("This is a leap year!");
            System.out.println("The next leap year is " + (year + 4));

        }
        else{
            int y = year % 4;
            int z = 4 - y;
            int a = year + z;
            System.out.println(" The next leap year is in " + z + " years, that year will be " + a);
        }

    }




}