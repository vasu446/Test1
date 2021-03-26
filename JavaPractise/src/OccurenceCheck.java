import java.util.ArrayList;

public class OccurenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,2,5,3,4,2,3,4,5,5,6,8,8,8,8,8,8};
		
		ArrayList<Integer> list1= new ArrayList<Integer>();
		
		int k;
		for(int i=0; i<arr1.length;i++)
		{
			k=0;
			if(!list1.contains(arr1[i]))
			{
				list1.add(arr1[i]);
				k++;
				
				for(int j=i+1;j<arr1.length;j++)
				{
					if(arr1[i]==arr1[j])
					{
						k++;
					}
				}
				System.out.println("The Number "+arr1[i]+" Repeated "+k+" Times") ;
				
			}
		}

	}

}
