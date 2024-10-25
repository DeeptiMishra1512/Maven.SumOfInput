import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);

        int sum2 = gaussianSumOfNumbers(number);
        
        System.out.println(sum);
        System.out.println(sum2);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int total = 0;
        for(int i = 1; i<= n; i++ )
        {
            total = total + i;

        }
        System.out.println("Sum Of Numbers is: " + total);
        return total;
    }
    
    
    static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        int sum2 = 0;
        //int num[];
        for (int j = 0; j <= n;  j++)
        {
            //assign values in array
            //int num[] = num[j];
            sum2 = (n * (n + 1)) / 2;

        }
        System.out.println("Gussain Sum Of Numbers is: " + sum2);
        return sum2;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
