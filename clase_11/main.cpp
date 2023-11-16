#include <iostream>
using namespace std;

double inputs(int opt, double num1, double num2)
{
    double resultado = 0;
    switch (opt)
    {
    case 1:
    {
        resultado = num1 + num2;
        break;
    }
    case 2:
    {
        resultado = num1 - num2;
        break;
    }
    case 3:
    {
        resultado = num1 * num2;
        break;
    }
    case 4:
    {
        resultado = num1 / num2;
        break;
    }
    }
    return resultado;
}
int main()
{
    while (1)
    {
        double num1 = 0, num2 = 0;
        int opt = 0;
        cout << "Calculadora" << endl;
        cout << "1- Suma" << endl;
        cout << "2- Resta" << endl;
        cout << "3- Multiplicación" << endl;
        cout << "4- División" << endl;
        cin >> opt;
        if (opt >= 1 && opt <= 4)
        {
            cout << "Ingrese el Número 1" << endl;
            cin >> num1;
            cout << "Ingrese el Número 2" << endl;
            cin >> num2;
            cout << "Su resultado es: " << inputs(opt, num1, num2) << endl
                 << endl
                 << endl;
        }
        else
        {
            cout << "Un error ha ocurrido seleccione una opción dentro del rango." << endl;
        }
    }
    return 0;
}