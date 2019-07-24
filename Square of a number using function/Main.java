#include<stdio.h>
int main() {
  int n,result;
  scanf("%d",&n);
  result=square(n);
  printf("%d",result);
   return 0;
  
}
int square(n){
  int z=n*n;
  return z;
}