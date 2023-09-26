#include <iostream>
using namespace std;
int main()
{
    int limit;
    cout << "Ingresa el numero límite de la Serie de Fibonacci" << endl;
    cin >> limit;
    int bucket;
    int suma=1;
    int sumaa=0;
    int i = 0;
    while (i <= limit)
    {

        bucket = suma + sumaa;
        sumaa = suma;
        suma = bucket;
        cout << "El acumulado es de: " << bucket << endl;
        i++;
    }
    return 0;
}
