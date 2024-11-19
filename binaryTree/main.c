#include "binaryTree.h"
#include <stdio.h>

int main() {
  printf("Testing binaryTree.c library \n");

  // initializates some variable to make the program work
  init_env();

  // create nodes to use
  node *A = new_node('A');
  node *B = new_node('B');
  node *C = new_node('C');
  node *D = new_node('D');
  node *E = new_node('E');
  node *F = new_node('F');
  node *G = new_node('G');
  node *H = new_node('H');

  // set children to nodes
  set_childs(A, B, E);
  set_childs(B, C, NULL_NODE);
  set_childs(C, NULL_NODE, D);
  set_childs(C, NULL_NODE, D);
  set_childs(E, F, G);
  set_childs(G, H, NULL_NODE);

  print_tree(A, 1);
	printf("Swapped Version Of The Original Binary Tree:\n");
	swap_tree(A);
	print_tree(A, 1);

  // free the memory used to represent each node in the tree
  free_all();
}
