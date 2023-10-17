#include <iostream>
using namespace std;
int main()
{
    int valores[5] = {1, 2, 3, 4, 5};
    int segundo[5] = {};
    for (int i = 4, e = 0; i >= 0 && e < 5; i--, e++)
    {
        segundo[e] = valores[i];
    }
    for (int i = 0; i < 5; i++)
    {
        cout << segundo[i] << endl;
    }
    return 0;
}