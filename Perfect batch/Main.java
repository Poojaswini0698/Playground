/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int a[10],n,i,sum=0,count=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=1;i<=3;i++)
  {
   sum+=a[i];
 }
for(i=4;i<=n;i++)
{
  count+=a[i];
}
 
  if(count==sum)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}