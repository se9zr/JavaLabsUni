import java.util.Scanner;
public class ArrayProcessor 
{
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        //take number of Elements from user
        System.out.print("Enter the size of an array: ");
        final int Size = scanner.nextInt();
        
        int Array [] = new int[Size];
        
        //take the elements of an array from user
        for(int i=0; i<Array.length; i++)
        {
            System.out.print("Enter the value of element "+(i+1)+" : ");
            Array[i] = scanner.nextInt();   
        }
        //take number to be reomved from user
        System.out.print("Enter a value to be removed: ");
        int rValue = scanner.nextInt();
        
        System.out.println();
        
        System.out.println("The new array is: ");
        
        //Declering a new array to store array elements without the removed value
        int newArray[] = new int[0];
        
        //invoking removeElement method
        newArray = removedElement(Array,rValue);
        
        //Printing the new array to user
        for(int i=0; i<newArray.length; i++)
        {
            System.out.print(newArray[i]+" ");
        }
  
    }
    //Remove Element method 
    public static int[] removedElement(int[]Array,int Value)
    {
        //Calculating array size without remvod value
        int count = 0;
        for(int i =0; i<Array.length; i++)
        {
            if(Array[i]!= Value)
            {
                count++;
            }
        }
        
        //declering a new array 
        int[] newArray = new int [count];
        
        int index = 0; 
        
        //copying the old array in new array without removed values 
        for(int i = 0; i<Array.length; i++)
        {
            if(Array[i]!= Value)
            {
                newArray[index] = Array[i];
                index++;
            }
        }
        
        return newArray;
    }
    
    
}
