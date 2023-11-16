#include <iostream>
using namespace std;
int main()
{
    double matriz[3][3];
    double adjunta[3][3];
    double transpuesta[3][3];
    int det = 0;
    for (int i = 0; i < 3; i++)
    {
        for (int e = 0; e < 3; e++)
        {
            cout << "Ingrese el numero de la matriz de 3x3: " << endl;
            cin >> matriz[i][e];
        }
    }
    for (int i = 0; i < 3; i++)
    {
        // detemrinante con el % para regresar a 0
        det = det + (matriz[0][i] * (matriz[1][(i + 1) % 3] * matriz[2][(i + 2) % 3] - matriz[1][(i + 2) % 3] * matriz[2][(i + 1) % 3]));
    }
    for (int i = 0; i < 3; i++)
    {
        for (int e = 0; e < 3; e++)
        {
            // dejo de contar las q no
            adjunta[e][i] = ((matriz[(i + 1) % 3][(e + 1) % 3] * matriz[(i + 2) % 3][(e + 2) % 3]) - (matriz[(i + 1) % 3][(e + 2) % 3] * matriz[(i + 2) % 3][(e + 1) % 3]));
            transpuesta[e][i] = matriz[i][e];
        }
    }
    // transpuesta
    cout << "TRANSPUESTA" << endl;
    for (int i = 0; i < 3; i++)
    {
        for (int e = 0; e < 3; e++)
        {
            cout << "[" << transpuesta[i][e] << "]";
        }
        cout << endl;
    }
    // adjunda
    cout << "Adjunta: " << endl;
    for (int i = 0; i < 3; i++)
    {
        for (int e = 0; e < 3; e++)
        {
            cout << "[" << adjunta[i][e] << "]";
        }
        cout << endl;
    }
    // inversa
    cout << "Inversa" << endl;
    if (det != 0)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int e = 0; e < 3; e++)
            {
                cout << "[" << adjunta[i][e] / det << "]";
            }
            cout << endl;
        }
    }
    return 0;
}
