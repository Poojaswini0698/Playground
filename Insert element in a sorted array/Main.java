#include<stdio.h>
int main()
{
 //Type your code here
  int n;
  scanf("%d",&n);
  int a[n],i,s,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&s);
  for(i=0;i<n;i++)
  {
    if((s>a[i])&&(s<a[i+1]))
       {
         printf("%d ",a[i]);
         printf("%d ",s);
      	for(j=i+1;j<n;j++){
          printf("%d ",a[j]);}
       }
    else if(s<a[0]){
      printf("%d ",s);
      for(j=0;j<n;j++){
        printf("%d ",a[j]);
      }
      break;
    }
    else
      printf("%d ",a[i]);
  }
  return 0;
}