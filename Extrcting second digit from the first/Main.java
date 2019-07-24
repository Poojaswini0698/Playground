#include <stdio.h>
int main() {
	//Type your code
  int n,r,p;
  scanf("%d",&n);
  if(n>100)
  {
      p=n/1000;
    r=p%10;
    
  }
  
  else{
    r=n%10;
  }
  printf("%d",r);
    
	return 0;
}