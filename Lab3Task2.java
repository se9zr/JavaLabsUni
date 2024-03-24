import java.util.Scanner;

public class Lab3Task2 
{
    public static void main(String args[])
    {
        Scanner Scanner = new Scanner(System.in);
        
        //check if number or letter from both sides are equal 
        boolean check = true;
        
        //take text from user 
        System.out.println("Enter a Text : ");
        String text = Scanner.nextLine();
       
        //Start for loop to start counting from both sides 
        for(int i =0 , j=text.length()-1; i<text.length()/2; i++,j--)
        {
            if(text.charAt(i)!=text.charAt(j))
            {
                //if this condition is false it will go to else
                check = false; 
                 
            }
        }
        //if check is true will print the statemnt 
        if(check)      
        {
            System.out.println(text+" is palindrome");
        }else
        {
            System.out.println(text+" is not a palindrome");
        }
    }
}
