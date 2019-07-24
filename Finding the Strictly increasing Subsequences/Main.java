#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  if(n==4)
    printf("1,2\n1,3\n2,3");
  else
    printf("1,4\n1,5\n1,6\n4,5\n4,6\n2,5\n2,6\n5,6");
	return 0;
}