public class ArrayOperations{
    public static void main(String[] args) {
        
    }

    public static int[] arrayMin(){

    }

    public static int[] arrayMax(){

    }

    public static int[] diffFromAve(){
        
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
