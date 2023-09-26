#include <iostream>
using namespace std;
int main()
{
    int num1;
    int num2;
    cout << "Ingrese un numero: " << endl;
    cin >> num1;
    cout << "Ingrese otro numero: " << endl;

    cin >> num2;

    if (num1 > num2)
    {
        for (int i = num2; i <= num1; i++)
        {
            if (i % 2 == 0)
            {
                cout << i << " Es par" << endl;
            }
            else
            {
                cout << i << " Es impar" << endl;
            }
        }
    }
    else
    {
        for (int i = num1; i <= num2; i++)
        {
            if (i % 2 == 0)
            {
                cout << i << " Es par" << endl;
            }
            else
            {
                cout << i << " Es impar" << endl;
            }
        }
    }
}