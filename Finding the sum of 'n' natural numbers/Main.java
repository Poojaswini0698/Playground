#include <stdio.h>
int sum(int n);
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int s=sum(n);
  printf("%d",s);
  return 0;
}
int sum(int n)
{
  if(n==0)
    return 0;
  else
    return n+sum(n-1);
}