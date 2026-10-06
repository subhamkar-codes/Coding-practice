#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int d;
    scanf("%d", &d);
    int *arr = (int *)malloc(d * sizeof(int));
    
    int sum = 0;
    for (int i = 0; i < d; i++)
    {    
        scanf("%d",&arr[i]);
         sum+= arr[i];
    }
    printf("%d\n" , sum);
    free(arr);

    return 0;
}