import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
      arr[i]=in.nextInt();
      }
      int value=in.nextInt();
      perfect_couple(n,arr,value);
    }
  public static void perfect_couple(int n,int arr[],int value)
  {
  for(int i1=0;i1<=n-1;i1++)
  {
  for(int i2=i1+1;i2<=n-1;i2++)
  {
  int sum = arr[i1]+arr[i2];
  if (sum == value)
  {
  System.out.println(arr[i1]+ "," + " " + arr[i2]);
  }
  }
  }
  }
}