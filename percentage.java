import java.util.Scanner;
public class percentage {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    String name= sc.nextLine();
    System.out.println("Your name is "+name);
    System.out.println("Enter your class");
    String classs=sc.nextLine();
    System.out.println("Enter your maths marks");
    float maths=sc.nextFloat();
    System.out.println("Enter your english  marks");
    float english=sc.nextFloat();
    System.out.println("Enter your physics marks");
    float physics=sc.nextFloat();
    System.out.println("Enter your chemistry  marks");
    float chemistry=sc.nextFloat();
    System.out.println("Enter your biology marks");
    float biology=sc.nextFloat();
    float averagemarks=(maths+english+physics+chemistry+biology)/5;
    System.out.println("your total average marks -> "+averagemarks);
    float percentage=((maths+english+physics+chemistry+biology)*100)/500;
    System.out.println("Your percentage is -> "+percentage);
    

    
    
}
}
