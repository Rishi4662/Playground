#include <iostream>

#include<string.h>
using namespace std;

struct student
{
    char name[50];
    char department[50];
    int year;
  	float cgpa;
};

void sorte(struct student s[],int n){
  struct student t;
  	for(int i=0;i<n;i++){
     	for(int j=i+1;j<n;j++){
          if(strcmp(s[i].name,s[j].name)>0){
            t=s[i];
            s[i]=s[j];
            s[j]=t;
          }
        }
    }
}

int main()
{
  int number;
    cout << "Enter the number of students" << endl;
  	cin>>number;
    student s[number];

    // storing information
    for(int i = 0; i < number; ++i)
    {
      	cout<<"Enter the details of student "<<i+1<<endl;
        cout<<"Enter name"<<endl;
      	cin>>s[i].name;
      	cout<<"Enter department"<<endl;
      	cin>>s[i].department;
		cout << "Enter year of study"<<endl;
        cin >> s[i].year;
        cout << "Enter cgpa"<<endl;
        cin >> s[i].cgpa;
    }
	sorte(s,number);
    cout << "Details of students" << endl;

    // Displaying information
    for(int i = 0; i < number; ++i)
    {
        cout<<"Student "<<i+1<<endl;
      	cout<<"Name:"<<s[i].name<<endl;
      	cout<<"Department:"<<s[i].department<<endl;
		cout <<"Year of study:"<< s[i].year<<endl;
        cout<<"CGPA:"<<s[i].cgpa<<endl;
    }

    return 0;
}