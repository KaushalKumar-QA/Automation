package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacterInString_UsingMap {

	public static void main(String[] args) {
		
		String str = "Hellowjava";
		
		char [] arr = str.toCharArray();
		
		Integer count = 1;
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
				
			}
			else
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		//printing the character of the map.
		 for(Character x : map.keySet())
		 {
			 System.out.println("The character count of the string are " + x + " = : "+ map.get(x));
		 }
		
		

	}

}
