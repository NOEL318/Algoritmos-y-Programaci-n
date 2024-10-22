#include <stdio.h>

int g=1;
int g2=2;
int g3=3;

int main(){
int l=3;
int l1=2;
int l3=1;


printf("Size of g: %d\n", sizeof(g));  
printf("Size of g: %d\n", sizeof(int));



printf("Variable G1: %p\n", &g);
printf("Variable G2: %p\n", &g2);
printf("Variable G3: %p\n", &g3);
printf("Variable L3: %p\n", &l3);
printf("Variable L2: %p\n", &l1);
printf("Variable L: %p\n", &l);

return 0;
}
