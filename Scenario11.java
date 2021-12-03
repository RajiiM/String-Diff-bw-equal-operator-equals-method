//Output
Not ==
Not equals
//

public class Sample 
{
	public static void main(String[] args) 
	{
		String s1 = "Java";
		String s2 = s1 + s1;
		String s3 = "JavaJava";
		 
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