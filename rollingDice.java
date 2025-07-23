import java.util.Random;
public class rollingDice
{
    public static void main(String[] args){
        //Create random number generator
        int totalSum = 0;
        for(int i=1;i<=10;i++) {
            Random rand = new Random();
            //generate a number between 1 and 6
            int randomV1 = (int) (Math.random() * 6) + 1;
            //double randomV1 = Math.random(1.0,6.0);

            //generate another random number for the sum
            int randomV2 = (int) (Math.random() * 6) + 1;
            int sum = randomV1 + randomV2;


            //add them
            System.out.println(sum);
            //System.out.println(sum);
            totalSum = totalSum + sum;
        }
        System.out.println(totalSum);
    }
}
// Idk how to do this
