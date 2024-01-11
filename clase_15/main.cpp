#include <iostream>
using namespace std;

void binario(int n)
{
    if (n > 0)
    {
        binario(n / 2);
        cout << n % 2;
    }
}

int main()
{
    cout<<"Ingresa un numero: "<<endl;
    int n;
    cin>>n;
    binario(n);
    return 0;
}