#include<iostream>
using namespace std;
int calculatePower(int base, int powerRaised)
{
    if (powerRaised != 0)
        return (base*calculatePower(base, powerRaised-1));
    else
        return 1;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Enter the value of a\n";
  cout<<"Enter the value of n\n";
  cout<<"The value of "<<a<<" power "<<b<<" is "<<calculatePower(a,b);
}