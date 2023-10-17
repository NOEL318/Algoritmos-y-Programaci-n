#include <iostream>
using namespace std;
int main()
{
    int numeros[300] = {};
    int cantidad = 0;
    cout << "Ingrese la cantidad de números a ingresar: " << endl;
    cin >> cantidad;
    for (int i = 0; i <= cantidad; i++)
    {
        numeros[i] = 0 + rand() % 1000 - 0;
    }
    for (int i = 0; i <= cantidad; i++)
    {
        cout << "Dato " << i << ": " << numeros[i] << endl;
    }

    return 0;
}