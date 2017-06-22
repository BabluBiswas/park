package Check;

public class Palindrome
{
	private int n;
	public Palindrome(int m)
	{
		n=m;
	}
	public void palindromeCheck()
	{
		int r,q,rev=0,org=n;
		while(n!=0)
		{
			r=n%10;
			q=n/10;
			n=q;
			rev=rev*10+r;
		}
		if(rev==org)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(" not palindrome");
		}
	}
}
	
