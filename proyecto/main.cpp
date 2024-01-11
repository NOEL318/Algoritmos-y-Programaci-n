// Tuve que usar punteros para un mejor manejo de los arreglos ya que al ser arreglos bidimensionales definidos por usuario tengo que usar la aritmetica de punteros con arreglos.
#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;
int **matriz1;
int **matriz2;
int **matriz_auxiliar;
int xvar1, xvar2, yvar1, yvar2;
int det = 0;

void printMessage(string message, int fg, int bg, string line_break)
{
     /*B para antes y A para despues*/
     // Types:
     // Colores de acuerdo al ANSI ESCAPE CODE
     // FG BG
     // 30 40 Negro
     // 91 101 Red brillant
     // 92 102 Green brillant
     // 93 103 Yellow brillant
     // 94 104 Blue brillant
     // 95 105 Magenta brillant
     // 96 106 Cyan brillant
     // 97 107 White brillant
     if (line_break == "B" || line_break == "BA")
     {
          cout << endl;
     }
     cout
         << "\x1b[" << fg << ";" << bg << "m"
         << message
         << "\x1b[0m" << endl;
     if (line_break == "A" || line_break == "BA")
     {
          cout << endl;
     }
}

void getarray(string tipo)
{
     // Pedir dimensiones de arrays
     cout << "Ingrese la cantidad de X en su matriz 1: " << endl;
     cin >> xvar1;
     cout << "Ingrese la cantidad de Y en su matriz 1: " << endl;
     cin >> yvar1;
     if (tipo == "O")
     {
          cout << "Ingrese la cantidad de X en su matriz 2: " << endl;
          cin >> xvar2;
          cout << "Ingrese la cantidad de Y en su matriz 2: " << endl;
          cin >> yvar2;
     }
     else if (tipo == "E")
     {
          xvar2 = xvar1;
          yvar2 = yvar1;
     }
     else if (tipo == "C")
     {
          do
          {
               cout << "Ingrese la cantidad de X en su matriz 2: " << endl;
               cin >> xvar2;
               cout << "Ingrese la cantidad de Y en su matriz 2: " << endl;
               cin >> yvar2;
               if (xvar1 != yvar2)
               {
                    printMessage("Error - Sus filas y columnas deben tener al menos 1 fila del mismo numero de elementos", 97, 101, "BA");
               }
          } while (xvar1 != yvar2);
     }

     // Puntear memoria de los arreglos relacion int-puntero-puntero
     matriz1 = new int *[yvar1];
     for (int i = 0; i < yvar1; ++i)
     {
          matriz1[i] = new int[xvar1];
     }
     matriz2 = new int *[yvar2];
     for (int i = 0; i < yvar2; ++i)
     {
          matriz2[i] = new int[xvar2];
     }
     matriz_auxiliar = new int *[yvar1];
     for (int i = 0; i < yvar1; ++i)
     {
          matriz_auxiliar[i] = new int[xvar1];
     }
     // Llenar los arreglos
     for (int i = 0; i < yvar1; i++)
     {
          for (int e = 0; e < xvar1; e++)
          {
               cout << "Ingrese el valor en la Matriz 1 en (" << e << ", " << i << "): " << endl;
               cin >> matriz1[i][e];
          }
     }
     for (int i = 0; i < yvar2; i++)
     {
          for (int e = 0; e < xvar2; e++)
          {
               cout << "Ingrese el valor en la Matriz 2 en (" << e << ", " << i << "): " << endl;
               cin >> matriz2[i][e];
          }
     }
}

void getDeterminante()
{
     for (int i = 0; i < xvar1; i++)
     {
          // detemrinante con el % para regresar a 0
          det = det + (matriz1[0][i] * (matriz1[1][(i + 1) % xvar1] * matriz1[2][(i + 2) % xvar1] - matriz1[1][(i + 2) % xvar1] * matriz1[2][(i + 1) % xvar1]));
     }
}

void getAdjunta()
{
     for (int i = 0; i < yvar1; i++)
     {
          for (int e = 0; e < xvar1; e++)
          {
               // dejo de contar las q no y hacerla adjunta
               matriz_auxiliar[e][i] = ((matriz1[(i + 1) % yvar1][(e + 1) % xvar1] * matriz1[(i + 2) % yvar1][(e + 2) % xvar1]) - (matriz1[(i + 1) % yvar1][(e + 2) % xvar1] * matriz1[(i + 2) % yvar1][(e + 1) % xvar1]));
          }
     }
}

void printMatriz(int chosen)
{
     for (int i = 0; i < yvar1; i++)
     {
          for (int e = 0; e < xvar1; e++)
          {
               if (chosen == 1)
               {
                    cout << "[" << matriz1[i][e] << "]";
               }
               else if (chosen == 2)
               {
                    cout << "[" << matriz2[i][e] << "]";
               }
               else if (chosen == 3)
               {
                    cout << "[" << matriz_auxiliar[i][e] << "]";
               }
               else if (chosen == 4)
               {
                    cout << "[" << matriz_auxiliar[i][e] / det << "]";
               }
          }
          cout << endl;
     }
}

int main()
{
     while (1)
     {
          int opt = 0;
          printMessage("Bienvenido al programa que hace operaciones con matrices", 30, 107, "BA");
          printMessage("1 - Suma", 35, 40, "A");
          printMessage("2 - Resta", 36, 40, "A");
          printMessage("3 - Multiplicacion", 92, 40, "A");
          printMessage("4 - Adjunta", 93, 40, "A");
          printMessage("5 - Transpuesta", 94, 40, "A");
          printMessage("6 - Determinante", 95, 40, "A");
          printMessage("7 - Inversa", 96, 40, "A");
          printMessage("Seleccione una opcion: ", 30, 107, "B");
          if (scanf("%d", &opt) != 1)
          {
               printMessage("Error - Seleccione una opcion del menu", 97, 101, "BA");
               return 0;
          }
          if (system("cls"))
          {
               system("clear");
          }
          switch (opt)
          {
          case 1:
          {
               // Suma
               getarray("E");
               for (int i = 0; i < yvar1; i++)
               {
                    for (int e = 0; e < xvar2; e++)
                    {
                         matriz_auxiliar[i][e] = matriz1[i][e] + matriz2[i][e];
                    }
               }
               printMessage("La matriz sumada es:  ", 97, 105, "B");
               printMatriz(3);
               break;
          }
          case 2:
          {
               // Resta
               getarray("E");
               for (int i = 0; i < yvar1; i++)
               {
                    for (int e = 0; e < xvar2; e++)
                    {
                         matriz_auxiliar[i][e] = matriz1[i][e] - matriz2[i][e];
                    }
               }
               printMessage("La matriz sumada es:  ", 97, 105, "B");
               printMatriz(3);
               break;
          }
          case 3:
          {
               // Multiplicacion
               getarray("C");
               for (int i = 0; i < xvar1; ++i)
               {
                    for (int j = 0; j < yvar2; ++j)
                    {
                         matriz_auxiliar[i][j] = 0;
                    }
               }
               for (int i = 0; i < yvar1; i++)
               {
                    for (int e = 0; e < xvar2; e++)
                    {
                         for (int f = 0; f < xvar1; f++)
                         {
                              matriz_auxiliar[i][e] += matriz1[i][f] * matriz2[f][e];
                         }
                    }
               }
               printMessage("La matriz multiplicada es:  ", 97, 105, "B");
               printMatriz(3);
               break;
          }
          case 4:
          {
               // Adjunta
               getarray("A");
               getDeterminante();
               getAdjunta();
               if (det != 0)
               {
                    printMessage("Advertencia - La matriz es invertible y tiene Adjunta", 97, 105, "BA");
                    printMessage("Adjunta: ", 97, 105, "A");
                    printMatriz(3);
               }
               else
               {
                    printMessage("Advertencia - La matriz no es invertible y no tiene Adjunta", 97, 43, "BA");
               }
               break;
          }
          case 5:
          {
               // Transpuesta
               getarray("A");
               for (int i = 0; i < yvar1; i++)
               {
                    for (int e = 0; e < xvar1; e++)
                    {
                         matriz_auxiliar[e][i] = matriz1[i][e];
                    }
               }
               printMessage("La matriz Transpuesta es:  ", 97, 105, "B");
               printMatriz(3);
               break;
          }
          case 6:
          {
               // Determinante
               getarray("A");
               getDeterminante();
               printMessage("La Determinante de la matriz es:  " + to_string(det), 97, 105, "B");
               break;
          }
          case 7:
          {
               // Inversa
               getarray("A");
               getDeterminante();
               getAdjunta();
               if (det != 0)
               {
                    printMessage("La Inversa de la matriz es:  ", 97, 105, "B");
                    printMatriz(4);
               }
               else
               {
                    printMessage("Advertencia - Su matriz no tiene inversa", 97, 43, "BA");
               }
               break;
          }
          default:
               printMessage("Error - Seleccione una opcion del menu", 97, 101, "BA");
               break;
          }
     }
     return 0;
}