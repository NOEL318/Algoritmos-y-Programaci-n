#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    float termostato1;
    float termostato2;
    cout << "Ingrese la temperatura en C: " << endl;
    cin >> termostato1;
    termostato1 = termostato1 + 7.68;
    termostato2 = (termostato1 * 9 / 5) + 32;
    cout << "La temperatura actual es: " << fixed << setprecision(0) << termostato2 << " F" << endl;
    if (termostato2 > 70)
    {
        cout << "El aire acondicionado se apagó" << endl;
    }
    else
    {
        cout << "El aire acondicionado se encendió" << endl;
    }
    return 0;
}