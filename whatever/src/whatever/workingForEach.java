package whatever;

public class workingForEach {

    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5 };
        // old
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        System.out.println("-----------------------");
        // new
        for (int i : number) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        
        
    }

}
