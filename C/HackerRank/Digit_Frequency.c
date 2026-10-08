#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    char *s;
    s = malloc(1024 * sizeof(char));
    int arr[10] = {0};

    fgets(s, 1024, stdin);

    for (int i = 0; s[i] != '\0'; i++)
    {
        if (s[i] >= '0' && s[i] <= '9')
        {
            arr[s[i] - '0']++;
        }
    }

    for (int i = 0; i < 10; i++)
    {
        printf("%d ", i, arr[i]);
    }

    free(s);
    return 0;
}