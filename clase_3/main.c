#include<stdio.h>

int main(){
	int m[4][3]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
	printf("M[1,3]: %i\n", m[3][1]);
	char * loc=(char *) &m[0][0] +  sizeof(int)*(2+1)*(3)+(1);
	printf("AM: %p\n", &m[0][0]);
	printf("M[1,3]: %p\n",((long long) &m[3][2])- ((long long) &m[0][0]));
	printf("Matrix Size: %i\n",((long long) loc)- ((long long) &m[0][0]));
	return 0;
}
