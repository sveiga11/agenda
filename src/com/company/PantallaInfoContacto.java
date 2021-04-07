package com.company;

public class PantallaInfoContacto {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("     Información del contacto      ");

        System.out.println("Escriba alguna refeencia del contacto del que quiere ver la informacion: ");
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
            InfoContacto infoContacto = new InfoContacto();
            infoContacto.mostrar(foundcontacto);
        }
    }
}
