#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int j=n-1;j>=0;j--)
  {
    for(int k=0;k<j;k++)
    {
      if(a[k]>a[k+1]){
      int temp=a[k];
        a[k]=a[k+1];
        a[k+1]=temp;
      }
    }
  }
  for(int i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
  return 0;
}