#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int num,result,i;
  cin>>num;
  int arr[num],temp=0;
  for(i=0;i<num;i++)
  {
    cin>>arr[i];
  }
  cin>>result;
  for(i=0;i<num;i++)
  {
    if(result==arr[i])
    {
      temp++;
      break;
    }
  }
  if(temp==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  
  
}