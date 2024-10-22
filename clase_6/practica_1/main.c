#include <stdio.h>

#define N 10
#define CHAR_NULL '\0'

void push(char *S, int * top, char x);
char pop(char * S, int * top);


int main(){




return 0;
}


void push(char *S, int * top, char x){
if(*top >=N){
printf("Full Stack\n");

}else{
S[*top]=x;
*top= *top + 1;
}
}


void pop(char * S, int * top){


}
