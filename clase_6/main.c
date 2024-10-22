#include <stdio.h>

/*
`DEFINED_ARRAY_SIZE` is used to determine the size of the `beverage_struct_array` array, which is an
array of `Beverage_struct` structs with a size of 12 elements. This makes it easier to manage the
size of the array and ensures consistency in the code. */
#define DEFINED_ARRAY_SIZE 12

/**
 * The above type defines a struct named Beverage_struct with fields for category, type, brand, and
 * quantity of a beverage.
 * @property {char} category - The `category` property in the `Beverage_struct` struct represents the
 * category or type of beverage. It can be one of the following options: wine, whiskey, rum, cognac,
 * gin, or vodka.
 * @property {char} type - The `type` property in the `Beverage_struct` struct represents the specific
 * type or variety of the beverage. Examples of possible values for the `type` property could include
 * "champagne", "sherry", "red wine", "white wine", "sparkling wine", "ry
 * @property {char} brand - The `brand` property in the `Beverage_struct` struct represents the brand
 * name of the beverage. It is a character array that can hold up to 30 characters.
 * @property {int} qty - The `qty` property in the `Beverage_struct` struct represents the quantity of
 * a particular beverage item. It stores an integer value indicating how many units of that beverage
 * are available or in stock.
 */
struct Beverage_struct
{
    char category[20]; // wine \\ whiskey \\ rum \\ cognac \\ gin \\ vodka
    char type[40];     // champagne \\ sherry \\ red wine \\ white wine \\ sparkling wine \\ \\ rye \\ scotch \\ bourbon \\ etc
    char brand[30];
    int qty;
};

int main()
{
    /* The line `struct Beverage_struct beverage_struct_array[DEFINED_ARRAY_SIZE];` is declaring an array
    named `beverage_struct_array` that can hold a fixed number of elements of type `Beverage_struct`.
    The size of this array is determined by the `DEFINED_ARRAY_SIZE` constant, which is set to 12 in
    this case. */
    struct Beverage_struct beverage_struct_array[DEFINED_ARRAY_SIZE];

    /* The for loop is iterating through each element of the `beverage_struct_array` array.
    For each iteration, it prompts the user to input the category, type, brand, and quantity of a
    beverage. The user input is then stored in the corresponding fields of the `Beverage_struct` struct
    at index `i` in the array. */
    for (int i = 0; i < DEFINED_ARRAY_SIZE; i++)
    {
        printf("Type the category of your beverage: (Wine/Whiskey/Rum/Cognac/Gin/Vodka): ");
        scanf("%s", beverage_struct_array[i].category);
        printf("Type the Type of your beverage: (Red/White/Pink/Aged/etc...): ");
        scanf("%s", beverage_struct_array[i].type);
        printf("Type the Brand of your beverage: ");
        scanf("%s", beverage_struct_array[i].brand);
        printf("Type the Quantity of your beverage: ");
        scanf("%d", &beverage_struct_array[i].qty);
    }

    /* The code is a for loop that iterates through each element of the
    `beverage_struct_array` array. For each iteration, it prints out the category, type, brand, and
    quantity of a beverage that the user inputted earlier in the program. */
    for (int i = 0; i < DEFINED_ARRAY_SIZE; i++)
    {
        printf("\n\nCategory: %s\n", beverage_struct_array[i].category);
        printf("Type: %s\n", beverage_struct_array[i].type);
        printf("Brand: %s\n", beverage_struct_array[i].brand);
        printf("Quantity: %d\n", beverage_struct_array[i].qty);
    }
    return 0;
}