import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n;
      int i,p,r;
      int sum=0;
      int save_n;
      n=in.nextInt();
      save_n=n;
      while(n!=0)
      {
      i=1;
      p=1;
      r=n%10;
      while(i<=r)
      {
      p=p*i;
      i++;
      }
      sum=sum+p;
      n=n/10;
      }
      if (sum==save_n)
      {
       System.out.println("Yes");
      }
      else
      {
      System.out.println("No");
      }
	}
}