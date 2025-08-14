import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int a = sc.nextInt();
        System.out.println("Enter an other no ");
        int b = sc.nextInt();
        System.out.println("The sum of two no." + a + " and " + b + " is " + a+b );

        System.out.println("Enter a string");
        String name = sc.next();
        System.out.println(name);

        System.out.println("Enter a Float no "); 
        float c =sc.nextFloat();
        System.out.println("Enter a Float no "); 
        float d =sc.nextFloat();
        System.out.println("The sum of two no." + c + " and " + d + " is " + c+d );

        sc.close();

    }
    
}