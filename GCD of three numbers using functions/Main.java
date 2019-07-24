#include <stdio.h>
int main() {
	//Type your code here
  int p,q,r,g,gg;
  scanf("%d%d%d",&p,&q,&r);
  g=gcd(p,q);
  gg=gcd(g,r);
  printf("%d",gg);
  
	return 0;
}
int gcd(int a,int b)
{
  int min,gcd;
  if(a<b)
    min=a;
  else
    min=b;
  while(min>=1)
  {
    if((a%min==0)&&(b%min==0))
    {
    gcd=min;
      break;
    }
    min--;
  }
  return gcd;
}