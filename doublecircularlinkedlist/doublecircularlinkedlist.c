// NOTE:DOUBLE CIRCULAR LINKED LIST
#include <stdio.h>
#include <stdlib.h>
struct node
{
	char value;
	struct node *prev;
	struct node *next;
};
int main()
{
	struct node *head = malloc(sizeof(struct node));
	head->value = 'A';
	head->prev = NULL;
	head->next = NULL;

	struct node *point = malloc(sizeof(struct node));
	point->value = 'G';
	point->prev = NULL;
	point->next = NULL;

	struct node *sample = malloc(sizeof(struct node));
	sample->value = 'F';
	sample->prev = NULL;
	sample->next = NULL;

	head->prev = point;
	head->next = sample;

	point->prev = sample;
	point->next = head;

	sample->prev = head;
	sample->next = point;


	printf("HEAD NODE:%p _%c_ %p\n", head->prev, head->value, head->next);
	printf("POINT NODE:%p _%c_ %p\n", point->prev, point->value, point->next);

	printf("ADDRESSES: %p _____ %p\n", &head->value, &point->value);

	point = head;
	do
	{
		printf("%c\n", point->value);
		point = point->next;
	} while (head != point);
	return 0;
}
