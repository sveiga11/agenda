package com.company;

public class PantallaListar {
    void mostrar(){
        System.out.println();
        System.out.println("\033[30m" + "\033[44m" + "······························" + "\033[0m");
        System.out.println("\033[30m" + "\033[44m" + "|     Lista de contactos     |" + "\033[0m");
        System.out.println("\033[30m" + "\033[44m" + "······························" + "\033[0m");
        System.out.println("\033[30m");

        for(Contacto contacto: Main.agendaContactos.contactos){
            if (contacto.nombre == null){
            } else {
                System.out.print(contacto.nombre + " ");
            }
            if (contacto.nombre == null){
            } else {
                System.out.println(contacto.apellidos);
            }        }

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("Que desea hacer a continuacion");

        Menu menu = new Menu();
        String[] opciones = {"Ver informacion del contacto", "Editar contacto de la lista", "Nuevo contacto", "Eliminar contacto", "Volver al menu principal"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaInfoContacto pantallaInfoContacto = new PantallaInfoContacto();
            pantallaInfoContacto.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
        } else if("3".equals(opcion)){
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("4".equals(opcion)){
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("5".equals(opcion)){
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }
    }
}
