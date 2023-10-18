import java.util.Scanner;
public class temp {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter celsuis temperature");
        float temp=sc.nextFloat();
        float fahrenhite= temp*(9/5)+32;
        System.out.println("your temparature in fahrenhite is ->"+fahrenhite);
        System.out.println("Enter your temp in fahrenhite");
        float feh=sc.nextFloat();
        float cel=(feh-32)*5/9;
        System.out.println("Your temp in cel is ->"+cel);

    }
}
