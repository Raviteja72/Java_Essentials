import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	    int i1=190,i2=267,i3=853,ans=0;
	    int u1=i1%10,u2=i2%10,u3=i3%10;
	    int t1=(i1%100)/10,t2=(i2%100)/10,t3=(i3%100)/10;
	    int h1=i1/100,h2=i2/100,h3=i3/100;
	    int u_m = Math.min(Math.min(u1,u2),u3);
	    int t_m = Math.min(Math.min(t1,t2),t3);
	    int h_m = Math.min(Math.min(h1,h2),h3);
	    int u_max = Math.max(Math.max(u1,u2),u3);
	    int t_max = Math.max(Math.max(t1,t2),t3);
	    int h_max = Math.max(Math.max(h1,h2),h3);
	    int maxy = Math.max(Math.max(u_max,t_max),h_max);
	    System.out.println(maxy*1000+h_m*100+t_m*10+u_m);
		
	}
}
