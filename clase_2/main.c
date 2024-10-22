#include <stdio.h>
int g=1;

int main(){
char * p =(char *) &g;

printf("Byte 1 %i\n",*(p+0));
printf("Byte 2 %i\n",*(p+1));
printf("Byte 3 %i\n",*(p+2));
printf("Byte 4 %i\n",*(p+3));

*(p+1)=1;

printf("Byte 1 %i\n",*(p+0));
printf("Byte 2 %i\n",*(p+1));
printf("Byte 3 %i\n",*(p+2));
printf("Byte 4 %i\n",*(p+3));


printf("Variable G: %p\n", &g);
printf("Pointer Size p: %u\n", sizeof(p));
printf("Pointer Size g: %u\n", sizeof(g));

return 0;
}
