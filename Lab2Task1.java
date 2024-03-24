import java.util.Scanner;
public class Lab2Task1 
{
    public static void main(String args[])
    {
          
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer : ");
        int integer = input.nextInt();
        
      
        //check if integer is even
        if(integer%2 == 0)
        {
            System.out.println(integer+" is even");
            //check of integer can be divided by 12 and 8
            if(integer%8==0 && integer%12==0)
            {
                System.out.println(integer+" divisible by 12 and 8"); 
            }
            
            //check if integer can be divided by 12 
            else if (integer%12 == 0)
                {
                    System.out.println(integer+" divisible by 12");
                }
                    //check if integer can be divided by 8 
                   else if(integer%8==0)
                    {
                        System.out.println(integer+" divisible by 8");
                    }
            
        }else
        {
            System.out.println(integer+" is odd");
            //if odd can it be divided by 5
            if (integer%5 ==0 )
            {
                  System.out.println("It is divisible by 5");
            }else
            {
                System.out.println("It can't be divisible by 5");
            }
        }
        
        
    }
}
