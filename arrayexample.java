//Assignment 7 2nd task

import java.util.Scanner;



public class arrayexample
{

public static void main(String[] args)
{


  
   int max,min,temp=0,m;
   Scanner sc=new Scanner(System.in);   
   System.out.println("eNTER size");
   m=sc.nextInt();
   int n[]= new int[m];
   System.out.println("Enter the elements of the array: ");  
     for(int x=0; x<m; x++)  
      {  
         n[x]=sc.nextInt();
      }
   for(int i=0;i<m;i++)
   {
      for(int j=i+1;j<m;j++)
        {
   
           if(n[i]>n[j])
             {
                temp=n[i];//1
                n[i]=n[j];//27
                n[j]=temp;//1
             }
             //i++; 
    
        }
      


    }
   
System.out.println("min"+ n[0]);
      System.out.println("max"+ n[m-1]);
}

}