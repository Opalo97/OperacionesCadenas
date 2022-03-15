package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una frase (intro para terminar):");
        String texto = entrada.nextLine();

        System.out.println("MENÚ: ");
        System.out.println("==================================");
        System.out.println("1.- Contar palabras.");
        System.out.println("2.- Iniciales.");
        System.out.println("3.- Sustituir carácter.");
        System.out.println("4.- Al revés.");
    }
}
