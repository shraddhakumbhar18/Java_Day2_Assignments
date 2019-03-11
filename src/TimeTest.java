import java.util.Scanner;
public class TimeTest 
{
	public static void main(String [] args)
	{	
		int hours;
		int minutes;
		Scanner sc = new Scanner(System.in);
        System.out.println("The First Object is:");
		System.out.println("Enter hour as input:");
		hours = sc.nextInt();
		System.out.println("Enter minutes as input:");
		minutes = sc.nextInt();
		
		Time obj = new Time();
		obj.setTime(hours,minutes);
		obj.display();
    
        System.out.println("The Second Object is:");
		System.out.println("Enter hour as input:");
		hours = sc.nextInt();
		System.out.println("Enter minutes as input:");
		minutes = sc.nextInt();
		
		Time obj2 = new Time();
		obj2.setTime(hours,minutes);
		obj2.display();
		System.out.println("The total distance is:");
		obj2.sum(obj);
		
		
		Time number1;
		number1=obj.sum(obj2);
		number1.display();
		
	}
}