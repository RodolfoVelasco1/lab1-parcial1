//Alumno: Rodolfo Nicolás Velasco Fessler
//Repositorio de GitHub: https://github.com/RodolfoVelasco1/lab1-parcial1
//Proyecto Jira: https://rodolfovelasco.atlassian.net/jira/software/projects/CAL/boards/2

//Laboratorio 1 - Parcial 1

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicar, respuesta;
        double division, numd1, numd2;
        while (true){
            System.out.println("¿Qué operación quiere realizar?");
            System.out.println("1. Suma | 2. Resta | 3. Multiplicación | 4. División | 0. SALIR");
            System.out.println("Ingrese el número de la operación deseada.");
            System.out.print("Respuesta: ");
            respuesta = sc.nextInt();
            if (respuesta == 1) {
                System.out.print("Ingrese un número: ");
                num1 = sc.nextInt();
                System.out.print("Ingrese otro número: ");
                num2 = sc.nextInt();
                suma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + suma);
                break;
            } else if (respuesta == 2) {
                System.out.print("Ingrese un número: ");
                num1 = sc.nextInt();
                System.out.print("Ingrese otro número: ");
                num2 = sc.nextInt();
                resta = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resta);
                break;
            } else if (respuesta == 3) {
                System.out.print("Ingrese un número: ");
                num1 = sc.nextInt();
                System.out.print("Ingrese otro número: ");
                num2 = sc.nextInt();
                multiplicar = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + multiplicar);
                break;
            } else if (respuesta == 4) {
                System.out.print("Ingrese un número: ");
                numd1 = sc.nextInt();
                System.out.print("Ingrese otro número: ");
                numd2 = sc.nextInt();
                division = numd1 / numd2;
                System.out.println(numd1 + " / " + numd2 + " = " + division);
                break;
            } else if (respuesta == 0){
                System.out.println("Muchas gracias por usar la calculadora. Vuelve pronto. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Error. Número incorrecto. Inténtelo de nuevo.");
            }
        }

    }
}