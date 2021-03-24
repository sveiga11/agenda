package com.company;

public class PantallaMenu {
    boolean mostrar(){

        System.out.println("······························");
        System.out.println("|     AGENDA DE CONTACTOS    |");
        System.out.println("······························");


        Menu menu = new Menu();
        String[] opciones = {"Nuevo contacto", "Listar contactos", "Editar contacto" ,"Eliminar contacto", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("2".equals(opcion)){
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if("3".equals(opcion)){
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
        } else if("4".equals(opcion)){
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("5".equals(opcion)){
            return false;
        }
        return true;
    }
}
