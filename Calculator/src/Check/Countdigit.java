package Check;


public class Countdigit
{
	private int n;
	public Countdigit(int m)
	{
		n=m;
	}
	public void countCheck()
	{
		int count=0;
		while(n!=0)
		{
			
			int r=n/10;
			n=r;
			count++;
		}
		System.out.println("No. of digits "+count);
	}
}