#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int n;
    scanf("%d", &n);
    
    int len = 2 * n - 1;
    
   
    for (int i = 0; i < len; i++) {
        
        for (int j = 0; j < len; j++) {
            
            
            int min1 = i < j ? i : j;
            int min2 = (len - 1 - i) < (len - 1 - j) ? (len - 1 - i) : (len - 1 - j);
            int min_val = min1 < min2 ? min1 : min2;
            
           
            printf("%d ", n - min_val);
        }
       
        printf("\n");
    }
    
    return 0;
}