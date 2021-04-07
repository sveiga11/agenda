package com.company;

public class PantallaEliminar {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("         Eliminar Contacto         ");

        System.out.println("Escriba el nombre del contacto que desea eliminar: ");
        String search = Main.scanner.nextLine();
        boolean found = false;
        Contacto foundcontacto = null;

        for(Contacto contacto: Main.agendaContactos.contactos){
            if (contacto.nombre.equals(search)) {
                found = true;
                foundcontacto = contacto;
            }
        }
        if (!found){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarError("Contacto no existente");

            mensaje.mostrarOpcion("Que desea hacer a continuacion");

            Menu menu = new Menu();
            String[] opciones = {"Lista de contactos", "Eliminar otro contacto", "Volver al menu principal"};
            String opcion = menu.elegirOpcion(opciones);

            if ("1".equals(opcion)) {
                PantallaListar pantallaListar = new PantallaListar();
                pantallaListar.mostrar();
            } else if ("2".equals(opcion)) {
                PantallaEliminar pantallaEliminar = new PantallaEliminar();
                pantallaEliminar.mostrar();
            } else if("3".equals(opcion)){
                PantallaMenu pantallaMenu = new PantallaMenu();
                pantallaMenu.mostrar();
            }
        }
        else {
            Eliminar eliminar = new Eliminar();
            eliminar.mostrar(foundcontacto);
        }
    }
}

