#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    int reminder1 = (n%10);
    n = n/10;
    int reminder2 = (n%10);
    n = n/10;
    int reminder3 = (n%10);
    n = n/10;
    int reminder4 = (n%10);
    n = n/10;
    int reminder5 = (n%10);
    n = n/10;
    int final = (reminder1+reminder2+reminder3+reminder4+reminder5);
    printf("%d\n",final);

    return 0;
}