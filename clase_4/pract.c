//       Authors: Aldo Solís, Noel Rincón, Enrique
//          Date: 27/08/2024 - 30/08/2024
//   Description: program that adds or substracts two, up to 10-grade,
//                polynomials, using polynomial symbolic manipulation.
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#ifdef _WIN32 /* little macro to clear screen on POSIX and Windows command \
                 line interfaces. */
#include <conio.h>
#else
#define clrscr() \
  printf("\e[1;1H\e[2J") // ansi escape code to clear screen in POSIX compliant
                         // terminals (almost all terminals but Windows's cmd)
#endif                   /* ifdef _WIN32 */
#define POWER_BUFFER_SIZE 3
#define COEFFICIENT_BUFFER_SIZE 10
#define POSITIVE 1
#define NEGATIVE -1

void parser_panic(const char *error);
void initpol(double pol[11][11]);
void print_pretty_matrix(double pol[11][11]);
void print_polynomial(double pol[11][11]);
int get_input(double pol[11][11]);
void set_monomial_to_pmr(double pol[11][11], char numbuff[10],
                         char xpowerbuff[2], char ypowerbuff[2], int sign);

int main(int argc, char *argv[])
{
  double pol1[11][11];
  initpol(pol1);
  clrscr();
  printf("Welcome to polynomial adder\n");
  printf("Introduce the polynomials you would like to sum\n");
  get_input(pol1);
  print_polynomial(pol1);
  printf("there you go!\n");
  return EXIT_SUCCESS;
}

/* fills bidimensional 10x10-array with zeros */
void initpol(double pol[11][11])
{
  for (int i = 0; i < 11; i++)
  {
    for (int j = 0; j < 11; j++)
    {
      pol[i][j] = 0;
    }
  }
}

/* prints the matrix in a spreadsheet style */
void print_pretty_matrix(double pol[11][11])
{
  for (int i = 0; i < 11; i++)
  {
    printf("\ty^%d ", i);
  }
  putchar('\n');
  for (int i = 0; i < 11; i++)
  {
    printf("x^%d\t", i);
    for (int j = 0; j < 11; j++)
    {
      printf("%3.3lf\t", pol[i][j]);
    }
    putchar('\n');
  }
}

// TODO: print matrix like A_1x^10 A_2y^10 ... A_n.
void print_polynomial(double pol[11][11])
{
  bool all_null = true;
  for (int i = 0; i < 11; i++)
  {
    for (int j = 0; j < 11; j++)
    {
      if (pol[i][j] != 0)
      {
        all_null = false;
        if (i == 0 & j == 0)
        {
          printf("%+.2lf", pol[i][j]);
        }
        else if (i == 0)
        {
          printf("%+.2lfy^%d ", pol[i][j], j);
        }
        else if (j == 0)
        {
          printf("%+.2lfx^%d ", pol[i][j], i);
        }
        else
        {
          printf("%+.2lfx^%dy^%d", pol[i][j], i, j);
        }
      }
    }
  }
  if (all_null)
  {
    printf("0");
  }
  printf("\n");
}

/* very basic, error-prone and inefficient polynomial parser. Given a
 * polynomial, encoded in a string from stdin, it will try to break it to psm
 * (pol[11][11]), if it fails (plz don't) it will return code EXIT_FAILURE to
 * the program, indicating a syntax error. */

int get_input(double pol[11][11])
{

  /* These variables and buffers are used in the `get_input` function to parse the input polynomial
  string. Here is a brief explanation of each: */
  int coefficient_index = 0;
  int power_index = 0;
  int sign = POSITIVE;
  char coefficient_buffer[COEFFICIENT_BUFFER_SIZE];
  char x_power_buffer[POWER_BUFFER_SIZE];
  char y_power_buffer[POWER_BUFFER_SIZE];
  char c;
  bool editing_x = false;
  bool editing_y = false;
  bool editing_power = false;

  /* These lines are initializing character arrays `coefficient_buffer`, `x_power_buffer`, and
  `y_power_buffer` with default values. Here's a breakdown of what each line is doing: */
  coefficient_buffer[0] = '0';
  coefficient_buffer[1] = '\0';
  x_power_buffer[0] = '0';
  y_power_buffer[0] = '0';
  x_power_buffer[1] = '\0';
  y_power_buffer[1] = '\0';

  /* The line `while ((c = getchar()) != '\n') {` is a loop that reads characters from the standard input
  (stdin) one by one until it encounters a newline character '\n'. This loop is used in the
  `get_input` function to parse the input polynomial string entered by the user. */
  while ((c = getchar()) != '\n')
  {
    if (c == ' ')
      continue;
    if (c == 'x')
    {
      /* The line `if (coefficient_index == 0) {` is checking if the `coefficient_index` variable is
      equal to 0. This check is used in the context of parsing a polynomial input string character by
      character. */
      if (coefficient_index == 0)
      {
        coefficient_buffer[0] = '1';
        coefficient_buffer[1] = '\0';
      }
      editing_x = true;
      editing_y = false;
      x_power_buffer[0] = '1';
      x_power_buffer[1] = '\0';
      continue;
    }
    else if (c == 'y')
    {
      /* The line `if (coefficient_index == 0) {` is checking if the `coefficient_index` variable is equal
      to 0. This check is used in the context of parsing a polynomial input string character by
      character. If the `coefficient_index` is 0, it indicates that no coefficient has been parsed yet
      for the current term in the polynomial being processed. In this case, the code sets the
      coefficient to '1' as a default value to handle cases where the coefficient is implicit (e.g.,
      'x' instead of '1x'). This ensures that if no coefficient is explicitly provided, it defaults to
      '1' for correct polynomial parsing. */
      if (coefficient_index == 0)
      {
        coefficient_buffer[0] = '1';
        coefficient_buffer[1] = '\0';
      }
      editing_x = false;
      editing_y = true;
      y_power_buffer[0] = '1';
      y_power_buffer[1] = '\0';
      continue;
    }
    else if (c == '^')
    {
      editing_power = true;
      power_index = 0;
      continue;
    }
    else if (c >= '0' && c <= '9')
    {
      if (editing_x && editing_power)
      {
        /* The code snippet `if (power_index > POWER_BUFFER_SIZE - 2)` is checking if the `power_index`
        variable has exceeded the maximum allowed index in the `POWER_BUFFER_SIZE` array for storing the
        power of 'x' in the polynomial being parsed. */
        if (power_index > POWER_BUFFER_SIZE - 2)
        {
          parser_panic("x power buffer overflow.");
        }
        /* The code snippet `x_power_buffer[power_index] = c; x_power_buffer[power_index + 1] = '\0';
        power_index++;` is responsible for updating the `x_power_buffer` array with the character `c` read
        from the input polynomial string. Here's a breakdown of what each line is doing: */
        x_power_buffer[power_index] = c;
        x_power_buffer[power_index + 1] = '\0';
        power_index++;
        continue;
      }
      else if (editing_y && editing_power)
      {
        /* This code snippet is checking if the `power_index` variable has exceeded the maximum allowed index
        in the `POWER_BUFFER_SIZE` array for storing the power of 'y' in the polynomial being parsed. */
        if (power_index > POWER_BUFFER_SIZE - 2)
        {
          parser_panic("y power buffer overflow");
        }
        y_power_buffer[power_index] = c;
        y_power_buffer[power_index + 1] = '\0';
        power_index++;
        continue;
      }
      /* This code snippet is checking if the `coefficient_index` variable has exceeded the maximum allowed
      index in the `coefficient_buffer` array. */
      if (coefficient_index > COEFFICIENT_BUFFER_SIZE - 2)
      {
        parser_panic("coefficient buffer overflow");
      }
      /* The code snippet `coefficient_buffer[coefficient_index] = c; coefficient_buffer[coefficient_index +
      1] = '\0'; coefficient_index++;` is responsible for updating the `coefficient_buffer` array with the
      character `c` read from the input polynomial string. Here's a breakdown of what each line is doing: */
      coefficient_buffer[coefficient_index] = c;
      coefficient_buffer[coefficient_index + 1] = '\0';
      coefficient_index++;
      continue;
    }

    else if (c == '+')
    {
      /* The code snippet `if (coefficient_buffer[0] == '0')` is checking if the first character in the
      `coefficient_buffer` array is equal to '0'. If this condition is true, it means that no coefficient
      has been parsed for the current term in the polynomial being processed. In this case, the code sets
      the `sign` variable to `POSITIVE` and then continues to the next iteration of the loop without
      executing the subsequent code. */
      if (coefficient_buffer[0] == '0')
      {
        sign = POSITIVE;
        continue;
      }
      /* The `set_monomial_to_pmr` function is responsible for assigning a monomial (a single term in a
      polynomial) to the polynomial matrix representation `pol`. Here's a breakdown of what
      `set_monomial_to_pmr` is doing with the provided arguments: */
      set_monomial_to_pmr(pol, coefficient_buffer, x_power_buffer,
                          y_power_buffer, sign);
      editing_power = false;
      editing_x = false;
      editing_y = false;
      sign = POSITIVE;
      coefficient_index = 0;
      coefficient_buffer[0] = '0';
      coefficient_buffer[1] = '\0';
      x_power_buffer[0] = '0';
      y_power_buffer[0] = '0';
      x_power_buffer[1] = '\0';
      y_power_buffer[1] = '\0';
    }
    else if (c == '-')
    {
      if (coefficient_buffer[0] == '0')
      {
        sign = NEGATIVE;
        continue;
      }
      set_monomial_to_pmr(pol, coefficient_buffer, x_power_buffer,
                          y_power_buffer, sign);
      editing_power = false;
      editing_x = false;
      editing_y = false;
      sign = NEGATIVE;
      coefficient_index = 0;
      coefficient_buffer[0] = '0';
      coefficient_buffer[1] = '\0';
      x_power_buffer[0] = '0';
      y_power_buffer[0] = '0';
      x_power_buffer[1] = '\0';
      y_power_buffer[1] = '\0';
    }
    else
    {
      parser_panic("Syntax error.");
    }
  }
  set_monomial_to_pmr(pol, coefficient_buffer, x_power_buffer, y_power_buffer,
                      sign);
  return EXIT_SUCCESS;
}

/* prints an error message and exits the program */
void parser_panic(const char *error)
{
  fprintf(stderr, "%s Exiting parser now!\n", error);
  exit(EXIT_FAILURE);
}

/* helper function to assign monomials to polynomial matrix representation*/
void set_monomial_to_pmr(double pol[11][11], char numbuff[10],
                         char xpowerbuff[2], char ypowerbuff[2], int sign)
{
  double coefficient;
  int x_exponent;
  int y_exponent;
  sscanf(numbuff, "%lf", &coefficient);
  sscanf(xpowerbuff, "%d", &x_exponent);
  sscanf(ypowerbuff, "%d", &y_exponent);

  pol[x_exponent][y_exponent] += coefficient * sign;
}
