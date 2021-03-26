
public class Charcount
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str="srinivas s a";
		String str1="@@@@@@@@@@@@";
	    boolean Found=false;
		int p=1;
		int k =1;
		char array1[]=str.toCharArray();
		char array2[]=str1.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		k=1;
		Found=false;
		if (array1[i]==' ')
		{
			continue;
		}
			for(int j=i+1;j<str.length();j++)
			{
				
				if(array1[i]==array1[j])
				{
					k=k+1;
				
				}
			}
			for(int l=1;l<str.length();l++)
			{
				if(array1[i]== array2[l])
				{
					Found=true;
					continue;
				
				}
			}
			if (Found==false)
			{
				array2[p]=array1[i];
				p++;
				System.out.println("The letter is "+array1[i]+" and the matching count is "+k);
				Found=true;
			}
			
			
		}
		
		
	}
	
}
