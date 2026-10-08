#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char *s;
    s = malloc(1024 * sizeof(char));
    scanf("%[^\n]", s);
    s = realloc(s, strlen(s) + 1);
    
    int word_started = 0; 
    
    for (int i = 0; s[i] != '\0'; i++)
    {
      
        if (s[i] == ' ' && s[i+1] != ' ' && s[i+1] != '\0' && word_started)
        {
            printf("\n");
        }
        else if (s[i] == ' ')
        {
            continue; 
        }
        else
        {
            printf("%c", s[i]);
            word_started = 1; 
        }
    }
    
    return 0;
}