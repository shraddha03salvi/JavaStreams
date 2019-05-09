package Stream;

import java.util.Scanner;
import java.util.stream.Stream;

public class Programs {

	public static void main(String[] args) 
	{
		//Normal logic for Even number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		if(n%2==0) 
		{
			System.out.println("Entered number is Even number and the number is "+n);
		}
		else {
			
			System.out.println("Entered number is Odd number and the number is" +n);
		}
		
		
		//Display Fibonacci series using for loop(Normal Logic)
	int n2=15, a=0,b=1; 
	 System.out.print("First " + n2 + " terms: ");
	for(int i= 1; i<=n2; i++) 
	{
		System.out.print(a + " + ");
		int sum = a+b;
		a= b;
		b=sum;
		}
	System.out.println("-----------------------------");
	
	//Display Fibonacci series using Stream 
	
	System.out.println("Display Fibonacci series using Stream");
	Stream.iterate(new int[] {0,1},n3->new int[] {n3[1],n3[0]+n3[1]}).limit(7)
	.map(n3->n3[1])
	.forEach(System.out::println);//x -> System.out.println(x)
	
	//Sum all the Fibonacci values.
	
	int sum = Stream.iterate(new int[] {0,1},n4 -> new int[] {n4[1],n4[0]+n4[1]}).limit(7)
			.map(n4 ->n4[1])
			.mapToInt(n4->n4).sum();
	  System.out.println("Fibonacci 7 sum : " + sum);
	
	
	
		//Using Stream and using function for Odd number
		System.out.println("For odd number");
		Stream.iterate(1L,n1->n1+1).filter(Programs::isOddEven).limit(5).forEach(y ->System.out.println(y));
		
		
	}
    public static boolean isOddEven(long number) 
    {
	  if(number%2!=0)
	  {
		return true;
	  }
	return false;
    }
   
    
}
