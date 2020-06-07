#include <stdio.h>

// Function to find n'th Fibonacci number
int fib(int n)
{
	if (n <= 1)
		return n;

	return fib(n - 1) + fib(n - 2);
}

// main function
int main()
{
	int n;
  scanf("%d",&n);

	printf("The term %d in the fibonacci series is %d",n, fib(n-1));

	return 0;
}