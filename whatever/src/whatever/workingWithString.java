package whatever;

public class workingWithString 
{

    public static void main(String[] args) 
    {
       String name = "Phonrat";
       int age = 25;
       String result = name+ " " +age;
       String result2 = String.format("%s %d",name,age);
       
       System.out.println(result);
       System.out.println(result2);
       
       
       
       
    }

}
