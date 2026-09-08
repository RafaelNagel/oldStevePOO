package classes;

public class Picareta {
    private String material;
    private int durabilidade;
    private int forca;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

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
