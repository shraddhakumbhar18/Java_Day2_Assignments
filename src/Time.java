import java.util.Scanner;
public class Time
{
	int hours;
	int minutes;
	
	public void setTime(int hours, int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
	}
	public void display()
	{
		System.out.println("Hours:" +hours + " & " + "Minutes:" +minutes);
	}
	public Time sum(Time number)
	{
		Time number1=new Time();
		number1.hours=this.hours+number.hours;
		number1.minutes=this.minutes+number.minutes;
		return number1;
	}
	
}