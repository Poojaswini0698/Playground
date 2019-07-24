#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3,g;
  scanf("%d%d%d",&n1,&n2,&n3);
  g=big(n1,n2,n3);
  printf("%d",g);
  	return 0;
}
int big(int n1,int n2,int n3)
{
  if(n1>n2 && n1>n3)
    return n1;
  else if(n1>n2 && n1<n3)
    return n3;
  else
    return n2;
}