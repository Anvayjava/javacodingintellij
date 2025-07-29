import java.util.Scanner;
public class wordPrinter {
    public static void word() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");

        String sentence = sc.nextLine();

        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }

    public static void main(String [] args){
        word();
    }
}
