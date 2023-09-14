#include <iostream>

using namespace std;

int main()
{
    int num1, num2;
    cout << "Ingrese un numero: " << endl;
    cin >> num1;

    cout << "Ingrese otro numero: " << endl;
    cin >> num2;

    if (num1 % num2 == 0)
    {
        cout << "Sus numeros son divisibles entre si" << endl;
    }
    else
    {
        cout << "Sus numeros NO son divisibles entre si" << endl;
    }
    return 0;
}