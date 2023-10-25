package Function;

import java.util.Scanner;

public class Swapfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number");
        int a = sc.nextInt();
        System.out.println("Enter the value of second number");
        int b = sc.nextInt();
        swap(a,b);
        swap1(a,b);
        swap2(a,b);
        sc.close();
    }
    public static void swap(int a , int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after swapping->"+a+"," +b);
        
        
    }
    public static void swap1(int a , int b) {
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Numbers after swapping-> "+a+","+b);
        
    }
    public static void swap2(int a, int b) {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Numbers after swapping->"+a+","+b);
        
    }
    
    
}
