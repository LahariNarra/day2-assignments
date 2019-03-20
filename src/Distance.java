import java.util.Scanner;
public class Distance
{
	private int feet;
	private double inches;
	public void setDistanceValues(int feet,double inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
	public void displayDistance()
	{
		System.out.println(feet+ "Feet" +inches+ "Inches" );
	}
	public Distance sumOfDistance(Distance number)
	{
		Distance distance3 = new Distance();
		distance3.feet=this.feet+number.feet;
		distance3.inches=this.inches+number.inches;
		if(distance3.inches >= 12.0)
		{
			distance3.inches = distance3.inches-12;
			distance3.feet = distance3.feet+1;
		}
		return distance3;
	}
	public static void main(String args[])
	{
		int feet;
		double inches;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter feet value");
		feet = input.nextInt();
		System.out.println("Enter inch value");
		inches = input.nextDouble();
		Distance distance1 = new Distance();
		distance1.setDistanceValues(feet,inches);
		distance1.displayDistance();
		System.out.println("Enter feet value");
		feet = input.nextInt();
		System.out.println("Enter inch value");
		inches = input.nextDouble();
		Distance distance2 = new Distance();
		distance2.setDistanceValues(feet,inches);
		distance2.displayDistance();
		Distance distance3 = new Distance();
		distance3 = distance1.sumOfDistance(distance2);
		distance3.displayDistance();
	}
}