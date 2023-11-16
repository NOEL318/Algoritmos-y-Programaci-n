#include <iostream>
using namespace std;

double suma(double num1, double num2)
{
    double resultado = 0;
    resultado = num1 + num2;
    return resultado;
}
double resta(double num1, double num2)
{
    double resultado = 0;
    resultado = num1 - num2;

    return resultado;
}
double multi(double num1, double num2)
{
    double resultado = 0;
    resultado = num1 * num2;

    return resultado;
}
double div(double num1, double num2)
{
    double resultado = 0;
    resultado = num1 / num2;
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
            if (opt == 1)
            {
                cout << "Su resultado es: " << suma(num1, num2) << endl
                     << endl
                     << endl;
            }
            else if (opt == 2)
            {
                cout << "Su resultado es: " << resta(num1, num2) << endl
                     << endl
                     << endl;
            }
            else if (opt == 3)
            {
                cout << "Su resultado es: " << multi(num1, num2) << endl
                     << endl
                     << endl;
            }
            else if (opt == 4)
            {
                cout << "Su resultado es: " << div(num1, num2) << endl
                     << endl
                     << endl;
            }
        }
        else
        {
            cout << "Un error ha ocurrido seleccione una opción dentro del rango." << endl;
        }
    }
    return 0;
}