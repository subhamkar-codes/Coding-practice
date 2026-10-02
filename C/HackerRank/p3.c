#include <stdio.h>

int main(){
    int a;
    int b;
    float c;
    float d;

    scanf ("%d" , &a);
    scanf("%d" , &b);
    scanf ("%f" , &c);
    scanf("%f" , &d);


    int sum = a + b;
    int diff = a - b;
    float sum2 = c + d;
    float diff3 = c - d;


    

    printf("%d %d\n", sum ,diff);
    printf("%0.1f , %0.1f\n", sum2 ,diff3);
    return 0;
}