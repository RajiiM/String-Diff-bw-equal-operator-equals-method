//Output
Not ==
Not equals
//

public class Sample 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Java");
		String s2 = "Java";
		s1 = null;
		
		if(s1==s2)
		{
			System.out.println("==");
		}
		else
		{
			System.out.println("Not ==");
		}
		
		if(s2.equals(s1))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("Not equals");
		}
	}
}