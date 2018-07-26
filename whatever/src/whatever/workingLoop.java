package whatever;

public class workingLoop 
{
    public static void main (String[] args) 
    {  for (int i = 0; i < 10; i++) 
        {
            System.out.println(i);
            
        }
        
       int i = 0;
       while(i<5) 
        {
            System.out.println(i);
            i++;
        }
       i=0;
       do {
           System.out.println(i);
            i++;
        
    } while (i<5);
       System.out.println("******************************");
       
       
       int temp=0;
      for (int j = 1; j <11; j++) {
        temp = j+temp;
    }
      System.out.println(temp);
      System.out.println("--------------------------------");
      
      
     
      
    }
}
