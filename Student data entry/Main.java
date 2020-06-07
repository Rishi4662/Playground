#include <iostream>
using namespace std;

struct student
{
    char name[100];
    int roll;
    float marks;
}s;

int main() 
{
     
    gets(s.name); 
    cin >> s.roll;
    cin >> s.marks;

    cout << "\nStudent Details" << endl;
    cout << "Name: " << s.name << endl;
    cout << "Roll: " << s.roll << endl;
    cout << "Marks: " << s.marks << endl;
    return 0;
}