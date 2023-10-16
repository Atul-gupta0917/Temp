import java.util.Scanner;
public class num {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range to print even and odd numbers");
        int n=sc.nextInt();
        System.out.print("even no. : ");
        for(int i=0;i<n;i++){
            if(i%2==0)
        System.out.println(+i);
        }
        System.out.print("odd no. : ");
        for(int i=1;i<n;i++)
        {
        if(i%2!=0)
        System.out.println(+i);
        }
    }
}
