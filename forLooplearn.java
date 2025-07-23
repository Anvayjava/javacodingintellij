import java.util.Scanner;
public class forLooplearn {
    public static void isPrime()
    {
        Scanner primeNumber = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is a prime number:");
        int prime = primeNumber.nextInt();
        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                System.out.println(prime + " is not a prime number! ");
                return;
            }

        }
        System.out.println(prime + " is a prime number. ");
    }
    public static void main (String[]args)
    {
        isPrime();

    }
}

                /*
                else{
                    System.out.println("This is not a prime number!");
                }
*/
// FOR LOOP
// used for counting
// for (start condition; run condition; step/increment) {
//    .....
// }

// step: i = i + STEP,   i = i + 2,  i += 2
// i++ is a shortcut for i= i+1
// ++i is similar
// i+=1