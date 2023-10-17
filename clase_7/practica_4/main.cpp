#include <iostream>
using namespace std;
int main()
{
    int numeros[100] = {};
    for (int i = 0; i <= 100; i = i + 2)
    {
        numeros[i] = i;
        cout << numeros[i] << endl;
    }

    return 0;
}