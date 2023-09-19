#include <iostream>

using namespace std;

int main()
{
    int limit;
    cout << "Ingresa el numero límite de la Serie de Fibonacci" << endl;
    cin >> limit;
    int bucket;

    for (int i = 0; i <= limit; i++)
    {
        bucket = bucket + i;
        cout << "El acumulado es de: " << bucket << endl;
    }
    return 0;
}
