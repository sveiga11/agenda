package com.company;

public class PantallaListar {
    void mostrar(){
        System.out.println("······························");
        System.out.println("|     Lista de contactos     |");
        System.out.println("······························");

        for(Contacto contacto: Main.agendaContactos.contactos){
            System.out.print(contacto.nombre + " ");
            System.out.println(contacto.apellidos);
        }

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("Que desea hacer a continuacion");

        Menu menu = new Menu();
        String[] opciones = {"Ver informacion del contacto", "Editar contacto de la lista", "Nuevo contacto", "Volver al menu principal"};
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
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }
    }
}
