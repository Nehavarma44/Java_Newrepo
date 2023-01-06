import java.util.Scanner;


public class outputformat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int b=sc.nextInt();
                int count=0,x=b,strcount=0;
                for(int j = 0; j < s1.length(); j++)
                {
                if(s1.charAt(j) != ' ');
                strcount++;
                }
                //System.out.println(strcount);
                while (x != 0) 
                {
                x = x/10;
                ++count;
                }
                //System.out.println(count);
                int y=15-strcount;
                int z=3-count;
                
                if(count<=3)
                {
                System.out.print(s1);
                System.out.format("%1$"+y+"s", "");
                System.out.format("%03d", b);
                //System.out.print(b); 
                System.out.println("");
            
                }
            }
            System.out.println("================================");


    }
}



