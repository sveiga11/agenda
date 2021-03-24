package com.company;

import java.util.Scanner;

public class Eliminar {
    void mostrar(Contacto contacto) {

        System.out.println("······························");
        System.out.println("|      Eliminar contacto       |");
        System.out.println("······························");

        Scanner VerifyEliminar = new Scanner(System.in);
        System.out.print("\033[31m" + "Una vez eliminado el contacto no habra manera de " +
                "recuperarlo, esta seguro de eliminar el contacto?(S/N): " + "\033[0m");
        String next = VerifyEliminar.next();

        if (next.equals("S") || next.equals("s")){
            contacto.nombre = null;
            contacto.apellidos = null;
            contacto.nummovil = null;
            contacto.numfijo = null;
            contacto.correo = null;

            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Contacto Eliminado!");
        } else if (next.equals("N") || next.equals("n")){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Operacion cancelada...");
        }

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("¿Que desea hacer a continuacion?");

        Menu menu = new Menu();
        String[] opciones = {"Listar Contactos", "Volver al menu principal"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if("2".equals(opcion)){
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }
    }
}
