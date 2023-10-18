import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no.");
        int num=sc.nextInt();
        int c=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                 c=1;
                 break;
            }

        }
        if(c!=0)
        System.out.println(" not prime");
        else
        System.out.println("prime");
    }
    
}
