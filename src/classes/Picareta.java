package classes;

public class Picareta {
    private String material;
    private int durabilidade;
    private int forca;

    public Picareta(String material, int durabilidade, int forca) {
        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;
    }

    public void minerar(int blocos) {
        System.out.println("\n=== MINEIRANDO COM PICARETA DE " +
                material.toUpperCase() + "===");

        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Força: " + forca);
        System.out.println("Blocos a mineirar: " + blocos);

        if (durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
            return;
        }

        int blocosMineirados = 0;

        for (int i = 0; i < blocos; i++) {

            if (durabilidade <= 0) {
                System.out.println(
                        "Picareta quebrou no bloco " + (i + 1)
                );
                break;
            }

            durabilidade--;
            blocosMineirados++;
        }

        System.out.println("\nMinerados " + blocosMineirados + " blocos");
        System.out.println("Durabilidade restante: " + durabilidade);

        if (durabilidade <= 0) {
            System.out.println(
                    "A picareta de " + material + " quebrou completamente!"
            );
        }
    }

    public void reparar(int quantidade) {

        System.out.println(
                "\n=== REPARANDO PICARETA DE "
                        + material.toUpperCase() + "==="
        );

        System.out.println("Durabilidade atual: " + durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        int durabilidadeNova = durabilidade + quantidade;
        int limiteMaximo;

        switch (material.toLowerCase()) {
            case "madeira":
                limiteMaximo = 50;
                break;

            case "pedra":
                limiteMaximo = 70;
                break;

            case "ferro":
                limiteMaximo = 100;
                break;

            case "ouro":
                limiteMaximo = 30;
                break;

            case "esmeralda":
                limiteMaximo = 110;
                break;

            case "diamante":
                limiteMaximo = 130;
                break;

            case "netherite":
                limiteMaximo = 150;
                break;

            default:
                limiteMaximo = 60;
        }

        if (durabilidadeNova > limiteMaximo) {
            System.out.println("Reparo limitado a " + limiteMaximo);
            durabilidadeNova = limiteMaximo;
        }

        durabilidade = durabilidadeNova;

        System.out.println("Durabilidade nova: " + durabilidade);
    }

    public String getMaterial() {
        return material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public String toString() {
        return "Picareta de " + material +
                " (D: " + durabilidade + "," +
                " F: " + forca + ")";
    }
}
