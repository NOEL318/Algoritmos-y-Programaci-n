#include <iostream>

using namespace std;

int main(){
float angulo;
cout<<"Ingrese el angulo:"<<endl;
cin>>angulo;
if(angulo<90){
    cout<<"Tu angulo es Agudo"<<endl;
}
else if(angulo>90){
    cout<<"Tu angulo es Obtuso"<<endl;
}
else if(angulo==90){
    cout<<"Tu angulo es Recto"<<endl;
}
    return 0;
}