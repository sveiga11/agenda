package com.company;

public class PantallaEditar {
    void mostrar() {
        System.out.println("······························");
        System.out.println("|      Editar contacto       |");
        System.out.println("······························");

        System.out.println("Escriba alguna refeencia del contacto que desea editar: ");
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
            Editar editar = new Editar();
            editar.mostrar(foundcontacto);
        }
    }
}
