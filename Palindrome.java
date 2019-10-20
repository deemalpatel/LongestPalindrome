import java.util.*;

public class Main {
		public static void main (String [] args)
		{
		
			System.out.print(longestPalindrome("aac"));
		}
		public static String longestPalindrome(String s) {
			int n = s.length();
			
			if(s.isEmpty() || n == 1)return s;
			
			
			StringBuilder sb = new StringBuilder();
			String palin = "";
			sb.append(s);
			sb.reverse();
			
			if(sb.toString().equals(s)) return s;
			
			String compare = "";
			for(int i = 0; i < n ; i ++)
			{
				compare+=sb.charAt(i);
				for(int j = i+1 ; j < n; j ++)
				{
					compare+=sb.charAt(j);
					if(s.contains(compare) && compare.length() >= palin.length())
					{
						palin = compare;
					}
					else if (!s.contains(compare))
					{
						compare = "";
						break;
					}
					
				}
			}
			
			
			if(palin.isEmpty()) return s.charAt(0)+"";
			
			return palin;
	        
	    }
		
}
		



