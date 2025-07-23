import java.util.Scanner;
public class fibonacci {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number1 =0;
        long number2 =1;
        long number = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        for(int i=1;i<=number;i++){

            long  total =number1+number2;
            System.out.println(i + " " + total);
            number1 =number2;
            number2=total;

        }

    }

}
