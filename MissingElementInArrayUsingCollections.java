package Week3Day3;

import java.util.Arrays;
import java.util.List;

public class MissingElementInArrayUsingCollections {
	public static void main(String[] args) 
	{
		Integer[] arr= new Integer[]{0,2,3,4,6,7,9};
		
		//convert the array to list
		List<Integer> mylist=Arrays.asList(arr);
			
		for(int i=0;i<mylist.size()-1;i++)
		{
			
				if(mylist.get(i)+1!=mylist.get(i+1))
				{
				System.out.println(mylist.get(i)+1)	;
				
				
			}
	}

	}
}
