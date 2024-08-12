
public class SKipAString {

	public static String skip(String s) {
		if(s.isEmpty())
			return "";
		if(s.startsWith("apple")) {
			return skip(s.substring(5));
		}
		else {
			return s.substring(0,1)+skip(s.substring(1));
		}
	}
	public static void main(String[] args) {
		String s="badapplefg";
		System.out.println(skip(s));

	}

}
