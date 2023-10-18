import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check palindrome");
        int num=sc.nextInt();
        int n=num;
        int s=0;
        while(num>0)
        {
            int r=num%10;
            s=s*10+r;
            num=num/10;
            
        }
        if(s==n)
        System.out.println("Number is palindrome");
        else
        System.out.println("number is not palindrome");
    }
    
}
