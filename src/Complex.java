
public class Complex
{
	private double real;
	private double imaginary;
	public void setComplexValues(double real,double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
		
	}
	public void displayComplexValues()
	{
		System.out.println(real+ " + i " +imaginary);
	}
	public Complex sumOfComplex(Complex number)
	{
		Complex complex3 = new Complex();
		complex3.real=this.real+number.real;
		complex3.imaginary=this.imaginary+number.imaginary;
		return complex3;
	}
	public static void main(String args[])
	{
		Complex complex1 = new Complex();
		complex1.setComplexValues(3,4);
		complex1.displayComplexValues();
		Complex complex2 = new Complex();
		complex2.setComplexValues(5,3);
		complex2.displayComplexValues();
		Complex complex3 = new Complex();
		complex3 = complex1.sumOfComplex(complex2);
		complex3.displayComplexValues();
	}
}