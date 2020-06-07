#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n1,n2;
  cin>>n1>>n2;
  int small=0;
  int gcd =0;
  if(n1<n2)
  {
    small=n1;
  }
  else{
    small=n2;
  }
  while(small>=1)
  {
    if(n1%small==0&&n2%small==0)
    {
      gcd=small;
      break;
    }
    small--;
  }
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd;
  return 0;
}