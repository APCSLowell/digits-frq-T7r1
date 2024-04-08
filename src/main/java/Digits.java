import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num){
		int i=num;
while(i/10>0){
	digitList.add(i%10);
	i=i/10;
}
digitList.add(i);
	
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
for(int i=0;i<digitList.size();i++)
	if(digitList.get(i)>=digitList.get(i+1))
		return false;
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
