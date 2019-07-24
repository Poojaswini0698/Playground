#include <stdio.h>
int main()
{
   
  int n,c,j,k,i,m=0;
  scanf("%d",&n);
 c=(n*2)+2;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<(c/2-i);j++)
    {
      printf(" ");
    }
    for(k=1;k<=i;k++)
    {
      m++;
      printf("%d ",m);
    }
    printf("\n");
  }
   return 0;
}
  
