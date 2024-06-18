package Java.Assignmen1;

import java.util.Scanner;

public class SumOfTwoNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();//enter first number by user
        int secondNumber = sc.nextInt();//enter second number by user
    
        int sum = firstNumber + secondNumber;//calculate sum 

        System.out.println("Sum = " + sum);
    
    }
  
    
}
