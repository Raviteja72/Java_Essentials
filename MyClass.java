import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      String s1=s.next();
      String s2=s.next();
      int c=0;
      if(s1.length() == s2.length())
      {
          for(int i=0;i<s1.length();i++)
          {
              for(int j=0;j<s2.length();j++)
              {
                  if(s1.charAt(i) == s2.charAt(j))
                  {
                      c=c+1;
                  }
              }
          }
      }
      else
      {
          System.out.println("NO");
          System.exit(0);
      }
      if(c==s1.length())
      {
          System.out.println("YES");
      }
      else
      {
          System.out.println("NO");
      }
      }
}