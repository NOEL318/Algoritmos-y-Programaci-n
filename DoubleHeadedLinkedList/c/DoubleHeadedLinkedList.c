/* Authors: Aldo Solís, Enrique Rocha, Noel Rincón  */
/*    Date: 2024-11-06 01:00  */
#include "DoubleHeadedLinkedList.h"
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

/* TODO: translate and implement the java version of a double head linked list
 * in C. */

/* Function 'new' kind of simulates the new keyword in java  */
/* NOTE: this return value needs to be freed which complicates the program a
 * bit, normally java takes care of it, but in c it does not and you have to do
 * it manually */
node *new_node(node *next, node *prev, char value) {
  node *ret = (struct node *)malloc(sizeof(node));
  ret->prev = prev;
  ret->next = next;
  ret->value = value;
  return ret;
}

/* Function that frees the memory used to implement a linked list  */
/* easily the most time consuming function to implement for us, because we are
 * accustomed to use programming languages with garbage collectors in a daily
 * base */
void free_linkedlist(node *linkedlist) {
  node *tmp = linkedlist->next;
  while (tmp->next != linkedlist) {
    tmp = tmp->next;
    free(tmp->prev);
  }
  free(tmp);
}

/* A function to initialize a node and make a circular headed linked list
 * because I'm lazy */
void init_linkedlist(node *n) {
  n->prev = n;
  n->next = n;
  n->value = '\0';
}

/* inserts node at the end of the list  */
void insert_node(node *linkedlist, char value) {
  if (linkedlist->next == linkedlist) {
    node *var = new_node(linkedlist, linkedlist, value);
    linkedlist->next = var;
    linkedlist->prev = var;
    return;
  }
  node *var = new_node(linkedlist, linkedlist->prev, value);
  linkedlist->prev->next = var;
  linkedlist->prev = var;
}

/* function that displays a message and the contents of a linked list in an
 * ordered manner */
void display_linkedlist(node *linkedlist, char *format) {
  printf("%s", format);
  node *search = linkedlist->next;
  do {
    printf("%c\n", search->value);
    search = search->next;
  } while (search != linkedlist);
}

/* function used to debug the object file produced. */
void display_debug(node *linkedlist) {
  printf("start debug!!!\n");
  node *search = linkedlist;
  do {
    printf("value:\t%c prev:%p this:%p next:%p\n", search->value, search->prev,
           search, search->next);
    search = search->next;
  } while (search != linkedlist);
  printf("end debug!!!\n\n");
}

/* function that deletes a node and free its memory when the first char v is
 * matched */
void delete_node(node *linkedlist, char v) {
  if (linkedlist == linkedlist->next) {
    fprintf(stderr, "Error: List is empty\n");
    return;
  }
  node *search = linkedlist->next;
  while (search != linkedlist) {
    if (search->value == v) {
      search->prev->next = search->next;
      search->next->prev = search->prev;
      free(search);
      return;
    }
    search = search->next;
  }
  fprintf(stderr, "Error: Specified value -> \'%c\' not found\n", v);
}

/* function that inserts a node in alphabetical order */
void insort_node(node *linkedlist, char v) {
  node *search = linkedlist->next;
  while (search != linkedlist) {
    if (v <= search->value) { // in c ascii characters are simply a number of
                              // one byte of lenght and conveniently they are
                              // ordered alphabetically      //
      search->prev->next = new_node(search, search->prev, v);
      search->prev = search->prev->next;
      return;
    }
    search = search->next;
  }
  search->prev->next = new_node(search, search->prev, v);
  search->prev = search->prev->next;
}
