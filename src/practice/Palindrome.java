package practice;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String word="kayak";
		check(word);
		if(check(word))
		{
			 System.out.println("Is palindrome");
		 }
		 else
		 {
			 System.out.println("not a palindrome");
		 }	 
	}
	private static Boolean check(String word) 
	{
		// TODO Auto-generated method stub
		/*int i = 0;
		int j=word.length()-1;
		while(i<j)
		{
		 if(word.charAt(i) != word.charAt(j))
		
			 return false;
			  i++;
			  j--;
		 
		}
		return true;*/
		
		StringBuilder reverse = new StringBuilder();
		for(int i= (word.length()-1);i>=0; i-- ) {
			
			reverse.append(word.charAt(i));
		}
		if(word.equals(reverse.toString())) {
			return true;
		}
		return false;
	}
	
}
		

