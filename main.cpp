#include <iostream>
#include <unistd.h>

using namespace std;
int main()
{
    int seconds, minutes, hours, days, month, years;
    int month_days[13] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    cout << "\nIngrese Los Segundos Actuales: ";
    cin >> seconds;
    cout << "\nIngrese Los Minutos Actuales: ";
    cin >> minutes;
    cout << "\nIngrese La Hora Actual: ";
    cin >> hours;
    cout << "\nIngrese El Dia Actual: ";
    cin >> days;
    cout << "\nIngrese El Mes Actual: ";
    cin >> month;
    cout << "\nIngrese El Año Actual: ";
    cin >> years;

    while (1)
    {
        usleep(1000000);
        seconds + 1;
        if (seconds >= 60)
        {
            seconds = 0;
            minutes ++;
            cout << years << ' ' << month << ' ' << days << ' ' << ':' << minutes << ':' << seconds << '\n';
            if (minutes == 60)
            {
                minutes = 0;
                hours ++;
                if (hours == 24)
                {
                    hours = 0;
                    days ++;
                    if (days - 1 == month_days[month])
                    {
                        month ++;
                        days = 1;
                        if (month == 13)
                        {
                            month = 1;
                            years ++;
                        }
                    }
                }
            }
        }
        else{
            cout << years << '/' << month << '/' << days << ' ' << hours <<':' << minutes << ':' << seconds << '\n';
            seconds++;
        }
    }

    return 0;
}