#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char c;
    scanf ("%c",&c);
   char name [50];
   scanf ("%s" ,&name);
   scanf ("%*c");
   char data [100];
   fgets(data, sizeof(data), stdin);
   printf("%c\n",c);
   printf("%s\n",name);
   printf("%s\n",data);    
    return 0;
}