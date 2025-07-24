import java.util.Scanner;
public class palindromeChecker {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        for(int i=0;i <= name.length();i++){
            if(name.charAt(0)==name.charAt(name.length()-1)){
System.out.println("Is a palindrome.");
return;
            }System.out.println("Not a palindrome");
return;
        }





    }
}
