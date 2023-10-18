import java.util.Scanner;
public class Tax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        int n = sc.nextInt();
        if(n<10000){
            System.out.println("your salary is"+n);
        }
        if(n>10000 & n<20000){
            int Salary=(n*10)/100;
            int totalsalary = n-Salary;
            System.out.println("Your salary is"+totalsalary);
        }
        if(n>20000 & n<30000){
            int Salary=(n*15)/100;
            int totalsalary = n-Salary;
            System.out.println("Your salary is"+totalsalary);
        }
        if(n>30000){
            int Salary=(n*30)/100;
            int totalsalary = n-Salary;
            System.out.println("Your salary is"+totalsalary);
        }
    }
    
}
