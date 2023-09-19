#include <iostream>
using namespace std;
int main()
{
    int limit;
    cout << "Ingresa el numero límite de la Serie de Fibonacci" << endl;
    cin >> limit;
    int bucket;
    int i = 0;
    while (i <= limit)
    {
        bucket = bucket + i;
        cout << "El acumulado es de: " << bucket << endl;
        i++;
    }
    return 0;
}
