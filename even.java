import java.util.Scanner;
public class even {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println(n%2==0?"Number is even":"Number is odd");

    }
    
}
