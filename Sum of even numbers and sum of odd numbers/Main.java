#include<iostream>

using namespace std;

int main()

{

int n,sum1=0,sum2=0;

int arr[n];

cin>>n;

int i;

for(i=1;i<=n;i++)

{

cin>>arr[i];

}

for(i=1;i<=n;i++)

{

if(arr[i]%2!=0)

{

sum1=sum1+arr[i];


}

else

{

sum2=sum2+arr[i];

}

}

cout<<"The sum of the even numbers in the array is "<<sum2<<"\n"; 

cout<<"The sum of the odd numbers in the array is "<<sum1;

 }
