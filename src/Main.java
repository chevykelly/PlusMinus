import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numInputs = scan.nextDouble();
        int posInputs = 0;
        int negInputs = 0;
        int zeroInputs = 0;

        //create loop to iterate through given values to determine which Input value to increment (if tmp = 1, posInputs++)
        for(int i = 0; i < numInputs; i++){
            int tmp = scan.nextInt();

            if (tmp > 0){
                posInputs++;
            }
            else if(tmp < 0){
                negInputs++;
            }
            else{
                zeroInputs++;
            }
        }
        scan.close();

        // Calculate the ratios of positive,negative, and zeroes in the given input
        double posResult = posInputs / numInputs;
        double negResult = negInputs / numInputs;
        double zeroResult = zeroInputs / numInputs;

        //trim number of places after the decimal point in our results
        String formattedPosResult = String.format("%.6f", posResult);
        String formattedNegResult = String.format("%.6f", negResult);
        String formattedZeroResult = String.format("%.6f", zeroResult);

        //return ratios above
        System.out.println(formattedPosResult);
        System.out.println(formattedNegResult);
        System.out.println(formattedZeroResult);

    }
}