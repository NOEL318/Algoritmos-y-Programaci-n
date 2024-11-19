#include <stdio.h>
#include <stdlib.h>
struct node
{
	char value;
	struct node *link;
};
int main(){
	struct node *head= malloc(sizeof(struct node));
	head->value = 'A';
	head->link = NULL;
	struct node *point = malloc(sizeof(struct node));
	point->value = 'G';
	point->link = NULL;
	struct node *sample = malloc(sizeof(struct node));
	sample->value = 'F';
	sample->link = NULL;
	point->link = sample;
	head->link = point;
	printf("LINKS: %p _____ %p ______ %p \n", head-> link, point->link, sample->link);
	printf("Addresses: %p _____ %p ______ %p \n", &head->value, &point->value, &sample->value);
	point = head;
	while (point !=NULL){
		printf("%p _____ %c \n", point->link , point->value);
		point = point->link;
	}
	return 0;
}


