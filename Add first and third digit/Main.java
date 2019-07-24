import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=a%10;
      int c=a/100;
      int d=b+c;
      System.out.println(d);
		// Type your code here
	}
}