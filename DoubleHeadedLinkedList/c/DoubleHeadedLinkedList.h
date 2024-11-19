// this define statement is made bacause the functionality of the functions
// insend and insert is literally the same because of the way we defined the
// structure (basically im lazy and I do not want to define another structure
// with the same content)
#define insend_node insert_node

typedef struct node {
  char value;
  struct node *prev;
  struct node *next;
} node;

node *new_node(node *next, node *prev, char value);
void init_linkedlist(node *n);
void insert_node(node *linkedlist, char value);
void display_linkedlist(node *linkedlist, char *format);
void free_linkedlist(node *linkedlist);
void delete_node(node *linkedlist, char v);
void display_debug(node *linkedlist);
void insort_node(node *linkedlist, char v);
