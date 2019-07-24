#include <stdio.h>
int main() {
	//Type your code
  int n,i,count=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d",i);
    count++;
    if(count%3==0)
      printf(",");
  }
    
  
	return 0;
}