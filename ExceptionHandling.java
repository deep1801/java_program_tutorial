import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int  a ,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        a = sc.nextInt();
        b  = sc.nextInt();
        try{
           
            c =a/b;
            System.out.println("division is"+c);

        }
        catch(ArithmeticException e)
        {
            System.out.println("denominator should not be 0, try again");
        }
    
        System.out.println("Bye");
    }
}
