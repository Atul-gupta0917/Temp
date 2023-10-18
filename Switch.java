import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("THE MENU FOR THE CALCULATOR IS AS: PLEASE SELECT ANY OPERATION");
        System.out.println("1.ADDITION");
        System.out.println("2.SUBTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4.DIVISION");
        int n=sc.nextInt();
        System.out.println("Enter any two numbers:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        switch(n)
        {
            case 1:
        {
            float c=a+b;
           System.out.println("The sum is:" +c);
           break;
        }
        case 2:
        {
            float d=a-b;
            System.out.println("The difference is:"+d);
            break;
        }
        case 3:
        {
            float m=a*b;
            System.out.println("Multiplication is as:"+m);
            break;
        }
        case 4:
        {
            float div=a/b;
            System.out.println("Division is as:"+div);
            break;
        }
        default:
        System.out.println("Invalid choice");
        }



        }
    }
    

