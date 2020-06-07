#include<iostream>
using namespace std;
int main()
{
  int num1,num;
  cin>>num1>>num;
  int mat[num1][num];
  int mat1[num1][num];
  for(int i=0;i<num1;i++)
  {
    for(int j=0;j<num;j++)
    {
      cin>>mat[i][j];
    }
  }
  for(int i=0;i<num1;i++)
  {
    for(int j=0;j<num;j++)
    {
      cin>>mat1[i][j];
    }
  }
  for(int i=0;i<num1;i++)
  {
    for(int j=0;j<num;j++)
    {
      cout<<mat[i][j]+mat1[i][j]<<" ";
    }
    cout<<"\n";
  }
}