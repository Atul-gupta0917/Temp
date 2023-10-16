import java.util.Scanner;
public class chara {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        System.out.println("vowel");
        else
        System.out.println("consonant");
        
    }
    
}
