import java.util.Scanner;

public class samplestrings {

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String s = myobj.nextLine();
        int i = myobj.nextInt();
        
        Double d = myobj.nextDouble();
        //String s = myobj.nextLine();
        myobj.close();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
