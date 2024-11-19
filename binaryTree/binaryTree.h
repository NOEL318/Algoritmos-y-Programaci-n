typedef struct node {
  struct node *left;
  struct node *right;
  struct node *parent;
  char value;
} node;

#define NULL_NODE NULL

void init_env();
node *new_node(char v);
void set_childs(node *parent, node *l, node *r);
void free_all();
void print_list();
void print_tree(node *h, int level);
void minitree(node *h);
void swap_tree(node *h);
