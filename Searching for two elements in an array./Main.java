#include<stdio.h>
int main()
{
  //Type your code here
  int n,a[10],i,count,mount,c,b,l,m;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    
  }
  scanf("%d%d",&b,&c);
  for(i=0;i<n;i++)
  {
    if(a[i]==b)
    {
      count=i;
      l=i;
    }
  }
  if(count==l)
   printf("%d",count);
  else
    printf("-1");
  
   for(i=0;i<n;i++)
  {
    if(a[i]==c)
    {
      mount=i;
      m=i;
    }
  }
  if(mount==m)
   printf("\n%d",mount);
  else
    printf("\n-1");
  
  return 0;
}