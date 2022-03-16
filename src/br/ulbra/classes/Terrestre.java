package br.ulbra.classes;

public class Terrestre extends Veiculo {
    
    private int numRodas;
    private int numAirBags;

    public Terrestre(int numRodas, int numAirBags, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numRodas = numRodas;
        this.numAirBags = numAirBags;
    }

    public int getNumRodas() {
        return numRodas;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getNumAirBags() {
        return numAirBags;
    }
    public void setNumAirBags(int numAirBags) {
        this.numAirBags = numAirBags;
    }
    
    public void andar(){
        System.out.println("Galão");
    }
    public void freiar(){
        System.out.println("Riiii");
    }
    public void buzinar(){
        System.out.println("Poin");
    }

    @Override
    public String toString() {
        return "Terrestre{" + "numRodas=" + numRodas + ", numAirBags=" + numAirBags + '}';
    }
    
}
