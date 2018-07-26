package whatever;

public class workShopLoop {

    public static void main(String[] args) {

//       Line1
        for (int i = 0; i < 9; i++) {
            
        }
        
//       Line2
        for (int i = 0; i < 9; i++) {
            int start = 9;
            if(i==start/2) {
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        newLine();
//       Line3
        int start = 9;
        for (int round = 0; round < 5; round++) {
            generateSpace(round);
            generateStar(start);
            newLine();
            start = start - 2;

        }
//       Line4
//       Line5
//       Line6
//       Line7
//       Line8
//       Line9

    }

    private static void newLine() {
        System.out.println();
    }

    private static void generateStar(int start) {
        for (int i = 0; i < start; i++) {
            System.out.print("*");
        }
    }

    private static void generateSpace(int round) {
        for (int a = 0; a < round; a++) {
            System.out.print(" ");

        }
    }

}
