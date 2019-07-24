#include <stdio.h>

	// Type your code here
  int main()
{
   
  int n,c,j,k,i;
  scanf("%d",&n);
  c=(n*2)+2;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<(c/2-i);j++)
    {
      printf(" ");
    }
    for(k=1;k<=(2*i-1);k++)
    {
      printf("*");
    }
    printf("\n");
  }
   return 0;
}
