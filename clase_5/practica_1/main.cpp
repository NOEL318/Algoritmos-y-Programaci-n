#include <iostream>
using namespace std;
int main()
{
    for (int i = 0; i < 5; i++)
    {
        for (int e = 0; e <= i; e++)
        {
            cout << "*";
        }
        cout << endl;
    }
    for (int i = 5; i >=0; i--)
    {
        for (int e = 0; e <= i; e++)
        {
            cout << "*";
        }
        cout << endl;
    }
    return 0;
}