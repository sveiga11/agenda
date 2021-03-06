package com.company;

public class Mensaje {
    void mostrarError(String texto){
        printBefore();
        System.out.println("\033[31m" + texto + "\033[0m");
        printAfter();
    }

    void mostrarOpcion(String texto){
        printBefore();
        System.out.println("\033[32m" + texto + "\033[0m");
        printAfter();
    }

    void mostrarInfo(String texto){
        printBefore();
        System.out.println("\033[35m" + texto + "\033[0m");
        printAfter();
    }

    void printBefore(){
        System.out.println();
    }

    static void printAfter(){
        System.out.println();
        System.out.println();
    }
}
