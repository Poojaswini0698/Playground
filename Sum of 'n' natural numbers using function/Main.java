#include<stdio.h>
int main() {
    // Type your code here
  int n,result;
  scanf("%d",&n);
  result=sum(n);
  printf("%d",result);
  	return 0;
}
int sum(int n){
int i,sum=0;
  for(i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  return sum;
}