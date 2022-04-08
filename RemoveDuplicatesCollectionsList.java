package Week3Day3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollectionsList
{

	public static void main(String[] args)
	{
		String text="we learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> mySet = new LinkedHashSet<String>();
		
		for(String word: split)
		{
				mySet.add(word);
						
			}

		Iterator<String> itr = mySet.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
			}
}
