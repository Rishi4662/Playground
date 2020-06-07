#include<iostream>
using namespace std;
struct employee
{
  char name[50];
  int employee_id,age,salary;
  char designation[50];
}e;


int main()
{
  gets(e.name);
  cin>>e.employee_id>>e.age>>e.designation>>e.salary;
  cout<<"Enter name:\n";
cout<<"Enter ID:\n";
cout<<"Enter age:\n";
cout<<"Enter designation:\n";
cout<<"Enter Salary:\n";
  cout<<"Employee Details\n";
   cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.employee_id<<endl;
 
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.designation<<endl;
  cout<<"Salary of the Employee : "<<e.salary;
}