import java.util.Scanner;
public class Lab3Task1 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        //take two numbers from user
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        //shwo result message
        System.out.print("The GCD of "+a+" and "+b+ " is ");
        
        //statring while loop that repeats until a is equal to b 
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }else
            {
                b=b-a;
            }
            
        }
        //print the restult a or b (they both are the same value)
        System.out.print(a);
                
        
    }
}
