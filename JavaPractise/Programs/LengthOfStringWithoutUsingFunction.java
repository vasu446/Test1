
public class LengthOfStringWithoutUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int x=0;
		
		String s1="Hello how are you!!";
		char[] strtoChar=s1.toCharArray();
		int freq[]=new int[s1.length()];
		for(char c:strtoChar)
		{
			i++;
		}
		System.out.println("Actual length with spaces is " +i);
		//Excludes only the leading and trailing spaces
		String trimSpaces=s1.trim();
		System.out.println("After trimming spaces " +trimSpaces);
		
		//char[] trimmedStrtoArray=trimSpaces.toCharArray();
		
		int j=1;
		try {
		for( j=1;;j++)
		
		{
			trimSpaces.charAt(j);
		}
		}
		catch(Exception e)
		
		{
			
		}
System.out.println(j);

	//count the frequency of each character in given string
	
	int a,b;
	
	
	for( a=0;a<s1.length();a++) {
	 freq[a]=1;
		for (b=a+1;b<s1.length();b++)
		{
			if(strtoChar[a]==strtoChar[b])
			{
				freq[a]++;
			}
		}
	}
	
	for (int k=0;k<freq.length;k++)
	
	{
		if(strtoChar[k]!=' '&&strtoChar[k])
		System.out.println(strtoChar[k] + "is" + freq[k]);
	}
}
}


