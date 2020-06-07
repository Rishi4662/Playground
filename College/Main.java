#include<iostream>
#include<stdio.h>

#include<bits/stdc++.h>
#include<string.h>
using namespace std;
struct College{char name[100];
              char city[100];
               int establishmentYear;
               float passPercentage;
              }S1[20],temp;
int main(){
  
  
cout<<"Enter the number of colleges\n";
  int n,i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++){
  cout<<"Enter the details of college "<<i+1<<"\n";
  cout<<"Enter name"<<"\n";
  cout<<"Enter city"<<"\n";
  cout<<"Enter year of establishment"<<"\n";
  cout<<"Enter pass percentage"<<"\n";
  scanf("%s %s %d %f",S1[i].name,S1[i].city,&S1[i].establishmentYear,&S1[i].passPercentage);
  }
   for (i = 1; i < n; i++)
      for (j = 0; j < n - i; j++) {
         if (strcmp(S1[j].name, S1[j + 1].name) > 0) {
            temp = S1[j];
            S1[j] = S1[j + 1];
            S1[j + 1] = temp;
         }
      }
 	 printf("Details of colleges\n");
   for (i = 0; i < n; i++) {
      printf("College:%d\nName:%s\nCity:%s\nYear of establishment:%d\nPass percentage:%g\n",i+1,S1[i].name,S1[i].city,S1[i].establishmentYear,ceil(S1[i].passPercentage*100)/100);
   }
  return 0;
}