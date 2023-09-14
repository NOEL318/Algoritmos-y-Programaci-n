#include <iostream>

using namespace std;

int main()
{
    int nota;
    int caso;
    cout << "Ingrese su nota en escala de 1-100:" << endl;
    cin >> nota;

    if (nota >= 90)
    {
        caso = 1;
    }
    else if (nota < 90 && nota >= 80)
    {
        caso = 2;
    }
    else if (nota < 80 && nota >= 70)
    {
        caso = 3;
    }
    else if (nota < 70 && nota >= 69)
    {
        caso = 4;
    }
    else if (nota < 69)
    {
        caso = 5;
    }

    switch (caso)
    {
    case 1:
        cout << "Tienes una A" << endl;
        break;
    case 2:
        cout << "Tienes una B" << endl;
        break;
    case 3:
        cout << "Tienes una C" << endl;
        break;
    case 4:
        cout << "Tienes una D" << endl;
        break;
    default:
        cout << "Tienes una F" << endl;
        break;
    }
    return 0;
}