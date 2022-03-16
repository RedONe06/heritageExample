package br.ulbra.classes;

public class Anfibio extends Veiculo {
    
    private int numQuilhas;
    private int numColetes;

    public Anfibio(int numQuilhas, int numColetes, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numQuilhas = numQuilhas;
        this.numColetes = numColetes;
    }

    public int getNumQuilhas() {
        return numQuilhas;
    }
    public void setNumQuilhas(int numQuilhas) {
        this.numQuilhas = numQuilhas;
    }

    public int getNumColetes() {
        return numColetes;
    }
    public void setNumColetes(int numColetes) {
        this.numColetes = numColetes;
    }

    public void andar(){
        System.out.println("Splesh");
    }
    public void freiar(){
        System.out.println("Hselps");
    }
    public void buzinar(){
        System.out.println("Sheeé");
    }

    @Override
    public String toString() {
        return "Anfibio{" + "numQuilhas=" + numQuilhas + ", numColetes=" + numColetes + '}';
    }

}
