package Function;
import java.lang.Math;
import java.util.Scanner;
public class armstrong {
    static int count(int num)
    {
        int c=0;
        while(num>0)
        {
            int r=num%10;
                num=num/10;
                c++;

        }
        return c;
    }
    static int power(int n,int p)
    {
        int s,sum=0;
         while(n>0)
            {
               int rem=n%10;
               s=Math.pow(rem, p);
               sum=sum+s;
               n=n/10;
           }
           return sum;
        }
        
    
    static void check(int input,int number)
    {
        if(input==number)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int data=sc.nextInt();
        int res=count(data);
        int powercheck=power(data,res);
        check(data,powercheck);
        sc.close();
    }
    
}
