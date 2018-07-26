package whatever;

public class Sort {

    public int[] of(int[] input) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i+1]) {
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                    count++;
                }
            }
        }
//        if (input.length ==2) 
//        {
//      
//            if (input[0]>input[1])
//            {
//            int temp = input[1];
//            input[1] = input[0];
//            input[0] = temp;
//            }
//        }     
//        
//        else if (input.length ==3) {
//            if (input[0]>input[1])
//            {
//            int temp = input[1];
//            input[1] = input[0];
//            input[0] = temp;
//            }
//            if (input[1]>input[2])
//            {
//            int temp = input[2];
//            input[2] = input[1];
//            input[1] = temp;
//            
//            }
//        }
//        
        return input;
    }
    
    
}
