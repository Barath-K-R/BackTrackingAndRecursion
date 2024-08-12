import java.util.ArrayList;

public class count {

	public static int dice(String p,int target) {
		if(target==0)
		{
			return 1;
		}
		int count=0;
		
		for(int i=1;i<=6 && i<=target;++i) {
			
			count=count+dice(p+i, target-i);
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int target=4;
        ;
        System.out.println(dice("",target));
       
	}

}
