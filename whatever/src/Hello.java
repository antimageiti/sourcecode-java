
public class Hello {
   


    public static void main(String[] args) {
        int i = 1;
        Integer i2 = new Integer(i);
        int i3 = i2;
       
        Hello hello = new Hello();
        hello.say(100);
    }
        private static int NUMBER_TWO = 200;
        
        public static int index = 100;
        
        private int number = 300;
    
        private void say(int number) {
            int index = 0;
            System.out.println(index);
            System.out.println(this.index);
            System.out.println(this.number);
            System.out.println(NUMBER_TWO);
        
        
    }
}
