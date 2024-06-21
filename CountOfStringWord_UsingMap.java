package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class CountOfStringWord_UsingMap {

	public static void main(String[] args) {
		
		String str = "I am Learning Learning Java Program";
		 String [] arr = str.split(" ");
		
		 
		 Integer count =1;
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 
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
		 
		 //Printing the output of the map
		 
		 for(String x: map.keySet())
		 {
			 System.out.println("The count of the word " + x + " = "+ map.get(x) );
		 }

	}

}
