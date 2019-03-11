import java.util.Scanner;
public class Complex 
{
	double real;
	double imaginary;
	
	public void setComplexNo(double real, double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	public void display()
	{
		System.out.println(real + " + i" + imaginary);
	}
	public Complex sum(Complex number)
	{
		Complex number1=new Complex();
		number1.real=this.real+number.real;
		number1.imaginary=this.imaginary+number.imaginary;
		return number1;
	}
	
}