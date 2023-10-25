package Function;
import java.util.Scanner;
public class areaperimeter {
    static void perimeter(float l,float b)
    {
      float p=2*(l+b);
      System.out.println("Perimeter of Rectangle is: "+p);
    }
    static void area(float x,float y)
    {
        float a=x*y;
        System.out.println("Area of Rectangle is: "+a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Perimeter");
        System.out.println("2. Area");
        int choice=sc.nextInt();
        System.out.println("Enter length: ");
        float l=sc.nextFloat();
        System.out.println("Enter breadth: ");
        float b=sc.nextFloat();
        switch(choice)
        {
            case 1:
            {
                perimeter(l,b);
                break;
            }
            case 2:
            {
                area(l,b);
                break;
            }
            default:
            System.out.println("Wrong choice");
        }


    }
}
