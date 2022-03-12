package ass1;

import java.util.*;
public class GradesAverage{
	



public static void main(String[] args)
{	int avg=0, grade = 0;
	try (Scanner abc = new Scanner(System.in)) {
		System.out.println("enter no of student");
		int n=abc.nextInt();
		for(int i=1;i<=n;i++) 
		{	
			
			System.out.println("Enter the grade of student"+i);
		
			
				grade=abc.nextInt();
				if(0<=grade && grade<=100) {
				
					avg+=grade;
				}
				
			
			else
			{
				System.out.println("Invalid grade,try again");
				i=i-1;
			}
		}
		
		System.out.println("The average is "+ avg/n);
	}
	
	
	
	}
}
			
			
	
	
	
