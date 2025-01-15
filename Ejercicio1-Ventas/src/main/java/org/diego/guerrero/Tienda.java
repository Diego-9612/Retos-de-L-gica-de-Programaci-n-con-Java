package org.diego.guerrero;

import java.util.Scanner;
/*
Array con 30 ventas del mes, y que diga cuáles y cuántas son mayores que $2000. */
public class Tienda {

    // Array para almacenar las ventas
    public double ventas[] = new double[30];

    // Método para agregar y procesar las ventas
    public void agregarVentas() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las 30 ventas del mes:");

        // Llenar el arreglo de ventas
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + (i + 1) + ":");
            ventas[i] = sc.nextDouble();
        }

        // Contar y mostrar las ventas mayores o iguales a $20,000
        int total = 0;
        System.out.println("Ventas mayores o iguales a $20,000 pesos:");

        for (int k = 0; k < ventas.length; k++) {
            if (ventas[k] >= 20000) {
                System.out.println("$" + ventas[k]);
                total++;
            }
        }

        // Mostrar el total de ventas mayores o iguales a $20,000
        System.out.println("Las ventas con un valor mayor a $20,000 pesos son: " + total);
    }
}
