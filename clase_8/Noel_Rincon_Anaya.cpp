#include <iostream>
using namespace std;

int main()
{
    string calificaciones[5][5] = {
        {"Ulises", "Emilio", "Santiago", "Daniel", "Alexia"},
        {"8", "9", "7", "8", "9"},
        {"10", "8", "9", "10", "8"},
        {"6", "8", "7", "9", "8"},
        {"10", "9", "10", "7", "6"},
    };
    while (1)
    {
        string nombre;
        cout << "Ingrese el Nombre del estudiante: " << endl;
        cin >> nombre;
        for (int i = 0; i < 5; i++)
        {
            if (calificaciones[0][i] == nombre)
            {
                cout << "Las calificaciones de " << calificaciones[0][i] << ": " << endl;
                for (int e = 1; e < 5; e++)
                {
                    cout << calificaciones[e][i] << endl;
                }
            }
        }
    }
    return 0;
}
