package whatever;

public class workingStringLoop {

    public static void main(String[] args) {
        String name ="Somkiat2018";
        for (int i= 0 ; i< name.length();i++) {
//            System.out.println(name.substring(0,1));
        }
        for (int i = name.length(); i >0 ; i--) {
//            System.out.println(name.substring(0,1));
            name = name.substring(1);
            System.out.println(name);
        }
    }

}
