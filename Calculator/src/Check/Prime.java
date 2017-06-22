package Check;

public class Prime
{
	private int n;
	public Prime(int m )
	{ 
		n=m;
	}
	public void primeCheck()
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
			if(count==2)
			{
				System.out.println("no. is  Prime");
			}
			else
			{
				System.out.println("no. is not Prime");
					
			}
		
	}
}
