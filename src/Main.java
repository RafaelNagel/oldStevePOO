import classes.FabricaPicaretas;
import classes.Picareta;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║ VELHO STEVE - FÁBRICA DE PICARETAS ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        Picareta p1 = FabricaPicaretas.fabricar("madeira", 50, 5);
        Picareta p2 = FabricaPicaretas.fabricar("pedra", 70, 8);
        Picareta p3 = FabricaPicaretas.fabricar("ferro", 100, 12);

        System.out.println("\nPicaretas fabricadas:");
        System.out.println(" • " + p1);
        System.out.println(" • " + p2);
        System.out.println(" • " + p3);
        System.out.println("\nUsando picareta de ferro para minerar...");

        p3.minerar(30);
        p3.minerar(20);

        System.out.println("\nCriando picareta de ouro...");

        Picareta p4 = FabricaPicaretas.fabricar("ouro", 30, 15);

        System.out.println("\nReparando a picareta de ferro...");

        p3.reparar(50);

        System.out.println("\nCriando picaretas de esmeralda e netherite...");

        Picareta p5 = FabricaPicaretas.fabricar("esmeralda", 110, 15);
        Picareta p6 = FabricaPicaretas.fabricar("netherite", 150, 20);


        System.out.println("\nEstado final das picaretas:");
        System.out.println(" • " + p1);
        System.out.println(" • " + p2);
        System.out.println(" • " + p3);
        System.out.println(" • " + p4);
        System.out.println(" • " + p5);
        System.out.println(" • " + p6);
    }
}