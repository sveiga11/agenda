package com.company;

import java.util.Scanner;

public class InfoContacto {
    void mostrar(Contacto contacto) {
        System.out.println("······························");
        System.out.println("|  Informacion del contacto  |");
        System.out.println("······························");

            System.out.print(contacto.nombre + " ");
            System.out.print(contacto.apellidos + " ");
            System.out.print(contacto.nummovil + " ");
            System.out.print(contacto.numfijo + " ");
            System.out.println(contacto.correo);

        String turnListado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Presiona enter para volver al listado de contactos: ");
        try {
            turnListado = teclado.nextLine();
        } catch (Exception e) {
        }

    }
}
