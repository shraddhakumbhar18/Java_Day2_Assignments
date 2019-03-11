import java.util.Scanner;
public class Rectangle1
{
	public static void main(String[] args) 
	{	
		int length;
		int breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		breadth = sc.nextInt();
			
		Rectangle obj = new Rectangle(length , breadth);
		int area1 = obj.area();
		System.out.println("The area of rectangle 1:" + area1);				
		int perimeter1 = obj.perimeter();
		System.out.println("The perimeter of rectangle 1:" + perimeter1);

		System.out.println("Enter the length of rectangle");
		length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		breadth = sc.nextInt();
		
		
		Rectangle obj2 = new Rectangle(length , breadth);
		int area2 = obj2.area();
		System.out.println("The area of rectangle 2:" + area2);				
		int perimeter2 = obj2.perimeter();
		System.out.println("The perimeter of rectangle 2:" + perimeter2);	
		if(area1==area2)
		{
			System.out.println("Areas are equal");
		}		
		else
		{
			System.out.println("Areas are different");
		}
	}
}