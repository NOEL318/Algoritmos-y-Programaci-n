#include <iostream>

using namespace std;
int main()
{
    int continuar;
    int operacion;
    bool error = false;
    int retiro;
    int cambio;
    string db[6][5] = {
        {"0101", "Noel Rincón Anaya", "123456789101", "4777", "28938"},
        {"0202", "Juan Jose Lopez", "302932094839", "2409", "23"},
        {"0303", "Francisco Dracula Arreaga", "029091020393", "9023", "232434"},
        {"0404", "Benito Juarez Hernandez", "842473777884", "2843", "787"},
        {"0505", "Valentin Elizalde", "987654321101", "7775", "8574745"},
        {"6", "Valentin Elizalde", "1", "2", "80000"}
    };
    do
    {
        int billetes[] = {0, 0, 0, 0, 0};
        string usn;
        string nip;
        cout << "Ingrese su Numero de Tarjeta:" << endl;
        cin >> usn;
        cout << "Ingrese su NIP de Tarjeta:" << endl;
        cin >> nip;
        for (int i = 0; i < 6; i++)
        {
            if (db[i][2] == usn && db[i][3] == nip)
            {
                do
                {
                    cout << endl;
                    cout << "Bienvenido: " << db[i][1] << endl;
                    cout << endl;
                    cout << "Que operación desea hacer?" << endl
                         << endl;
                    cout << "1- Consulta de Saldo" << endl;
                    cout << "2- Retiro de Saldo" << endl;
                    cin >> operacion;
                    int saldo = stoi(db[i][4]);
                    switch (operacion)
                    {
                    case 1:
                        cout << "Consulta de Saldo:" << endl;
                        cout << endl;
                        cout << "Su saldo actual es de: $" << db[i][4] << " Mxn." << endl;
                        cout << endl;
                        break;
                    case 2:
                        cout << "Su saldo actual es de: $" << saldo << " Mxn." << endl;
                        cout << "Cuanto dinero desea retirar: ";
                        cin >> retiro;
                        cout << "Su saldo nuevo es: " << saldo - retiro << endl;
                        saldo = saldo - retiro;
                        db[i][4] = to_string(saldo);
                        cambio = retiro;
                        while (cambio > 0)
                        {
                            if (cambio >= 500)
                            {
                                billetes[4]++;
                                cambio = cambio - 500;
                            }
                            else if (cambio >= 200)
                            {
                                billetes[3]++;
                                cambio = cambio - 200;
                            }
                            else if (cambio >= 100)
                            {
                                billetes[2]++;
                                cambio = cambio - 100;
                            }
                            else if (cambio >= 50)
                            {
                                billetes[1]++;
                                cambio = cambio - 50;
                            }
                            else if (cambio >= 20)
                            {
                                billetes[0]++;
                                cambio = cambio - 20;
                            }
                        }
                        if (billetes[4])
                        {
                            cout << "Se darán " << billetes[4] << " De 500" << endl;
                        }
                        else if (billetes[3])
                        {
                            cout << "Se darán " << billetes[3] << " De 200" << endl;
                        }
                        else if (billetes[2])
                        {
                            cout << "Se darán " << billetes[2] << " De 100" << endl;
                        }
                        else if (billetes[1])
                        {
                            cout << "Se darán " << billetes[1] << " De 50" << endl;
                        }
                        else if (billetes[0])
                        {
                            cout << "Se darán " << billetes[0] << " De 20" << endl;
                        }
                        cout << "Tome su dinero de la bandeja!" << endl
                             << endl;
                        break;
                    default:
                        cout << "Seleccione una opción válida";
                        break;
                    }
                    cout << "Desea Continuar en la sesión? 1=Si----0=No" << endl;
                    cin >> continuar;
                    error = 0;
                } while (continuar != 1 && continuar != 0);
            }
            else
            {
                error = true;
            }
        }
        if (error == true)
        {
            cout << "Sus Credenciales no coinciden!" << endl;
        }
        continuar = 1;
    } while (continuar == 1);

    return 0;
}