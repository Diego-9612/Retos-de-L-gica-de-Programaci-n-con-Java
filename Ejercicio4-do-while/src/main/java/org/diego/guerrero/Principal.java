package org.diego.guerrero;

/*
Problema:

Crear un programa que este pidiendo numeros enteros, cuando se ingrese el nuemero 0
finalice la captura de datos.
Sumar los numero y mostrar el total de la suma
 */

import java.util.Scanner;

public class Principal {

    int suma = 0, num = 0;
    
    public void sumarNumeros(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero cualquiera");
            num = scanner.nextInt();
            suma = suma + num;

        } while (num != 0 );
            System.out.println("el total de la suma es:" + suma);
    }

}
