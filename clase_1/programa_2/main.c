#include <stdio.h>

int g=1;

int main(){

int l=3;

printf("Size of g: %d\n", sizeof(g));  
printf("Size of g: %d\n", sizeof(int));



printf("Variable G1: %p\n", &g);
printf("Variable L: %p\n", &l);

return 0;
}
