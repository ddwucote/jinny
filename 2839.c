#include<stdio.h>
int main ()
{
	int n;
	int kg5, kg3;
	
	scanf("%d",&n);

	for (int kg3 = 0; kg3 <= n/3; kg3++) 
	{
		
		int left = n - kg3 * 3;
		if (left % 5 == 0) {
			kg5 = left / 5;
			printf("%d\n", kg5 + kg3);
			return 0;
		}
		
		
		
	}
    printf("-1\n");
}
