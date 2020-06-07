#include <stdio.h>
#define MAX_SIZE 100

int main()
{
    int arr[MAX_SIZE];
    int i, size, num, pos;

    /* Input size of the array */
    printf("Enter the number of elements in the array\n");
    scanf("%d", &size);

    /* Input elements in array */
    printf("Enter the elements in the array\n");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    /* Input new element and position to insert */
  printf("Enter the location where you wish to insert an element\n");
    scanf("%d", &pos);
   //if(pos > size+1 || pos <= 0)
    //{
      //  printf("Invalid Input", size);
    //}
    
    

    /* If position of element is not valid */
    if(pos > size+1 || pos <= 0)
    {
        printf("Invalid Input", size);
    }
    else
    {
        /* Make room for new array element by shifting to right */
      printf("Enter the value to insert\n");
    scanf("%d", &num);
        for(i=size; i>=pos; i--)
        {
            arr[i] = arr[i-1];
        }
        
        /* Insert new element at given position and increment size */
        arr[pos-1] = num;
        size++; 

        /* Print array after insert operation */
        printf("Array after insertion is\n");
        for(i=0; i<size; i++)
        {
            printf("%d\n", arr[i]);
        }
    }

    return 0;
}