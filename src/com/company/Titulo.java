package com.company;

public class Titulo {
    void mostrar(String titulo){
        System.out.println("\u001B[30m" + "\u001B[44m" + "╔═══════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\u001B[30m" + "\u001B[44m" + "║" + titulo + "║" + "\u001B[0m");
        System.out.println("\u001B[30m" + "\u001B[44m" + "╚═══════════════════════════════════╝" + "\u001B[0m");
        System.out.println("\u001B[30m");
    }
}
