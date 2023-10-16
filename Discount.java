import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your amaount");
        int n = sc.nextInt();
        if(n>1000 & n<5000){
            int dis=(n*5)/100;
            int bill=n-dis;
            System.out.println("Your bill is"+bill);
        }
        if(n>5000 & n<10000){
            int dis=(n*10)/100;
            int bill=n-dis;
            System.out.println("Your bill is"+bill);
        }
        if(n>10000 & n<20000){
            int dis=(n*15)/100;
            int bill=n-dis;
            System.out.println("Your bill is"+bill);
        }
        if(n>20000){
            int dis=(n*25)/100;
            int bill=n-dis;
            System.out.println("Your bill is"+bill);
        }
    }
    
}
