
package ass1;

public class fib {
	public static void main(String[] args) {

		int num=20;
		System.out.println("fibbonai series of first 20 num is ");
		int num1=0;
		int num2=1;
		int count=0;
		
			for(int i=0;i<=num;i++)
			{
				System.out.println(num1);
				count+=num1;
			
				int num3=num1+num2;
				num1=num2;
				num2=num3;
				
				
			}
			
		
		
				System.out.println("average of first 20 num is " + count/20);
		
					
			
		}
	
		
		
	}


