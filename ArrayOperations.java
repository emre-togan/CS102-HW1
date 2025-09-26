import java.util.Random;
import java.util.Scanner;

public class ArrayOperations{
    public static void main(String[] args) {

        System.out.print("Welcome! Please give the array size that you want: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize];
        
        for(int i = 0; i < arrSize ; i++){
            int randomNum = random.nextInt(101);
            array[i] = randomNum;
        }
        
    }

    public static int[] arrayMin(){

    }

    public static int[] arrayMax(){

    }

    public static int[] diffFromAve(){

    }

    public static int sumOfOdds( int[] numbers){

    }

    public static int sumOfEvens( int[] numbers){

    }
}
