#include <iostream>
using namespace std;

int multiplicación(int ma1, int ma2)
{
    return ma1 * ma2;
}

int main()
{
    int xtemp1, ytemp1, xtemp2, ytemp2;
    cout
        << "Ingresa el tamaño en X de la primer matriz:" << endl;
    cin >> xtemp1;
    cout << "Ingresa el tamaño en Y de la primer matriz:" << endl;
    cin >> ytemp1;
    int matriz1[ytemp1][xtemp1];
    cout << "Ingresa el tamaño en X de la segunda matriz:" << endl;
    cin >> xtemp2;
    cout << "Ingresa el tamaño en Y de la segunda matriz:" << endl;
    cin >> ytemp2;
    int matriz2[ytemp2][xtemp2];
    if (xtemp1 != ytemp2)
    {
        cout << "Sus filas y columnas deben tener al menos 1 fila del mismo numero de elementos";
    }
    else
    {
        for (int i = 0; i < ytemp1; i++)
        {
                                  for (int e = 0; e < xtemp1; e++)
            {
                cout << "Matriz 1:" << endl
                     << "Ingrese el dato del campo: " << i << "," << e << endl;
                cin >> matriz1[i][e];
            }
        }
        for (int i = 0; i < ytemp2; i++)
        {
            for (int e = 0; e < xtemp2; e++)
            {
                cout << "Matriz 2:" << endl
                     << "Ingrese el dato del campo: " << i << "," << e << endl;
                cin >> matriz2[i][e];
            }
        }
        int matriz3[ytemp1][xtemp2];
        for (int i = 0; i < ytemp1; ++i)
        {
            for (int j = 0; j < xtemp2; ++j)
            {
                matriz3[i][j] = 0;
            }
        }
        for (int i = 0; i < ytemp1; i++)
        {
            for (int e = 0; e < xtemp2; e++)
            {
                for (int f = 0; f < xtemp1; f++)
                {
                    matriz3[i][e] += multiplicación(matriz1[i][f], matriz2[f][e]);
                }
            }
        }
        cout << "La matriz multiplicada es:" << endl;
        for (int i = 0; i < ytemp1; ++i)
        {
            for (int j = 0; j < xtemp2; ++j)
            {
                cout << matriz3[i][j] << " ";
            }
            cout << endl;
        }
    }
    return 0;
}