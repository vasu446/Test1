/**
 * 
 */

/**
 * @author spudhari
 *
 */
public class javaAssg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print( " "+ j);
				
			}
			System.out.println();
		}
		
		
		for(int i=65;i<68;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print( " "+ (char)(j));
				
			}
			System.out.println();
		}
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if((i==2 || i==3) && (j==2 || j==3))
				{
					System.out.print( "  ");
				}
				else
				{
					System.out.print( " "+ "$");	
				}
				
				
			}
			System.out.println();
		}
		

		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if((i!=1 && i!=10) && (j!=1 &&  j!=10))
				{
					System.out.print( "  ");
				}
				else
				{
					System.out.print( " "+ "$");	
				}
				
				
			}
			System.out.println();
		}
		
	}

}
