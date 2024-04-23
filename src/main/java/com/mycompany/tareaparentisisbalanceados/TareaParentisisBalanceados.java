/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaparentisisbalanceados;

import java.util.Scanner;

/**
 *
 * @author pabloispache
 */
public class TareaParentisisBalanceados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();

        while (true) {
            System.out.println("Ingrese una expresión matemática con paréntesis, corchetes y llaves:");
            String expresion = scanner.nextLine();

            if (!metodos.expresionValida(expresion)) {
                System.out.println("La expresión ingresada es inválida.");
                continue;
            }

            if (metodos.parentesisBalanceados(expresion)) {
                System.out.println("La expresión tiene paréntesis, corchetes y llaves balanceados.");
            } else {
                System.out.println("La expresión no tiene paréntesis, corchetes y llaves balanceados.");
            }

            System.out.println("¿Desea realizar otra validación? (S/N)");
            String respuesta = scanner.nextLine().toUpperCase();
            if (!respuesta.equals("S")) {
                break;
            }
        }

        System.out.println("¡Hasta luego!");
    }
}
