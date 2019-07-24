#include <stdio.h>
int main() {
	//Type your code
  int n,r,p;
  scanf("%d",&n);
  
  r=n%10;
  if(n>10000)
    n=n/10000;
  else
    n=n/1000;
  p=n+r;
  printf("%d",p);
	return 0;
}