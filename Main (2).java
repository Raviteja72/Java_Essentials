/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int input1=12,input2=1313,input3=122,input4=678,input5=898;
		int arr[]={input1,input2,input3,input4,input5};
		int m_s=100000,m_us=-1,c=0;
		for(int i=0;i<5;i++)
		{
		    c=0;
		    int array[]=new int[10];
		    int num = arr[i];
		    int org = num;
		    while(num!=0)
		    {
		        array[num%10]++;
		        num=num/10;
		    }
		    ArrayList<Integer> freq=new ArrayList();
		    for(int j=0;j<10;j++)
		    {
		        if(array[j]!=0)
		        {
		            freq.add(array[j]);
		        }
		    }
		    for(int k=0;k<freq.size()-1;k++)
		    {
		        if(freq.get(k) == freq.get(k+1))
		        {
		            c++;
		        }
		    }
		    
		    if(c != freq.size()-1)
		    {
		        if(org < m_s)
		        {
		            m_s = org;
		        }

		        if(org > m_us)
		        {
		            m_us = org;
		        }
		    }
		    
		}
		return (m_s+m_us);
	}
}
