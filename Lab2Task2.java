import java.util.Scanner;
public class Lab2Task2 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        //take two numbers from user 
        System.out.print("Enter two numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        System.out.print("Enter expression : ");
        char c = input.next().charAt(0);
        //strt of switch (user chioce)
        switch(c)
        {
            case '+':
                System.out.println("sum of "+x+" and "+y+" is "+(x+y));
                break;
            case '-':
                System.out.println("mines of "+x+" and "+y+" is "+(x-y));
                break;
            case '*':
                System.out.println("multiplication of "+x+" and "+y+" is "+(x*y));
                break;
            case '/':
                System.out.println("divison of "+x+" and "+y+" is "+(x/y));
                break;
            default:
                System.out.println("Invalid expersion.");
        }
    }
}
