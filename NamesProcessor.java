import java.util.Scanner;
public class NamesProcessor 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        //take the size of Array of names from user
        System.out.print("Enter the size of your array of names: ");
        int size = scanner.nextInt();
        
        scanner.nextLine();
        
        String [] names = new String[size];
        String checkName;
        
        //take the names from user
        for(int i =0; i<names.length; i++)
        {
            System.out.print("Enter name number "+(i+1)+" :");
            names[i] = scanner.nextLine();
            
        }
        //ask user to check a name
        System.out.print("Search for name: ");
        checkName = scanner.nextLine();
        
        //invoking returnIndex method
        int index = returnIndex(checkName,names);
        
        if(index==-1)
        {
            System.out.println(checkName+" not found");
            
        }else{
            System.out.println(checkName+" found at index "+index);
        }
        
    
        
    }
    //Creating returnIndex method that return index of certin name
    public static int returnIndex(String name,String[]names)
    {
      for(int i =0; i<names.length; i++)
      {
          if(names[i].length()!= name.length())
          {
              continue;
          }
          
          for(int j = 0; j<name.length(); j++)
          {
              if(Character.toLowerCase(names[i].charAt(j))!= Character.toLowerCase(name.charAt(j)))
              {
                  break;
              }else if(j == name.length()-1)
                  return i;
          }
          
      }
      return -1;
    }
}
