package Week3Day3;

import java.util.Arrays;
import java.util.List;

public class PrintDuplicatesinCollection 
{
	public static void main(String[] args) 
	{
	//declaring integer array as object
	Integer[] arr= new Integer[]{3,2,11,4,6,7,2,3};
	
	//convert the array to list
	List<Integer> mylist=Arrays.asList(arr);
		
	for(int i=0;i<mylist.size();i++)
	{
		for(int j=i+1;j<mylist.size();j++) {
			
			if(mylist.get(i)==mylist.get(j))
			{
			System.out.println(mylist.get(j))	;
			}
		}
	}
}
}