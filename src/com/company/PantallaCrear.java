package com.company;

public class PantallaCrear {
    void mostrar() {
        System.out.println("······························");
        System.out.println("|      Añadir contacto       |");
        System.out.println("······························");

        Contacto contacto = new Contacto();
        boolean añadido = false;

        System.out.println("Nombre del contacto: ");
        contacto.nombre = Main.scanner.nextLine();

        System.out.println("Apellidos del contacto: ");
        contacto.apellidos = Main.scanner.nextLine();

        System.out.println("Numero del telefono movil del contacto: ");
        contacto.nummovil = Main.scanner.nextLine();

        System.out.println("Numero del telefono fijo del contacto: ");
        contacto.nummovil = Main.scanner.nextLine();

        System.out.println("Correo electronico del contacto: ");
        contacto.correo = Main.scanner.nextLine();

        añadido = true;

        if(añadido == true){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Contacto añadido a la agenda!");
        }

        Main.agendaContactos.contactos.add(contacto);

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpcion("¿Que desea hacer a continuacion?");

        Menu menu = new Menu();
        String[] opciones = {"Nuevo contacto", "Listar contactos", "Volver al menu principal"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("2".equals(opcion)){
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if("3".equals(opcion)){
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }
    }
    }
