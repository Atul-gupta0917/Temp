import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month ");
        String n=sc.nextLine();
        switch(n){
            case "January": System.out.println("It is winter");break;
        case "February":System.out.println("It is winter");break;
        case "March": System.out.println("It is winter");break;
        case "April":System.out.println("It is Summer");break;
        case "May": System.out.println("It is summer");break;
        case "June": System.out.println("It is Summer");break;
        case "July": System.out.println("It is Monsoon");break;
        case "August":System.out.println("It is monsoon");  break;
        case "September": System.out.println("It is Monsoon");break;
        case "October":System.out.println("It is post-monsoon");break;
        case "November":System.out.println("It is post monsoon");break;
        case "Decemebr":System.out.println("it is winter");break;

    }
}
}