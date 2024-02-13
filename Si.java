/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.si;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jona
 */
public class Si {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        while(!salir){
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Salir.");
            
            try{
                opcion = sn.nextInt();
                switch(opcion){
                    case 1:
                        float num1, num2, suma;
                        System.out.println("Ingrese el primer digito:");
                        num1 = sn.nextFloat();
                        System.out.println("Ingrese el segundo digito:");
                        num2 = sn.nextFloat();
                        suma = num1 + num2;
                        System.out.println("El resultado de la suma es de: "+suma);
                        System.out.println("");
                        break;
                    case 2:
                        float num3, num4, resta;
                        System.out.println("Ingrese el primer digito:");
                        num3 = sn.nextFloat();
                        System.out.println("Ingrese el segundo digito:");
                        num4 = sn.nextFloat();
                        resta = num3 - num4;
                        System.out.println("El resultado de la resta es de: "+resta);
                        System.out.println("");
                        break;
                    case 3:
                        float num5, num6, mult;
                        System.out.println("Ingrese el primer digito:");
                        num5 = sn.nextFloat();
                        System.out.println("Ingrese el segundo digito:");
                        num6 = sn.nextFloat();
                        mult = num5 * num6;
                        System.out.println("El resultado de la multiplicacion es de: "+mult);
                        System.out.println("");
                        break;
                    case 4:
                        float num7, num8, div;
                        System.out.println("Ingrese el primer digito:");
                        num7 = sn.nextFloat();
                        System.out.println("Ingrese el segundo digito:");
                        num8 = sn.nextFloat();
                        div = num7 / num8;
                        System.out.println("El resultado de la division es de: "+div);
                        System.out.println("");
                        break;
                    case 5:
                        salir=true;
                        break;
                    default:
                        System.out.println("Ingrese solo numeros entre 1 y 5.");

                }

            }   catch (InputMismatchException e){
                    System.out.println("Solo numeros.");
                    sn.next();
                }
        }
    }
}
