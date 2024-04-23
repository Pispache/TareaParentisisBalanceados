/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaparentisisbalanceados;

import java.util.Stack;

/**
 *
 * @author Victor
 */
public class Metodos {
     public boolean parentesisBalanceados(String cadena) {
        Stack<Character> pila = new Stack<>();

        // Iterar sobre cada carácter en la expresión
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Si es un paréntesis de apertura, lo agregamos a la pila
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            }
            // Si es un paréntesis de cierre
            else if (caracter == ')' || caracter == ']' || caracter == '}') {
                // Si la pila está vacía o el paréntesis de cierre no coincide con el último paréntesis de apertura
                if (pila.isEmpty() || !parIgual(pila.pop(), caracter)) {
                    return false; // Los paréntesis, corchetes o llaves no están balanceados
                }
            }
            // Ignoramos otros caracteres
        }

        // Si la pila está vacía al final, los paréntesis, corchetes y llaves están balanceados
        return pila.isEmpty();
    }

    // Método auxiliar para verificar si los paréntesis, corchetes y llaves son iguales y coinciden
    private boolean parIgual(char parApertura, char parCierre) {
        return (parApertura == '(' && parCierre == ')') ||
               (parApertura == '[' && parCierre == ']') ||
               (parApertura == '{' && parCierre == '}');
    }

    // Método para verificar si la expresión es válida antes de verificar el balance de paréntesis, corchetes y llaves
    public boolean expresionValida(String cadena) {
        int contadorParentesis = 0;
        for (char c : cadena.toCharArray()) {
            if (c == '(' || c == ')') {
                contadorParentesis += (c == '(') ? 1 : -1;
                if (contadorParentesis < 0) {
                    return false; // Exceso de paréntesis de cierre
                }
            }
        }
        return contadorParentesis == 0;
    }
}
