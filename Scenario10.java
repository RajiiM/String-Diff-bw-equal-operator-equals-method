//Output
Not ==
equals
//


public class Sample 
{
	public static void main(String[] args) 
	{
		String s1 = "Jav";
		String s2 = "Java";
		s1 = s1 + "a";
		
		if(s1==s2)
		{
			System.out.println("==");
		}
		else
		{
			System.out.println("Not ==");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("Not equals");
		}
	}
}