#include<stdio.h>
void main()
{
    int n,count,k,j;
    scanf("%d", &n);
    int arr[n];
  scanf("%d",&k);
    for(int idx = 0; idx <= n - 1; idx++)
    {
      scanf("%d", &arr[idx]);
    }
 
    
    selection_sort(n, arr);
  for(j=1;j<=k;j++)
  {
    count=0;
    for(int i=0; i<n; i++)
    {
      if(arr[i]==j)
      {
        count++;
      }
    }
    printf("%d %d\n",j,count);
  }
}
  
void selection_sort(int n, int arr[])
{
    for(int start_idx = 0; start_idx <= n - 2; start_idx++)
    {
      int min_idx = find_minimun_idx(start_idx, arr, n-1);
      swap(start_idx, min_idx, arr);
    }
}


void swap(int start_idx, int min_idx, int arr[])
{
    int temp = arr[start_idx];
    arr[start_idx] = arr[min_idx];
    arr[min_idx] = temp;
}


int find_minimun_idx(int start_idx, int arr[], int end_idx)
{
    int min_idx = 0;
    if(arr[start_idx] < arr[start_idx + 1])
    {
      min_idx = start_idx;
    }
    else
    {
      min_idx = start_idx + 1;
    }
    for(int i = start_idx + 2; i <= end_idx; i++)
    {
       if(arr[min_idx] > arr[i])
       {
         min_idx = i;
       }
    }
    return min_idx;
}