#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int num,i,max=0;
  cin>>num;
  int arr[num];
  for(i=0;i<num;i++)
    cin>>arr[i];
  for(i=0;i<num;i++)
  {
 	if(arr[i]>max)
      max=arr[i];
  }
  cout<<max;
  
}