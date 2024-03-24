import java.util.Scanner;
public class EncryptString
{
    public static void main (String args [])
    {
        Scanner input = new Scanner(System.in);
        String text , encryptedText; 
        int repeat;
        int key;
      do
      {
        System.out.print("Enter text to encrypt: ");
        text= input.nextLine();

        System.out.print("Enter a key: ");
        key = input.nextInt();
        input.nextLine(); 
        
        
        encryptedText = encryptString(text, key);
        System.out.println("Encrypted text is : " + encryptedText);
        System.out.println("Decrypted text is : " + decryptString(encryptedText, key));         
        System.out.println("Do you want to repeat the process? (1 for Yes / 0 for No)");
        repeat = input.nextInt();

        input.nextLine();
       
        if(repeat == 0 )
        {
            System.out.println("Exiting program..");
        }
      }while(repeat != 0);
    }
    
    
    public static String encryptString(String inputString, int akey)
    {
        String encrypted = "";
         for(int i = 0; i<inputString.length(); i++)
        {
            char ch = inputString.charAt(i); 
            ch+= akey;
            
            encrypted+=ch;
        }
         
         return encrypted;
    }
    
    public static String decryptString(String inputString, int akey)
    {
        String decrypted = "";
        for(int i = 0; i<inputString.length(); i++)
        {
            char ch = inputString.charAt(i); 
            ch-= akey;
            
            decrypted+=ch;
        }
         
         return decrypted;
        
    }
}
