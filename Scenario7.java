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
		s1 = new String("Python");
		s2 = new String("Python");
		String s3 = new String("Python");
		
		if(s1==s2 && s1==s3 && s2==s3)
		{
			System.out.println("==");
		}
		else
		{
			System.out.println("Not ==");
		}
		
		if((s1.equals(s2))&&(s1.equals(s3))&&(s2.equals(s3)))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("Not equals");
		}
	}
}