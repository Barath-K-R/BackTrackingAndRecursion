import java.util.ArrayList;

public class DiceThrow {

	public static ArrayList<String> dice(String p,int target) {
		if(target==0)
		{
			ArrayList<String>internal=new ArrayList<String>();
			internal.add(p);
			return internal;
		}
		ArrayList<String>outer=new ArrayList<String>();
		
		for(int i=1;i<=6 && i<=target;++i) {
			
			outer.addAll(dice(p+i, target-i));
			
		}
		return outer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int target=4;
        ArrayList<String>reStrings= dice("",target);
        System.out.println(reStrings);
       
	}

}
