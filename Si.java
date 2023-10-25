package Function;
import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p");
        int p = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        System.out.println("Enter the value of t");
        int t = sc.nextInt();
        si(p,r,t);
        sc.close();
    }
    public static void si(int p,int r ,int t){
        float s= (p*r*t)/100;
        System.out.println("your simple interest is->"+s);
        
    }
}
