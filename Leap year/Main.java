#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  if((n%4==0)&&(n%100!=0)||(n%400==0))
    printf("Leap year");
  else
    printf("Not Leap year");
  return 0;
}