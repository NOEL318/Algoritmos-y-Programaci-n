#include <stdio.h>
#include <stdlib.h>
#define N1 10
#define EMPTY -1
#define CHR_NULL '\0'
void CQ_INSERT(char **Q, int *F, int *R, int N, char);
char CQ_DELETER(char *Q, int *F, int *R, int n);
void Q_PRINTER(char *Q, int F, int R, int n);

int main()
{
    // Dynamic memory pointer declaration
    char *Q;
    int FRONT_1, REAR_1;
    FRONT_1 = REAR_1 = EMPTY;

    // Dynamic memory allocation
    Q = (char *)malloc(N1 * sizeof(char));
    CQ_INSERT(&Q, &FRONT_1, &REAR_1, N1, 'a');
    CQ_INSERT(&Q, &FRONT_1, &REAR_1, N1, 'e');
    CQ_INSERT(&Q, &FRONT_1, &REAR_1, N1, 'i');
    CQ_INSERT(&Q, &FRONT_1, &REAR_1, N1, 'o');
    CQ_INSERT(&Q, &FRONT_1, &REAR_1, N1, 'u');
    CQ_INSERT(&Q, &FRONT_1, &REAR_1, N1, 'N');
    CQ_INSERT(&Q, &FRONT_1, &REAR_1, N1, 'V');

    Q_PRINTER(Q, FRONT_1, REAR_1, N1);

    return 0;
}

void CQ_INSERT(char **Q, int *F, int *R, int N, char INSERTION)
{
    int tmp = *R;
    if (*R == N - 1)
    {
        *R = 0;
    }
    else
    {
        *R = *R + 1;
        // *R++;
    }

    if (*F == *R)
    {
        printf("FULL QUEUE\n");
        *R = tmp;
    }
    else
    {
        (*Q)[*R] = INSERTION;
        if (*F == EMPTY)
        {
            *F = 0;
        }
    }
}

char CQ_DELETER(char *Q, int *F, int *R, int n)
{
    if (F == EMPTY)
    {
        printf("Empty Queue\n");
        return CHR_NULL;
    }
    else
    {
        char y = Q[*F];
        if (*F == *R)
        {
            *F = *R = EMPTY;
        }
        else if (*F == n - 1)
        {
            *F = 0;
        }
        else
        {
            *F = *F + 1;
        }
        return y;
    }
}

void Q_PRINTER(char *Q, int F, int R, int n)
{
    for (int i = 0; i < R && i < n; i++)
    {
        printf("(%d, %c)\n", i, Q[i]);
    }
    for (int i = 0; R > F && i <= R; i++)
    {
        printf("(%d, %c)\n", i, Q[i]);
    }
}