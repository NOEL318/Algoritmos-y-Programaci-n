/* The `#include <stdio.h>` directive in C programming is a preprocessor directive that tells the
compiler to include the standard input-output library in the program. This library provides
functions for input and output operations, such as `printf()` and `scanf()`, which are commonly used
in C programs for displaying output and reading input from the user. By including `<stdio.h>`, you
can use these functions in your program. */
#include <stdio.h>

/* The `struct Product` definition is declaring a structure named `Product` in C programming. This
structure contains various data members such as `code`, `name`, `description`, `laboratory`,
`supplier`, `price`, and `epoch_expire_date`. */
struct Product
{
    int code;
    char name[100];
    char description[255];

    struct laboratory
    {
        char name[100];
        char address[255];
    } laboratory;
    struct supplier
    {
        char name[100];
        char address[255];
    } supplier;

    float price;
    int epoch_expire_date;
} Product;

/* The `int main()` function is the entry point of a C program. When the program is executed, the
execution starts from the `main()` function. In this specific code snippet, the `main()` function is
empty and simply returns 0, which indicates successful termination of the program. */
int main()
{

    return 0;
}
