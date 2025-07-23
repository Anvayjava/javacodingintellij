import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
public class studentGradesfromfile {
    public static void main(String [] args)throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("What grade did you get in Mathematics(Enter number only):");
        int grade = sc.nextInt();

        System.out.println("What grade did you get in English(Enter number only): ");
        int enggrade = sc.nextInt();

        System.out.println("What grade did you get in Science(Enter number only): ");
        int sciencegrade = sc.nextInt();

        System.out.println("Seems like you work hard a lot");
        int i = ((grade+enggrade+sciencegrade)/3);
        double myDouble = i;
        /* Making the file */
        PrintWriter writer = new PrintWriter("grade.txt");
        writer.println("the users grade point average is:" + myDouble );
        writer.close();
        Scanner readFile = new Scanner( new File("grade.txt"));
        while(readFile.hasNextLine()){
            System.out.println(readFile.nextLine());
        }
        readFile.close();
        sc.close();

    }
}
