#include <iostream>
using namespace std;

int main()
{
    string mate[5][4] = {
        {"Julieta", "Andres", "Julio", "Maite"},
        {"8", "7", "9", "8"},
        {"9", "9", "7", "8"},
        {"7", "7", "9", "9"},
        {"9", "9", "8", "7"},
    };
    string progra[5][4] = {
        {"Julieta", "Andres", "Julio", "Maite"},
        {"7", "8", "7", "6"},
        {"9", "8", "7", "9"},
        {"7", "7", "9", "10"},
        {"8", "9", "7", "8"},
    };
    string fisica[5][4] = {
        {"Julieta", "Andres", "Julio", "Maite"},
        {"9", "9", "8", "7"},
        {"7", "8", "9", "10"},
        {"8", "8", "8", "8"},
        {"6", "5", "8", "10"},
    };
    float p_fisica = 0, p_mate = 0, p_progr = 0;
    while (1)
    {
        string nombre;
        cout << "Ingrese el nombre del estudiante: " << endl;
        cin >> nombre;
        for (int i = 0; i < 5; i++)
        {
            if (mate[0][i] == nombre)
            {
                p_fisica = 0;
                p_mate = 0;
                p_progr = 0;
                cout << "Las calificaciones del alumno " << mate[0][i] << ": " << endl;
                for (int e = 1; e < 5; e++)
                {
                    p_mate = p_mate + (stoi(mate[e][i]));
                }
                for (int e = 1; e < 5; e++)
                {
                    p_progr = p_progr + (stoi(progra[e][i]));
                }
                for (int e = 1; e < 5; e++)
                {
                    p_fisica = p_fisica + (stoi(fisica[e][i]));
                }
            }
        }
        cout << "Matemáticas: " << p_mate / 4 << endl;
        cout << "Programación: " << p_progr / 4 << endl;
        cout << "Física: " << p_fisica / 4 << endl;
        float prom = 0;
        prom = ((p_mate/4) + (p_progr/4) + (p_fisica/4)) / 3;
        cout << "Y su calificación final es: " << prom << endl;
    }
    return 0;
}
