import java.util.Scanner;
  public class Greatest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number");
        int m = sc.nextInt();
        System.out.println("Enter 3rd number");
        int p = sc.nextInt();
        if(n>m){
            System.out.println(n);
        if(m>p){
                System.out.println(m);
            }
        }
        else
        System.out.println(p);
  }
}