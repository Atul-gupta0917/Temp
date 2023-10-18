import java.util.Scanner;
public class Salary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic salary");
        float a= sc.nextFloat();
        float hra=(30*a)/100;
        System.out.println("Your hra is "+hra);
        float ta=(20*a)/100;
        System.out.println("Your ta is "+ta);
        float da=(10*a)/100;
        System.out.println("Your da is "+da);
        int pf=1500;
        System.out.println("Your pf is "+pf);
        float netsalary=a+hra+da+ta-pf;
        System.out.println("Your net salary "+netsalary);

}
}
