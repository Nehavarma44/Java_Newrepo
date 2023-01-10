//Assignment 8


class objclassdemo
{
      int age;
      int salaryperday;
      int workingdays;
   public void salary(int age,int salaryperday,int workingdays) 
   {
       //Scanner sc= new Scanner(System.in);
      // age=sc.nextInt();
       //salaryperday=sc.nextInt();
    if(age>40)
    {
    System.out.print("salary per day is ");
    int a4=(salaryperday+100)*workingdays;
    System.out.println(a4);
    }
    else if(age>60)
    {
    System.out.print("salary per day is ");
    int a6=(salaryperday+200)*workingdays;
    System.out.println(a6);
    }
    else
    {
    System.out.print("salary per day is ");
    System.out.println(salaryperday*workingdays);
    }
    
   }
  public static void main(String[] args)
   {
       
      // workingdays=sc.nextInt();
       objclassdemo obj=new objclassdemo();
        obj.salary(26, 1000, 27);
        obj.salary(39, 1250, 25);
        obj.salary(41, 1100, 29);
        obj.salary(53, 1050, 26);
        obj.salary(62, 1150, 24);
   
   }


}
