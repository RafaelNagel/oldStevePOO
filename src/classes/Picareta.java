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

    @Override
    public String toString() {
        return "material: '" + material + '\'' +
                ", durabilidade: " + durabilidade +
                ", forca: " + forca;
    }
}
