#include <iostream>
using namespace std;

double promedio(int limit, int lista[])
{
    double a;
    for (int i = 0; i < limit; i++)
    {
        a += lista[i];
    }
    return a / limit;
}
double minimo(int limit, int lista[])
{
    double a = lista[0];
    for (int i = 0; i < limit; i++)
    {
        if (lista[i] < a)
        {
            a = lista[i];
        }
    }
    return a;
}
double maximo(int limit, int lista[])
{
    double a = lista[0];
    for (int i = 0; i < limit; i++)
    {
        if (lista[i] > a)
        {
            a = lista[i];
        }
    }
    return a;
}
double moda(int limit, int lista[])
{
    int slista[limit];
    for (int i = 0; i < limit; i++)
    {
        for (int e = 0; e < limit; e++)
        {
            if (lista[i] == lista[e])
            {
                slista[i] += 1;
            }
        }
    }
    int a = slista[0];
    int index = 0;
    for (int i = 0; i < limit; i++)
    {
        if (slista[i] > a)
        {
            a = slista[i];
            index = i;
        }
    }
    return lista[index];
}

int main()
{
    int limite;
    cout << "Ingrese el tamaño de su lista: " << endl;
    cin >> limite;
    int matriz[limite];
    int tm[limite];
    for (int i = 0; i < limite; i++)
    {
        cout << "Ingrese el valor numero: " << i + 1 << endl;
        cin >> matriz[i];
    }
    cout << "Su promedio es: " << promedio(limite, matriz) << endl;
    cout << "Su valor minimo es: " << minimo(limite, matriz) << endl;
    cout << "Su valor maximo es: " << maximo(limite, matriz) << endl;
    cout << "Su valor moda es: " << moda(limite, matriz) << endl;
    return 0;
}