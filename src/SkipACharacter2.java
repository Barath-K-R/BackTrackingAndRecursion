
public class SkipACharacter2 {

	public static String skip(String s) {
		if(s.isEmpty())
			return "";
		if(s.charAt(0)=='a') {
			return skip(s.substring(1));
		}
		else {
			return s.substring(0,1)+skip(s.substring(1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="baacaadfsaaf";
        System.out.println(skip(s));
	}

}
