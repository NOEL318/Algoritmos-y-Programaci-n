#include <iostream>
using namespace std;
int bucket;
int suma = 1;
int sumaa = 0;
int i = 0;
int fibonacci(int limit)
{
    if (i < limit)
    {
        bucket = suma + sumaa;
        sumaa = suma;
        suma = bucket;
        cout << "El acumulado es de: " << bucket << endl;
        i++;
       return fibonacci(limit);
    }
    else
    {
        return 0;
    }
}
int main()
{
    int limit;
    cout << "Ingresa el numero límite de la Serie de Fibonacci" << endl;
    cin >> limit;
    fibonacci(limit);
    return 0;
}
