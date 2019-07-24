import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int count=0;
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
          System.out.print(arr[i]+" ");
        else
          count++;
      }
      for(int i=0;i<count;i++)
      {
        System.out.print("0 "); 
      }
    }
}