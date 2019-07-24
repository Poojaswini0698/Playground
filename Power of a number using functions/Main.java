import java.io.*;
import java.util.*;
class Main{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int v=1;
    int b=sc.nextInt();
    while(b!=0){
      v*=a;
      b--;
    }
    System.out.println(v);
  }
  
}