import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int max=arr[0];
    int index_of_max=0;
    for (int index=1;index<arr.length;index++)
    {
    if (arr[index]>max)
    {
    max=arr[index];
    index_of_max=index;
    }
    }
    System.out.println(index_of_max);
  }
}