import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.io.File;
public class profile{
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome! This a program to make your profile!");
        System.out.println("If you anser just 4 simple questions we can get you started. ");

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = sc.nextLine();

        System.out.println("What is your age? ");
        String age = sc.nextLine();

        System.out.println("What pie digits you know? ");
        String pie = sc.nextLine();

        System.out.println("What is your favorite sport? ");
        String sport =sc.nextLine();

        PrintWriter writer = new PrintWriter("profile.txt");
        writer.println("The users name is " + name);
        writer.println("The users age is " + age);
        writer.println("The user knows these many pie digits "+ pie);
        writer.println("The users favorite sport is " + sport);
        writer.close();

        Scanner readFile = new Scanner( new File("profile.txt"));
        while(readFile.hasNextLine()){
            System.out.println(readFile.nextLine());
        }
        readFile.close();
        sc.close();







    }
}