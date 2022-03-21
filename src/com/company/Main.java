package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, palabras;
        char letra, letraOrg, letraChange;

        System.out.println("Escribe una frase (intro para terminar):");
        String texto = entrada.nextLine();

       do {
           System.out.println("MENÚ: ");
           System.out.println("==================================");
           System.out.println("1.- Contar palabras.");
           System.out.println("2.- Iniciales.");
           System.out.println("3.- Sustituir carácter.");
           System.out.println("4.- Al revés.");
           System.out.println("0.- Salir.");
           System.out.println();
           System.out.println("Elige una opción: ");
           opcion = entrada.nextInt();
           entrada.nextLine();

           switch (opcion) {
               case 1:
                   palabras = 1;
                   for (int i = 0; i < texto.length(); i++) {
                       if (texto.charAt(i) == ' ') {
                           palabras++;
                       }
                   }
                   System.out.println("Número de palabras: " + palabras);
                   break;
               case 2:
                   letra = ' ';
                   System.out.print("Las iniciales son: " + texto.toUpperCase().charAt(0));
                   for (int i = 1; i < texto.length(); i++) {
                       if (texto.charAt(i) == ' ') {
                           letra = texto.toUpperCase().charAt(i + 1);
                           System.out.print(letra);
                       }
                   }
                   System.out.println();
                   break;
               case 3:
                   System.out.print("¿Qué caracter quieres cambiar?: ");
                   letraOrg = entrada.nextLine().charAt(0);
                   System.out.print("¿Porqué caracter lo quieres cambiar?: ");
                   letraChange = entrada.nextLine().charAt(0);
                   for (int i = 0; i < texto.length(); i++) {
                       if (letraOrg == texto.charAt(i)) {
                           System.out.print(letraChange);
                       } else {
                           System.out.print(texto.charAt(i));
                       }
                   }
                   System.out.println();
                   break;
               case 4:
                   for (int i = texto.length() - 1; i >= 0; i--) {
                       System.out.print(texto.charAt(i));
                   }
                   System.out.println();
                   break;
               case 0:
                   System.out.println("¡HASTA PRONTO!");
                   break;
           }

           System.out.println("Intro para continuar...");
           entrada.nextLine();
   } while (opcion != 0);
    }
}
