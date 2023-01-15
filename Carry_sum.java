import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String num1="1234",num2="766";
		int carry=0,sum=0;
		ArrayList<Integer> arr=new ArrayList();
		int r1 = Integer.parseInt(num1),r2=Integer.parseInt(num2);
		while(r1>0 && r2>0)
		{
		    sum = r1%10 + r2%10 + carry;
		    if(sum>=10)
		    {
		        carry=1;
		        sum = sum%10;
		    }
		    else{carry = 0;}
		    arr.add(sum);
		    r1 = r1/10;
		    r2=r2/10;
		}
		int min_val = Math.min(r1,r2);
		while(min_val > 0)
		{
		    sum = sum%10 + carry;
		    if(sum>=10)
		    {
		        carry = 1;
		        sum = sum%10;
		    }
		    else{carry = 0;}
		    arr.add(sum);
		    min_val = min_val/10;
		}
		if(carry==1)
		{
		    arr.add(carry);
		}
		Collections.reverse(arr);
		String ans="";
		for(int i=0;i<arr.size();i++)
		{
		    ans += Integer.toString(arr.get(i));
		}
		int res = Integer.parseInt(ans);
		System.out.println(res);
	}
}
