package com.company;

public class PantallaEditar {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("          Editar contacto          ");

        System.out.println("Escriba el nombre del contacto que desea editar: ");
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
            String[] opciones = {"Lista de contactos", "Editar otro contacto", "Volver al menu principal", "Salir"};
            String opcion = menu.elegirOpcion(opciones);

            if ("1".equals(opcion)) {
                PantallaListar pantallaListar = new PantallaListar();
                pantallaListar.mostrar();
            } else if ("2".equals(opcion)) {
                PantallaEditar pantallaEditar = new PantallaEditar();
                pantallaEditar.mostrar();
            } else if("3".equals(opcion)){
                PantallaMenu pantallaMenu = new PantallaMenu();
                pantallaMenu.mostrar();
            } else if("4".equals(opcion)){
                System.exit(0);}
        }
        else {
            Editar editar = new Editar();
            editar.mostrar(foundcontacto);
        }
    }
}
