#include <iostream>
using namespace std;
int main()
{
    string cadena;
    cout << "Ingrese su numero o texto a contar digitos:";
    cin >> cadena;
    int a;
    for (int i = 0; i <= cadena.length(); i++)
    {
        a = i;
    }
    cout << a << " Digitos" << endl;

    return 0;
}