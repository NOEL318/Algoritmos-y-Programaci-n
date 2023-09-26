#include <iostream>
using namespace std;
int main()
{
    string passw;
    string cpassw;
    do
    {
        cout << "Ingrese su nueva contraseña: " << endl;
        cin >> passw;
        cout << "Confirme su nueva contraseña: " << endl;
        cin >> cpassw;
        if (passw != cpassw)
        {
            cout << "Las contraseñas no coinciden!" << endl;
        }
    } while (passw != cpassw);

    cout << "Nueva contraseña exitosa!" << endl;
    return 0;
}