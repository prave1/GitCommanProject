package test.com;
import java.util.Scanner;
class Prime
 {
   public static void main(String args[])
         {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the Numbers");
          int n=sc.nextInt();
         boolean status=true;
         if((n==1)||(n==0))
                 {
                System.out.println("not prime Number");
                 }
               else
                 {
                 for(int i=2; i<n/2; i++)
                         {
                         if(n%i==0)
                                {
                               System.out.println("not prime number");
                                      
                                   status=false;
                                   break;
                                }
                         }
                 }
                   if(status==true)
                           {
                          System.out.println("Prime numbers");
                           }
         }
 }