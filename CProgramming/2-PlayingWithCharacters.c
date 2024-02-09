#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


int main() 
{
    char ch ;
    char ca[100];
    char s[100];
    
    scanf("%c\n", &ch);
    scanf("%[^\n]%*c", ca);
    scanf("%[^\n]%*c", s);
    
    printf("%c\n", ch);
    printf("%s\n", ca);
    printf("%s\n", s);
    
    return 0;
}
