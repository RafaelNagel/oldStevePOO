import classes.Picareta;

public class Main {
    public static void main(String[] args) {
        Picareta picareta1 = new Picareta("Madeira", 50, 5);
        Picareta picareta2 = new Picareta("Pedra", 70, 7);
        Picareta picareta3 = new Picareta("Ferro", 100, 12);
        Picareta picareta4 = new Picareta("Ouro", 30, 10);
        Picareta picareta5 = new Picareta("Diamante", 130, 15);
        Picareta picareta6 = new Picareta("Netherite", 200, 20);

        System.out.println("Abaixo, todas as picaretas com seus devidos atributos: ");
        System.out.println(picareta1);
        System.out.println(picareta2);
        System.out.println(picareta3);
        System.out.println(picareta4);
        System.out.println(picareta5);
        System.out.println(picareta6);
    }
}