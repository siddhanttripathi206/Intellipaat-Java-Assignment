package Java.Assignmen1;

import java.util.Scanner;

public class MaximumThreeNumbers 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

       /* if(firstNumber>secondNumber && firstNumber>thirdNumber)
        {
            System.out.println("Maximum: " + firstNumber);
        }
        else if(secondNumber>firstNumber && secondNumber>thirdNumber)
        {
            System.out.println("Maximum: " + secondNumber);
        }
        else{
            System.out.println("Maximum: " + thirdNumber);
        }*/

        int max = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        System.out.println("Maximum: " + max);
        sc.close();
    }
}
