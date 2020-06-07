#include <stdio.h>
 
int main()
{
  int Number, Sum, Reminder;
 
 
  scanf("%d", &Number);
 
  while(Number >= 10)
  {
    for (Sum=0; Number > 0; Number= Number/10)
    {
      Reminder = Number % 10;
      Sum=Sum + Reminder;  
    }
    if(Sum >= 10)
    {
      Number = Sum;
    }
    else
    {
      printf("%d", Sum);
      return 0;
    }
  } 
}