#include<stdio.h>
int main()
{
  //Type your code here
  int r,c,s;
  scanf("%d%d",&r,&c);
  int a[r][c],i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  scanf("%d",&s);
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(s==a[i][j]){
        printf("(%d, %d)",i,j);
        s=-1;
      }
    }
   }
  if(s!=-1)
    printf("(-1, -1)");
  
  return 0;
}