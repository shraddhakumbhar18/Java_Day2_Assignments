import java.util.Scanner;
public class Distance
{
	int feet;
	double inches;
	
	public void setDistance(int feet, double inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	public void display()
	{
		System.out.println("Feet:" +feet + " & " + "Inches:" +inches);
	}
	public Distance add(Distance number)
	{
		Distance number1=new Distance();
		number1.feet=this.feet+number.feet;
		number1.inches=this.inches+number.inches;
		return number1;
	}
	
}