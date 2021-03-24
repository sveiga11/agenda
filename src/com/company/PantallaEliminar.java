package com.company;

public class PantallaEliminar {
    void mostrar() {
        System.out.println("······························");
        System.out.println("|      Eliminar contacto     |");
        System.out.println("······························");

        System.out.println("Escriba alguna refeencia del contacto que desea eliminar: ");
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
        }
        else {
            Eliminar eliminar = new Eliminar();
            eliminar.mostrar(foundcontacto);
        }
    }
}

