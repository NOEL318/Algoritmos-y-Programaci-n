#include <iostream>
using namespace std;
int main()
{
    int numeros[100] = {};
    int suma = 0;
    int media = 0;
    for (int i = 0; i <= 100; i++)
    {
        numeros[i] = i;
        cout << numeros[i] << endl;
        suma = suma + numeros[i];
        media = suma / 100;
    }
    cout << "Su suma es: " << suma << endl;
    cout << "Su media es: " << media << endl;

    return 0;
}