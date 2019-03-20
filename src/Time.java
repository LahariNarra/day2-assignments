import java.util.Scanner;
public class Time
{
	private int hours;
	private int minutes;
	public void setTime(int hours,int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}
	public void displayTime()
	{
		System.out.println(hours+ "Hours" +minutes+ "Minutes" );
	}
	public Time sumOfTimes(Time number)
	{
		Time time3 = new Time();
		time3.hours=this.hours+number.hours;
		time3.minutes=this.minutes+number.minutes;
		if(time3.minutes >= 60)
		{
			time3.minutes = time3.minutes-60;
			time3.hours = time3.hours+1;
		}
		return time3;
	}
	public static void main(String args[])
	{
		int hours;
		int minutes;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Hours value");
		hours = input.nextInt();
		System.out.println("Enter Minutes value");
		minutes = input.nextInt();
		Time time1 = new Time();
		time1.setTime(hours,minutes);
		time1.displayTime();
		System.out.println("Enter Hours value");
		hours = input.nextInt();
		System.out.println("Enter Minutes value");
		minutes = input.nextInt();
		Time time2 = new Time();
		time2.setTime(hours,minutes);
		time2.displayTime();
		Time time3 = new Time();
		time3 = time1.sumOfTimes(time2);
		time3.displayTime();
	}
}