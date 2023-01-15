import java.util.*; 
import java.io.*;

class Main {

  public static void ArrayChallenge(int[] arr) {
    // code goes here  
    int n = arr.length;
    //int abs[] = new int[n];
    String s;
    int sum = arr[0];
    int c=0;
    for(int i=1;i<n;i++)
      {
        //ArrayList<int> al = ArrayList<int> ();
        //ArrayList<Integer> al = new ArrayList<Integer>();
        for(int j=i+1;j<n;j++)
          {
            if(arr[i] + arr[j] == sum)
            {
              System.out.print(arr[i]+","+arr[j]+" ");
              c=1;
            }
          }
        if(i == (n-1) && c==0)
        {
          System.out.println("-1");
        }
      }
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    String st = s.next();
    String[] str = st.split(",");
    //System.out.println(str);
    for(int i=0;i<n;i++)
      {
        a[i] = Integer.parseInt(str[i]);
      }
    Main m = new Main();
    ArrayChallenge(a);
    //System.out.print(ArrayChallenge(s.nextLine())); 
  }

}