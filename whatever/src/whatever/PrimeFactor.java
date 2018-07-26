package whatever;

public class PrimeFactor {

    public String of(int number) {
        
        String result = "";
        while (number%2 == 0) {
            result = result +2;
            number = number/2;
            
        }
        while (number%3 == 0) {
            result = result +3;
            number = number/3;
            
        }
        while (number%5 == 0) {
            result = result +5;
            number = number/5;
        }
        
        
        return result;
  

    }
    
}
