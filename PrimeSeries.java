package demo11;
import java.util.Scanner;
public class PrimeSeries {

	public static void main(String args[])
	   {
	    
	      int stat = 1;
	      int num = 3;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of n:");
	       int n = sc.nextInt();
	      if (n >= 1)
	      {
	         System.out.println("First "+n+" prime numbers are:");
	         System.out.print(2);
	      }

	      for ( int i = 2 ; i <=n ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               stat = 0;
	               break;
	            }
	         }
	         if ( stat != 0 )
	         {
	            System.out.print(" "+num);
	            i++;
	         }
	         stat = 1;
	         num++;
	      }         
	   }

}
