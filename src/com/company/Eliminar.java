package com.company;

public class Eliminar {
    void mostrar(Contacto contacto) {

        System.out.println("······························");
        System.out.println("|      Editar contacto       |");
        System.out.println("······························");

        System.out.println("Escriba el nuevo nombre del contacto: ");
        contacto.nombre = Main.scanner.nextLine();

        System.out.println("Escriba los nuevos apellidos del contacto: ");
        contacto.apellidos = Main.scanner.nextLine();

        System.out.println("Escriba el nuevo numero de telefono movil del contacto: ");
        contacto.nummovil = Main.scanner.nextLine();

        System.out.println("Escriba el nuevo numero de telefono fijo del contacto: ");
        contacto.nummovil = Main.scanner.nextLine();

        System.out.println("Escriba el nuevo correo electronico del contacto: ");
        contacto.correo = Main.scanner.nextLine();

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarInfo("Contacto actualizado!");

        mensaje.mostrarOpcion("¿Que desea hacer a continuacion?");

        Menu menu = new Menu();
        String[] opciones = {"Editar otro contacto", "Volver al menu principal"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
        } else if("2".equals(opcion)){
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }
    }
}
