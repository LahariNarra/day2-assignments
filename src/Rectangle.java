public class Rectangle
{
	private double length;
	private double breadth;
	
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public double areaOfRectangle()
	{
		return (length*breadth);
	}
	public double perimeterOfRectangle()
	{
		return 2*(length+breadth);
	}
	public void display()
	{
		System.out.println("Length is " +length+ "\n Breadth is " + breadth);
		System.out.println("Area is " +areaOfRectangle());
		System.out.println("Perimeter is " +perimeterOfRectangle());
	}	

	public static void main(String args[])
	{
		Rectangle rect1 = new Rectangle(4,5);
		rect1.display();
		Rectangle rect2 = new Rectangle(5,4);
		rect2.display();
		if(rect1.areaOfRectangle()==rect2.areaOfRectangle())
		{
			System.out.println("Both Rectangles may have similar dimensions");
		}
		else
		{
			System.out.println("Rectangles have Different dimensions");
		}
	}
}








































































