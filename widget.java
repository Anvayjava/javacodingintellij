import java.util.Scanner;
public class widget {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of widgets you want:");
        int n = sc.nextInt();

        Scanner widgetAmount = new Scanner(System.in);
        System.out.println("Enter the amount of cost per widget:");
        int costOfWidget = widgetAmount.nextInt();

        int totalCost =  costOfWidget * n;

        System.out.printf("Total cost: $%.2f ", (double) totalCost);
    }
}
