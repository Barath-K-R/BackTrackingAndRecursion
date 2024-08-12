import java.util.ArrayList;

public class LetterCombinationOfaPhoneNumber {

	public static ArrayList<String> solution(String p,String up) {
		if(p.isEmpty() && up.isEmpty())
		{
			ArrayList<String>internArrayList=new ArrayList<String>();
			return internArrayList;
		}
		if(up.isEmpty()) {
			ArrayList<String>internal=new ArrayList<String>();
			internal.add(p);
			return internal;
		}
		int digit=Integer.parseInt(up.substring(0,1));
		ArrayList<String>outer=new ArrayList<String>();
		int start=((digit-1)*3)-3,end=(digit-1)*3;
		if(digit>6) {
			if(digit==7) {
				start=((digit-1)*3)-3;
				end=((digit-1)*3)+1;
			}
			else if(digit==8){
				start=(((digit-1)*3)+1)-3;
				end=((digit-1)*3)+1;
			}
			else {
				start=(((digit-1)*3)+1)-3;
				end=((digit-1)*3)+2;
			}
		}
		
		for(int i=start;i<end;++i) {
			char ch=(char)('a'+i);
			outer.addAll(solution(p+ch, up.substring(1)));
		}
		return outer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="34";
        System.out.println(solution("", s));
	}

}
