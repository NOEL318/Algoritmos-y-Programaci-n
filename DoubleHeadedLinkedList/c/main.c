#include <stdlib.h>
#include "DoubleHeadedLinkedList.h"

int main(int argc, char *argv[])
{

  /* create head node initialize linked list */
  node linkedlist;
  init_linkedlist(&linkedlist);

  /* inserting some values */
  insert_node(&linkedlist, 'A');
  insert_node(&linkedlist, 'B');
  insert_node(&linkedlist, 'C');
  insert_node(&linkedlist, 'D');
  insert_node(&linkedlist, 'E');
  insend_node(&linkedlist, 'F');
  display_linkedlist(&linkedlist, "insend A, B, C, D, E, F!\n");

  /* testing delete */
  delete_node(&linkedlist, 'C');
  display_linkedlist(&linkedlist, "delete C!\n");
  display_debug(&linkedlist);

  /* testing insort */
  insort_node(&linkedlist, 'C');
  display_linkedlist(&linkedlist, "insort C!\n");
  display_debug(&linkedlist);

  /* testing insort */
  insort_node(&linkedlist, 'a');
  display_linkedlist(&linkedlist, "insort a!\n");
  display_debug(&linkedlist);

  /* testing delete */
  delete_node(&linkedlist, 'a');
  display_linkedlist(&linkedlist, "delete a!\n");
  display_debug(&linkedlist);
  free_linkedlist(&linkedlist);

  /* all seems to work as expected */
  
  return EXIT_SUCCESS;
}
