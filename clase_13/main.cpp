#include <iostream>
using namespace std;
int matriz_primera[5][5] = {};
int matriz_segunda[5][5] = {};
int matriz_auxiliar[5][5] = {};

int main()
{
    while (1)
    {
        int opt;
        cout << endl
             << "1 - Multiplicación" << endl;
        cout << "2 - Suma" << endl;
        cout << "3 - Resta" << endl
             << endl;
        cout << "Ingrese el número de la operación que desea realizar: " << endl;
        cin >> opt;
        if (opt <= 3 && opt >= 1)
        {
            for (int i = 0; i < 5; i++)
            {
                for (int e = 0; e < 5; e++)
                {
                    cout << "Ingresa el valor de la matriz"
                         << "\x1b[37;40m 1"
                         << "\x1b[0m"
                         << " en: "
                         << "(" << i << ", " << e << ")" << endl;
                    cin >> matriz_primera[i][e];
                    cout << "Ingresa el valor de la matriz"
                         << "\x1b[37;40m 2"
                         << "\x1b[0m"
                         << " en: "
                         << "(" << i << ", " << e << ")" << endl;
                    cin >> matriz_segunda[i][e];
                }
            }
        }

        switch (opt)
        {
        case 1:
            cout << endl
                 << "\x1b[37;44m"
                 << "Multiplicación"
                 << "\x1b[0m" << endl;

            for (int i = 0; i < 5; ++i)
            {
                for (int j = 0; j < 5; ++j)
                {
                    matriz_auxiliar[i][j] = 0;
                }
            }
            for (int i = 0; i < 5; i++)
            {
                for (int e = 0; e < 5; e++)
                {
                    for (int f = 0; f < 5; f++)
                    {
                        matriz_auxiliar[i][e] += matriz_primera[i][f] * matriz_segunda[f][e];
                    }
                }
            }
            cout << endl
                 << "\x1b[37;44m"
                 << "La matriz multiplicada es: "
                 << "\x1b[0m" << endl;
            for (int i = 0; i < 5; ++i)
            {
                for (int j = 0; j < 5; ++j)
                {
                    cout << "|" << matriz_auxiliar[i][j] << "|";
                }
                cout << endl
                     << endl;
            }
            break;
        case 2:
            for (int i = 0; i < 5; i++)
            {
                for (int e = 0; e < 5; e++)
                {
                    matriz_auxiliar[i][e] = matriz_primera[i][e] + matriz_segunda[i][e];
                }
            }
            cout << endl
                 << "\x1b[37;43m"
                 << "La matriz Sumada es: "
                 << "\x1b[0m" << endl;
            for (int i = 0; i < 5; ++i)
            {
                for (int j = 0; j < 5; ++j)
                {
                    cout << "|" << matriz_auxiliar[i][j] << "|";
                }
                cout << endl
                     << endl;
            }
            break;

        case 3:
            for (int i = 0; i < 5; i++)
            {
                for (int e = 0; e < 5; e++)
                {
                    matriz_auxiliar[i][e] = matriz_primera[i][e] - matriz_segunda[i][e];
                }
            }
            cout << endl
                 << "\x1b[37;45m"
                 << "La matriz restada es: "
                 << "\x1b[0m" << endl;
            for (int i = 0; i < 5; ++i)
            {
                for (int j = 0; j < 5; ++j)
                {
                    cout << "|" << matriz_auxiliar[i][j] << "|";
                }
                cout << endl
                     << endl;
            }
            break;

        default:
            cout << endl
                 << "\x1b[37;41m"
                 << "ERROR-> Por favor seleccione una opción dentro del menú."
                 << "\x1b[0m" << endl;
            break;
        }
    }
    return 0;
}