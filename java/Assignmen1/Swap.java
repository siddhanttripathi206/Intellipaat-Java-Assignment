package Java.Assignmen1;

public class Swap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Before swapping: " + a + "," + b);

        a = a+b;//a=3
        b = a-b;//b=3-2=1
        a = a-b;//3-1=a-b

        System.out.println("After swapping: " + a + "," + b);

    }
    
}
