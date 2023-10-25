package Function;

import java.util.Scanner;

public class leapfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int l = sc.nextInt();
        leap(l);
        sc.close();
        
    }
    public static void leap(int l) {
        if(l%400==0||(l%4==0||l%100==0))
        System.out.println("leap year");
        else
        System.out.println("not a leap");
        
    }
    
}
