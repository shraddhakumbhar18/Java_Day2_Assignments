import java.util.Scanner;
public class DistanceTest 
{
	public static void main(String [] args)
	{	
		int feet;
		double inches;
		Scanner sc = new Scanner(System.in);
        System.out.println("The First distance:");
		System.out.println("Enter feet as input:");
		feet = sc.nextInt();
		System.out.println("Enter inches as input:");
		inches = sc.nextDouble();
		
		Distance obj = new Distance();
		obj.setDistance(feet,inches);
		obj.display();
    
        System.out.println("The Second distance:");
		System.out.println("Enter feet as input:");
		feet = sc.nextInt();
		System.out.println("Enter inches as input:");
		inches = sc.nextInt();
		
		Distance obj2 = new Distance();
		obj2.setDistance(feet,inches);
		obj2.display();
		System.out.println("The total distance is:");
		obj2.add(obj);
		
		
		Distance number1;
		number1=obj.add(obj2);
		number1.display();
		
	}
}