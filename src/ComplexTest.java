import java.util.Scanner;
public class ComplexTest 
{
	public static void main(String [] args)
	{	
		double real;
		double imaginary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real number as input:");
		real = sc.nextInt();
		System.out.println("Enter imaginary number as input:");
		imaginary = sc.nextInt();
		
		Complex obj = new Complex();
		obj.setComplexNo(real,imaginary);
		obj.display();
	
		System.out.println("Enter real number as input:");
		real = sc.nextInt();
		System.out.println("Enter imaginary number as input:");
		imaginary = sc.nextInt();
		
		Complex obj2 = new Complex();
		obj2.setComplexNo(real,imaginary);
		obj2.display();
		System.out.println("The sum of real and imaginary number is:");
		obj2.sum(obj);
		
		
		Complex number1;
		number1=obj.sum(obj2);
		number1.display();
		
	}
}