
package ass1;

import java.util.*;
public class PascalTriangle{



	  public static void main(String[] args)
	  {
	      int no_row,c=1,k,i,j;
	      System.out.print("number of rows: ");
	      Scanner abc= new Scanner(System.in);
	  		    no_row =abc.nextInt();
	      for(i=0;i<no_row;i++)
	      {
	    	  for(k=0; k<no_row-i; k++){
	    	        System.out.print(" ");
	    	      }
	          for(j=0;j<=i;j++)
	          {
	              if (j==0||i==0)
	                  c=1;
	              else
	                 c=c*(i-j+1)/j;
	              System.out.print(" "+c);
	          }
	          System.out.print("\n");
	      }
	}
}
