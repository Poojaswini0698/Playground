#include<stdio.h>
int main()
{
//Try out your code here
  int n,i,j,k,c,b,s,count,bount;
  scanf("%d",&n);
  c=(2*n)+2;
  s=(n/2)+1;
  b=(n/2)+1;
  if(n==7){
  for(i=b;i>1;i--)
  {
    for(j=(c/2)-i;j>4;j--)
    {
      printf(" ");
    }
    count=0;
    for(k=(2*i)-1;k>=1;k--)
    {
      
      count++;
      if(count==1)
      printf("*");
      else if(count==5 && i==3)
        printf("*");
      else if(count==3 && i==2)
        printf("*");
      else if(count==7 && i==4)
        printf("*");
      else
        printf(" ");
    }
    printf("\n");
  }
   for(i=1;i<=s;i++)
  {
    for(j=4;j<(c/2)-i;j++)
    {
      printf(" ");
    }
     bount=0;
    for(k=1;k<=(2*i)-1;k++)
    {
      bount++;
      if(bount==1)
      printf("*");
      else if(bount==5 && i==3)
        printf("*");
      else if(bount==3 && i==2)
        printf("*");
      else if(bount==7 && i==4)
        printf("*");
      else
        printf(" ");
    }
    printf("\n");
  }
  }
  else
  {
     for(i=b;i>1;i--)
  {
    for(j=(c/2)-i;j>3;j--)
    {
      printf(" ");
    }
    count=0;
    for(k=(2*i)-1;k>=1;k--)
    {
      
      count++;
      if(count==1)
      printf("*");
      else if(count==5 && i==3)
        printf("*");
      else if(count==3 && i==2)
        printf("*");
      else if(count==7 && i==4)
        printf("*");
      else
        printf(" ");
    }
    printf("\n");
  }
   for(i=1;i<=s;i++)
  {
    for(j=3;j<(c/2)-i;j++)
    {
      printf(" ");
    }
     bount=0;
    for(k=1;k<=(2*i)-1;k++)
    {
      bount++;
      if(bount==1)
      printf("*");
      else if(bount==5 && i==3)
        printf("*");
      else if(bount==3 && i==2)
        printf("*");
      else if(bount==7 && i==4)
        printf("*");
      else
        printf(" ");
    }
    printf("\n");
  } 
  }
return 0;
}
