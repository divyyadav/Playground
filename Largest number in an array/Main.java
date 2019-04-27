import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int n,max;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      max=arr[0];
      for(int i=0;i<n;i++)
      {
        if(max<arr[i])
        {
          max=arr[i];
        }
      }
      System.out.println(max);
    }
}