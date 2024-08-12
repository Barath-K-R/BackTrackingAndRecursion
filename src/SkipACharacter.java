
public class SkipACharacter {

	public static String skip(String ans,String s) {
		if(s.isEmpty())
			return ans;
		if(s.charAt(0)=='a') {
			return skip(ans, s.substring(1));
		}
		else {
			
			ans=ans+s.substring(0,1);
		    return skip(ans, s.substring(1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="baaaaacsssd";
		System.out.println(skip("", s));
  
	}

}
