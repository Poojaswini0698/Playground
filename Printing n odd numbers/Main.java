#include <stdio.h>
int main() {
	//Type your code
 int n,i,N;
  scanf("%d",&n);
  N=n*2;
  for(i=1;i<=N;i++){
    if(i%2!=0)
      printf("%d\n",i);
  }
     
	return 0;
}