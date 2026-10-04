#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.



void calculate_the_maximum(int n, int k) {
    int max_and = 0;
    int max_or = 0;
    int max_xor = 0;
    
    // Loop through all possible pairs (a, b) where a < b
    for (int a = 1; a <= n; a++) {
        for (int b = a + 1; b <= n; b++) {
            
            // Perform the bitwise operations
            int and_res = a & b;
            int or_res = a | b;
            int xor_res = a ^ b;
            
            // Check and update max for AND
            if (and_res < k && and_res > max_and) {
                max_and = and_res;
            }
            
            // Check and update max for OR
            if (or_res < k && or_res > max_or) {
                max_or = or_res;
            }
            
            // Check and update max for XOR
            if (xor_res < k && xor_res > max_xor) {
                max_xor = xor_res;
            }
        }
    }
    
    // Print the final maximum results on separate lines
    printf("%d\n", max_and);
    printf("%d\n", max_or);
    printf("%d\n", max_xor);
}


int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
