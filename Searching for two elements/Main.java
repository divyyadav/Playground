import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int search_elem_1=in.nextInt();
      int search_elem_2=in.nextInt();
      int elem_1_i=-1;
      int elem_2_i=-1;
      for(int i=0;i<=n-1;i++)
      {
        if(search_elem_1==arr[i])
        {
          elem_1_i=i;
        }
        if(search_elem_2==arr[i])
        {
          elem_2_i=i;
        }
      }
      System.out.println(elem_1_i);
      System.out.println(elem_2_i);
         
          
    }
}