/* Java Program Example - Find Largest of Two Numbers */
		
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        int a=5, b=6, big;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        a = scan.nextInt();
        b = scan.nextInt();
		
        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }
		
        System.out.print("Largest of Two Number is " +big);
    }
}
