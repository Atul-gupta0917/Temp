package Function;

import java.util.Scanner;

public class Arearec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        int w = sc.nextInt();
        System.out.println("Enter the length ");
        int l = sc.nextInt();
        area(w,l);
        per(w,l);
        sc.close();
    }
    public static void area(int w, int l) {
        int a = (w*l);
        System.out.println("AREA->"+a);
    }
    public static void per(int w,int l) {
        int b = 2*(l+w);
        System.out.println("PERIMETER->"+b);
        
    }
    
}
