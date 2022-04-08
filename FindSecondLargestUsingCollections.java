package Week3Day3;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargestUsingCollections {
	public static void main(String[] args) 
	{
		Integer[] arr= new Integer[]{3,2,15,4,6,7};
		Arrays.sort(arr);
		
		List<Integer> mylist=Arrays.asList(arr);
		
	System.out.println(mylist.get(mylist.size()-2));
		
	}

}
