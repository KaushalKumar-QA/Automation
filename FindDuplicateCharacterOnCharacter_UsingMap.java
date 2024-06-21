package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacterOnCharacter_UsingMap {

	public static void main(Character[] args) {
		
		    String str = "laptop";
		    
		    char [] arr = str.toCharArray();
		    Map<Character, Integer> map = new HashMap<Character,Integer>();
		    Integer count =1;
		    for(int i=0;i<arr.length;i++)
		{
		    if(!map.containsKey(arr[i]))
		    		{
		     map.put(arr[i],count);
 
		}
		    else{
		     map.put(arr[i],map.get(arr[i])+1);
		}
		} 

		for(Character ch: map.keySet())
		{
		  if(map.get(ch)>1)
		{
		  System.out.println("The duplicate Character " +ch + " = "+ map.get(ch));
		}

	}

	}
	}

		
