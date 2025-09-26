import java.util.Arrays;
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

        int choice = 0;

        System.out.println(Arrays.toString(array));

        while(choice != 4){
        
        System.out.println("1- Find the array's min and max");
        System.out.println("2- Find the differences from average");
        System.out.println("3- Find the sum of even and odd elements");
        System.out.println("4- Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Array min is " + arrayMin(array));
            System.out.println("Array max is " +  arrayMax(array));
        }

        if(choice == 2){
            System.out.println("The differences: " + Arrays.toString(diffFromAve(array)));
        }
        
        if(choice == 3){
            System.out.println("Sum of odds: " + sumOfOdds(array));
            System.out.println("Sum of evens: " +  sumOfEvens(array));
        }
    }
    System.out.println("Successfully Logged Out!");
    

    scanner.close();
        
    }

    public static int arrayMin(int[] array){
        return 5;
    }

    public static int arrayMax(int[] array){
        return 5;
    }

    public static int[] diffFromAve(int[] array){
        int sum = 0;
        int[] aveArr = new int[array.length];

        for(int i = 0; i < array.length; i++){
            sum += array[i];

        }

        int ave = sum / array.length;

        System.out.println("The average is: " + ave);
        for(int j = 0; j < array.length; j++){
            aveArr[j] = array[j] - ave;
        }

        return aveArr;
    }

    public static int sumOfOdds( int[] numbers){
        
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            if(i % 2 == 1){
                sum += numbers[i];
            }
        }

        return sum;
    }

    public static int sumOfEvens( int[] numbers){

        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            if(i % 2 == 0){
                sum += numbers[i];
            }
        }

        return sum;
    }
}
