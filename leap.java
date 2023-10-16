import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any year to check whether it is leap year or not");
        int leap= sc.nextInt();
        if(leap%400==0||(leap%4==0||leap%100==0))
        System.out.println("leap year");
        else
        System.out.println("not a leap");
    }
}
            