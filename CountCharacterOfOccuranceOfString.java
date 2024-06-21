package StringProblems;

public class CountCharacterOfOccuranceOfString {

	public static void main(String[] args) {
		 String str = "Java is object oriented language";
		 String [] arr =str.split(" ");
		 
		  for(int i= arr.length-1;i>=0;i--)
		  {
			  System.out.print(arr[i]+ " ");
		  }
//		 StringBuilder sb = new StringBuilder();
//		          sb.append(arr);
//		          sb.reverse();
//		          sb.toString();
//		 System.out.println(sb);
//	 int result= str.length()-str.replaceAll("J", "").length();
		 
//		 System.out.println(result);

	}

}
