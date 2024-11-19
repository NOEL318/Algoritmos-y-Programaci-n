#include "binaryTree.h"
#include <stdio.h>
#include <stdlib.h>

/* structure to store memory addresses of the nodes used to form a binary tree
 */
typedef struct node_list {
  struct node *value;
  struct node_list *next;
  struct node_list *prev;
} node_list;
/* global variables */
/* this acts like a garbage collector because it stores all the memory adresses
 * used for creating all binary trees and when whe call the function free nodes
 * it frees every element of the list and frees the list itself*/
node_list *list;
node_list *head;

void reflect_tree(node *h) {}

void minitree(node *h) {
  if (h->left != NULL) {
    printf("%c\n", h->left->value);
  }
  if (h->right != NULL) {
    printf("%c\n", h->right->value);
  }
}

void swap_tree(node *h) {
  node *tmp = h->left;
  h->left = h->right;
  h->right = tmp;
  if (h->left) {
    swap_tree(h->left);
  }
  if (h->right) {
    swap_tree(h->right);
  }
}

void print_tree(node *h, int level) {
  if (level == 1) {
    printf("%c\n", h->value);
  }
  if (h->left) {
    for (int i = 0; i < level * 2; i++)
      putchar(' ');
    printf("%c\n", h->left->value);
    print_tree(h->left, level + 1);
  }
  if (h->right) {
    for (int i = 0; i < level * 2; i++)
      putchar(' ');
    printf("%c\n", h->right->value);
    print_tree(h->right, level + 1);
  }
}

void init_env() {
  list = (node_list *)malloc(sizeof(node_list));
  head = list;
  list->next = list;
  list->prev = list;
}

node_list *new_list_element(node *element) {
  node_list *ret = (node_list *)malloc(sizeof(node));
  ret->value = element;
  return ret;
}

void insert_to_list(node *elem) {
  node_list *new = new_list_element(elem);
  if (list->next == list) {
    new->prev = list;
    new->next = list;
    list->next = new;
    list->prev = new;
    return;
  }
  new->next = list;
  new->prev = list->prev;
  list->prev->next = new;
  list->prev = new;
}

node *new_node(char v) {
  node *ret = (node *)malloc(sizeof(node));
  ret->value = v;
  insert_to_list(ret); // store memory address of new node to be freed later
  return ret;
}

// debug tool to see cached memory adresses
void print_list() {
  while (list->next != head) {
    printf("this: %p\tprev: %p\tnext: %p\n", list, list->prev, list->next);
    list = list->next;
  }
  printf("this: %p\tprev: %p\tnext: %p\n", list, list->prev, list->next);
}

void set_childs(node *parent, node *l, node *r) {
  if (parent == NULL_NODE) {
    fprintf(stderr, "You are doing some nonesense");
    fprintf(stderr, ": Ignoring last set_childs()\n");
    return;
  }
  if (l != NULL_NODE) {
    parent->left = l;
    l->parent = parent;
  }
  if (r != NULL_NODE) {
    parent->right = r;
    r->parent = parent;
  }
  if (l == NULL_NODE) {
    parent->left = NULL;
  }
  if (r == NULL_NODE) {
    parent->right = NULL;
  }
}

/* iterates the linked list, frees the memory of every element and finally it
 * frees the memory used for the list itself  */
void free_all() {
  list = head;
  while (list->next != head) {
    free(list->value);
    list = list->next;
    free(list->prev);
  }
  free(list->value);
  free(list);
}
