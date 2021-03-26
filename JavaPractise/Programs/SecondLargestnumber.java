import java.util.Arrays;

public class SecondLargestnumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int arr[]= {10,60,30,50,40,20};
		int n=arr.length;
		System.out.println(n);
		Arrays.sort(arr);
		if(n<2)
		{
			System.out.println("Invalid input");
		}
		for (int i=0;i<n;i++)
		{
		System.out.println(arr[i]);	
		}
		for (int j=n-2;j>=0;j--)
		{
			if(arr[j]!=arr[n-1])
			{
				System.out.println(arr[j]);
				break;

			}
		}
		
		}

}
