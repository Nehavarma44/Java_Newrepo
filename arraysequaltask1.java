import java.util.Scanner;

public class arraysequaltask1
{
   public static void main(String[] args)
   {
       int m,n;
       Scanner sc= new Scanner(System.in);
       System.out.println("enter size of array1");
       m=sc.nextInt();
       System.out.println("enter size of array2");
       n=sc.nextInt();
       int array1[]= new int[m];

       System.out.println("enter elements of array1");
       for(int i=0;i<m;i++)
       {
          array1[i]=sc.nextInt();
       }
       int array2[]= new int[n];

       System.out.println("enter elements of array2");
       for(int j=0;j<n;j++)
       {
          array2[j]=sc.nextInt();
       }
       if(m==n)
       {
          for(int x=0;x<m;x++)
          {
             if(array1[x]!=array2[x])
             System.out.println("true");
             else
             System.out.println("false");
          
          }
       
       
       }

       

   
   
   
   }





}