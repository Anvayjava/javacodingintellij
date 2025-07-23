import java.util.Scanner;
public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int numberOfEggs = sc.nextInt();
        //variable part
        int gross = numberOfEggs/144;
        int dozenamount = gross*144;
        int number = numberOfEggs-dozenamount;
        int dozen = numberOfEggs/12;
        int extraEggs = numberOfEggs%12;

        System.out.println(dozen + " dozen");
        System.out.println(gross + " gross");
        System.out.println(extraEggs + " extra eggs");
    }
}