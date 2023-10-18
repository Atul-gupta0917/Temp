import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        System.out.println("Enter any number");
        int num=sc.nextInt();
        while(num>0)
        {
            int r=num%10;
             s=s*10+r;
            num=num/10;
        }
        System.out.println("the reverse of the number is:"+s);
    }

}
