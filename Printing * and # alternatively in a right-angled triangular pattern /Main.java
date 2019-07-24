#include <stdio.h>
int main(){
	// Type your code here
  int n,i,j,c=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      c=c+1;
      if(c%2==0)
        printf("#");
      else
        printf("*");
    }
    printf("\n");
  }
  	return 0;
}