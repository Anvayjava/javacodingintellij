import java.util.Scanner;
public class uppercase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        String name = sc.nextLine();

        String upercase =name.toUpperCase();

        System.out.println(upercase);

    }
}