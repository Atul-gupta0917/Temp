package Function;
import java.util.Scanner;
public class menu {
    static void add(double x,double y)
    {
        double c=x+y;
      System.out.println("The addition of two number is: "+c);
    }
    static void sub(double x,double y)
    {
        double c=x-y;
        System.out.println("The subtraction is: "+c);
    }
    static void mul(double x,double y)
    {
        double c=x*y;
        System.out.println("The multiplication is: "+c);
    }
    static void div(double x,double y)
    {
        double c=x/y;
        System.out.println("The division is: "+c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your choice");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int choice=sc.nextInt();
        System.out.println("Input any two numbers");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        switch(choice)
        {
            case 1:
            {
                add(a,b);
                break;
            }
            case 2:
            {
                sub(a,b);
                break;
            }
            case 3:
            {
                mul(a,b);
                break;
            }
            case 4:
            {
                div(a,b);
                break;
            }
            
            default:
            {
                System.out.println("You have entered wrong choice");
            }
        }
        
    }
    
}
