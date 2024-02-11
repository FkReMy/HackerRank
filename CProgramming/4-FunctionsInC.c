#include <stdio.h>

int max_of_four(int a, int b, int c, int d){
    int ans = 0;
    if (a>b && b>c && c>d){
    ans = a;
    }
    else if (b>c && c>d){
    ans = b;
    }
    else if (c>d){
    ans = c;
    }
    return ans;
}


int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}