package main;

import clasesOP.Akainu;
import clasesOP.Luffy;
import clasesOP.Tralfgar;

public class Main {
    public static void main(String[] args) {
        Luffy luffy = new Luffy("Luff","D. Monkey");
        Akainu akainu= new Akainu("Akainu","El perforador");
        Tralfgar tralfgar= new Tralfgar("Tralgar","D.");

        luffy.atacar();
        akainu.atacar();
        tralfgar.atacar();

        System.out.println();

        luffy.mostrarHabilidad();
                akainu.mostrarHabilidad();
                tralfgar.mostrarHabilidad();

        System.out.println("");

        luffy.hablar();
                akainu.hablar();
                tralfgar.hablar();

        luffy.buscarElOnePiece();
                akainu.detenerPiratas();
                tralfgar.buscarElOnePiece();
    }
}
