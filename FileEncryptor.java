
import java.io.*;

import java.util.Scanner;
public class FileEncryptor 
{
    
    public static void main(String[] args) throws IOException{
       Scanner input = new Scanner(System.in);
       String inputFile,outputFile;
       int key;
        System.out.print("Enter input file name (ex: in.txt) : ");
        inputFile = input.nextLine();
        System.out.print("Enter output file name (ex: out.txt) :");
        outputFile = input.nextLine();
        System.out.print("Enter key for encyption : ");
        key = input.nextInt();
        
        if(encryptFile(inputFile,outputFile,key)){
            System.out.println("Encryption done");
        }else{
            System.out.println("Error in file");
        }
        
        
    }

    public static String encryptString (String inputString, int aKey){
        String outputStr="";
       for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            ch+=aKey;
            
            outputStr+=ch;
            
        }
        
       return outputStr;
       
   }

       public static boolean encryptFile (String inputFile, String outputFile,int aKey) throws IOException
{
         File file=new File(inputFile);
         if(file.exists()){
         Scanner readFile=new Scanner(file);
         PrintWriter write=new PrintWriter(outputFile);
       
         while(readFile.hasNext()){
              String inputString=readFile.nextLine();
              String encryptedLine=encryptString(inputString,aKey);
              write.println(encryptedLine);
          }


            readFile.close();
            write.close();
            
            return true;
         }else{
             return false;
         }
    
        }
}
