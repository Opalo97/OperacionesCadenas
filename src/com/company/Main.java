package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, palabras;
        char letra;

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
                   for (int i = 0; i < texto.length(); i++) {
                       if (texto.charAt(i) == ' ') {
                           // no va xd.
                           letra = texto.charAt(' ' + i);
                       }
                   }
                   System.out.println("Las iniciales son: " + letra);
                   break;
               case 0:
                   System.out.println("¡HASTA PRONTO!");
                   break;
           }

           entrada.nextLine();
           System.out.println("Intro para continuar...");
           entrada.nextLine();
   } while (opcion != 0);
    }
}
