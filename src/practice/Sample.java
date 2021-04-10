package practice;
import java.lang.reflect.Array;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="lakshmi";
		System.out.println(reverse(word));
	}

	private static String reverse(String word) 
	{
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		//String reverse = null;
		for(int i=word.length()-1;i>=0;i--)
		{
			sb.append(word.charAt(i));	
			// reverse=sb.toString();
			
		}
		return sb.toString();
		
	}

}
