#include<stdio.h>
#include<stdlib.h>

// ! Defines pDR(previous Data Record) as Pointer
// ! Defines equal(To link to equal registers) as Pointer
// ! Defines NDR(Next Data Record) as Pointer
// ! Defines id() as Integer

struct Node
{
	struct Node *pDR;
	struct Node *equal;
	int id;
	struct Node *NDR;
};

int main(){

	return 0;
}

//B+ extra codes

//TYPE CHAR
// OBJECT[] KEYS;
// OJECT[] REFERENCES;
// insert (int key, Object Value)
// Object search(int key)
// Object delete(int key)