#include <stdio.h>

int i =257;
short s=257;
char c='A';


struct alignment1{
char c;
int i;
}a[2];

int main(){

char *p= (char *) &i;

a[0].c='B';
a[0].i= 257;
a[1].c='C';
a[1].i=257;

for(int e=0; e<44; e++){
printf("%i\n", p[e]);
}

return 0;
}
