#include <stdio.h>

void update(int *a,int *b) {
    int org_a = *a;
    int org_b = *b ;
    *a = org_a + org_b;
     int diff = org_a - org_b;
     if (diff < 0){
        diff = -diff;
     }
     *b = diff;
    return;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}