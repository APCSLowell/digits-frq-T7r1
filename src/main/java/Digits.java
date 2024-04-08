import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num){
while(num/10>0){
	digitList.add(num%10);
	num=num/10;
}
digitList.add(num);
	
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
