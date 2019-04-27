import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=n-1;
      for(int k=1;k<=n;k++)
      {
      for(int i=1;i<=count;i++)
      System.out.print(" ");
      count--;
      for(int j=1;j<=(2*k-1);j++)
      System.out.print("*");
      System.out.println();
      }
	}
}