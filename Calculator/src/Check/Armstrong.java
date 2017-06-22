package Check;


public class Armstrong 
{
	private int n;
	public Armstrong(int m)
	{
		n=m;
	}
	public void armstrongCheck()
	{
		int r,q,org=n,sum=0;
		while(n!=0)
		{
			r=n%10;
			q=n/10;
			n=q;
			sum=sum+r*r*r;
		}
		if(sum==org)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println(" not Armstrong");
		}
	}
}