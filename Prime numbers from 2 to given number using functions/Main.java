import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int p;
      int n=in.nextInt();
      for (int i=2;i<n;i++)
      {
      p=0;
      for (int j=2;j<i;j++)
      {
      if(i%j==0)
      p=1;
      }
      if (p==0)
      {
      System.out.println(i);
      }
      }
	}
}