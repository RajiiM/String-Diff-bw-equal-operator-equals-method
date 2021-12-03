//Output
Not ==
equals
//

public class Sample 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Java");
		String s2 = s1;
		s2 = "Java";
		
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