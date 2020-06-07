#include<stdio.h>

int main(){

int n,m;

//printf("enter no of rows and columns");

scanf("%d%d",&n,&m);

int a[n][m],i,j;

//printf("enter elements in array");

for(i = 0;i < n;i++){

for(j = 0;j < m;j++){

scanf("%d",&a[i][j]);

}

}

for(i = 0;i < n;i++){

int max = a[i][0];

for(j = 1;j < m;j++){

if(max < a[i][j]) max = a[i][j];

}

printf("%d\n",max);

}

return 0;

}