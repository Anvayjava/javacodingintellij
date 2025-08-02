import java.util.Scanner;
import java.io.*;
public class reverseString {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input1 = sc.nextLine();
        char[] chararray = input1.toCharArray();
        for (int i = chararray.length - 1; i >= 0; i--) {
            System.out.print(chararray[i]);

        }
    }
}
