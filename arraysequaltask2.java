import java.util.Scanner;

public class arraysequaltask2
{
   public static void main(String[] args)
   {
       int m,n;
       Scanner sc= new scanner(System.in);
       System.out.println("enter size of array1");
       m=sc.nextInt();
       System.out.println("enter size of array2");
       n=sc.nextInt();
       System.out.println("enter elements of array1");
       for(int i=0;i<m;i++)
       {
          array1[i]=sc.nextInt();
       }
       System.out.println("enter elements of array2");
       for(int j=0;j<n;j++)
       {
          array1[j]=sc.nextInt();
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