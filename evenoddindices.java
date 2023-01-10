//Assignment 7 4

import java.util.Scanner;


public class evenoddindices
{
    public static void main(String[] args)
    {
        int m,tempodd=0,tempeven=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        m=sc.nextInt();
        int array[]= new int[m];
        System.out.println("enter elements of array1");
        for(int i=0;i<m;i++)
        {
          array[i]=sc.nextInt();
        }
       for (int i=0;i<m;i++)
       {
          if(i%2==0)
          {
            tempeven=tempeven+array[i];
            
          }
          else
          {
            tempodd=tempodd+array[i];
          }
       
       }
       if(tempeven>tempodd)
       {
         System.out.println("even indices value is greater"+tempeven);
       }
       else
       {
         System.out.println("odd indices value is greater"+tempodd);
       }
    
    
     }
     
}