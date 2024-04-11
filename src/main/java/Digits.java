import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num){
		//digitList=new ArrayList<Integer>();
		int i=num;
while(i/10>0){
	digitList.add(0,i%10);
	i=i/10;
}
digitList.add(0,i);
	
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
for(int i=0;i<digitList.size()-1;i++)
	if(digitList.get(i)>=digitList.get(i+1))
		return false;
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
