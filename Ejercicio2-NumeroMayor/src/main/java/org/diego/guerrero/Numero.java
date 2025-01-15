package org.diego.guerrero;

import java.util.Scanner;

public class Numero {

    public int array[] = new int[5];

    public void NumeroMayor(){
        int mayor = array[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 5 Numeros aleatorios");
        for(int i =0; i < array.length; i++){
            array[i] = sc.nextInt();

            if (array[i] > mayor){
                mayor = array[i];
            }
        }
        System.out.println("El numero mayor del array es:" + mayor);
    }
}
