import java.util.Scanner;
public class anagramChecker {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = sc.nextLine();

        System.out.println("Enter another word");
        String word2 = sc.nextLine();

        int x =0;

        for(int i =0;i<word1.length();i++  ){
            int y=x+i;
            if(word1.charAt(0)==word2.charAt(y)){
System.out.println("anagram");
return;
            }
        }
        x=0;
        for(int i =0; i<word1.length();i++){
            int y=x+1;
            if(word1.charAt(y)==word2.charAt(0)){
                System.out.println("Anagram");
            }

        } System.out.println("Not anagram");



        }
    }






